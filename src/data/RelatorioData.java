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
import javax.swing.JOptionPane;
import model.Caminhao;
import model.Relatorio;
import model.Usuario;

/**
 *
 * @author onerb
 */
public class RelatorioData extends Conexao{
   public RelatorioData()throws SQLException, ClassNotFoundException{}
   
   public boolean incluir(Relatorio obj) throws Exception{
     String sql="Insert into relatorio (id_func,id_veic,diario) values (?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setInt(1, obj.getUsuario().getId());
       ps.setInt(2, obj.getCaminhao().getId());
       ps.setString(3, obj.getDiario());
       return ps.executeUpdate()>0;
   }
   public boolean editar(Relatorio obj) throws Exception{
     String sql="update relatorio set id_func=?,id_veic=?,diario=? where id_rel=?";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setInt(1, obj.getUsuario().getId());
       ps.setInt(2, obj.getCaminhao().getId());
       ps.setString(3, obj.getDiario());
       ps.setInt(4, obj.getId());
       return ps.executeUpdate()>0;
   }
   
   public ArrayList<Relatorio> Pesquisar(String pesq) throws Exception{
        ArrayList<Relatorio> lista = new ArrayList<>();
            String sql="select * from relatorio join funcionario on (relatorio.id_func = funcionario.id_func) join caminhao on (relatorio.id_veic = caminhao.id_veic) where nome like '"+pesq+"%'";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
          Relatorio obj = new Relatorio(rs.getInt("id_rel"),new Usuario(rs.getInt("id_func"),rs.getString("nome"),rs.getLong("cpf"),
                  rs.getString("cidade"), rs.getString("rua"),rs.getInt("nro"),rs.getString("bairro"),
                  rs.getLong("cep"),rs.getInt("tipo"),rs.getString("usuario"),rs.getString("senha"),
                  rs.getString("cnh"),rs.getString("formacao")),new Caminhao(rs.getInt("id_veic"),rs.getString("placa"),rs.getString("modelo"), rs.getString("chassi")),rs.getString("diario"));
          lista.add(obj);
        }
        return lista;
    }
   
   public boolean excluir(int id) throws Exception {
        String sql="Delete from relatorio where id_rel=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }
}
