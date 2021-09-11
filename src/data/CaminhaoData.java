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
import model.Caminhao;

/**
 *
 * @author onerb
 */
public class CaminhaoData extends Conexao{
   public CaminhaoData()throws SQLException, ClassNotFoundException{}
   public boolean incluir(Caminhao obj) throws Exception{
     String sql="Insert into caminhao (placa,modelo,chassi) values (?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, obj.getPlaca());
       ps.setString(2, obj.getModelo());
       ps.setString(3, obj.getChassi());
       return ps.executeUpdate()>0;
   }
   public boolean editar(Caminhao obj) throws Exception{
     String sql="update caminhao set placa=?,modelo=?,chassi=? where id_veic =?";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, obj.getPlaca());
       ps.setString(2, obj.getModelo());
       ps.setString(3, obj.getChassi());
       ps.setInt(4, obj.getId());
       return ps.executeUpdate()>0;
}
   public boolean excluir(int id) throws Exception{
      String sql="Delete from caminhao where id_veic=?";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ps.setInt(1, id);
      return ps.executeUpdate()>0;
  }
   public ArrayList<Caminhao> Pesquisar(String pesq) throws Exception{
        ArrayList<Caminhao> lista = new ArrayList<>();
            String sql="select * from caminhao where modelo like '%"+pesq+"%'";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
          Caminhao obj = new Caminhao(rs.getInt("id_veic"),rs.getString("placa"), 
                  rs.getString("modelo"),rs.getString("chassi"));
            lista.add(obj);
}
return lista;

}
   public ArrayList<Caminhao> carregarCombo() throws Exception{
      ArrayList<Caminhao> lista = new ArrayList<>();
      String sql = "select * from caminhao order by placa";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while(rs.next()){
          Caminhao c = new Caminhao(rs.getInt("id_veic"),rs.getString("placa"), 
                  rs.getString("modelo"),rs.getString("chassi"));
          lista.add(c);
      }
      return lista;
  }
}
