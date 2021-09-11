/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pecas;
import model.Usuario;

/**
 *
 * @author onerb
 */
public class PecasData extends Conexao {
    public PecasData()throws SQLException, ClassNotFoundException{}
   public boolean incluir(Pecas obj) throws Exception{
     String sql="Insert into pecas (descricao,custo,preço_venda) values (?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, obj.getDescricao());
       ps.setFloat(2, obj.getCusto());
       ps.setFloat(3, obj.getPreco_venda());
       return ps.executeUpdate()>0;
   }
   public boolean editar(Pecas obj) throws Exception{
     String sql="update pecas set descricao=?,custo=?,preço_venda=? where id_peca =?";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, obj.getDescricao());
       ps.setFloat(2, obj.getCusto());
       ps.setFloat(3, obj.getPreco_venda());
       ps.setInt(4, obj.getId());
       return ps.executeUpdate()>0;
}
   
   public boolean excluir(int id) throws Exception{
      String sql="Delete from pecas where id_peca=?";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ps.setInt(1, id);
      return ps.executeUpdate()>0;
  }
   public ArrayList<Pecas> Pesquisar(String pesq) throws Exception{
        ArrayList<Pecas> lista = new ArrayList<>();
            String sql="select * from pecas where descricao like '"+pesq+"%'";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
          Pecas obj = new Pecas(rs.getInt("id_peca"),rs.getString("descricao"), 
                  rs.getFloat("custo"),rs.getFloat("preço_venda"));
            lista.add(obj);
}
return lista;

}
   
}
