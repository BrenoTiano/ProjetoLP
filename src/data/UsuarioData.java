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
import java.util.concurrent.ExecutionException;
import model.Usuario;

/**
 *
 * @author onerb
 */
public class UsuarioData extends Conexao{
    public UsuarioData()throws SQLException, ClassNotFoundException{}
   public boolean incluir(Usuario obj) throws Exception{
     String sql="Insert into funcionario (nome,usuario,senha,cpf,cidade,rua,nro,bairro,cep,tipo,formacao,cnh) values (?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement ps = getConexao().prepareStatement(sql);
//       ps.setInt(1, obj.getId());
       ps.setString(1, obj.getNome());
       ps.setString(2, obj.getUsuario());
       ps.setString(3, obj.getSenha());
       ps.setLong(4, obj.getCpf());
       ps.setString(5, obj.getCidade());
       ps.setString(6, obj.getRua());
       ps.setInt(7, obj.getNumero());
       ps.setString(8, obj.getBairro());
       ps.setLong(9, obj.getCep());
       ps.setInt(10, obj.getTipo());
       ps.setString(11, obj.getFormacao());
       ps.setString(12, obj.getCnh());
       return ps.executeUpdate()>0;
   }
   public boolean editar(Usuario obj) throws Exception{
     String sql="update funcionario set nome=?,usuario=?,senha=?,cpf=?,cidade=?,rua=?,nro=?,bairro=?,cep=?,tipo=?,formacao=?,cnh=? where id_func =?";
       PreparedStatement ps = getConexao().prepareStatement(sql);
       ps.setString(1, obj.getNome());
       ps.setString(2, obj.getUsuario());
       ps.setString(3, obj.getSenha());
       ps.setLong(4, obj.getCpf());
       ps.setString(5, obj.getCidade());
       ps.setString(6, obj.getRua());
       ps.setInt(7, obj.getNumero());
       ps.setString(8, obj.getBairro());
       ps.setLong(9, obj.getCep());
       ps.setInt(10, obj.getTipo());
       ps.setString(11, obj.getFormacao());
       ps.setString(12, obj.getCnh());
       ps.setInt(13, obj.getId());
       return ps.executeUpdate()>0;
   }
  public ArrayList<Usuario> Pesquisar(String pesq) throws Exception{
        ArrayList<Usuario> lista = new ArrayList<>();
            String sql="select * from funcionario where nome like '"+pesq+"%'";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        while(rs.next()){
          Usuario obj = new Usuario(rs.getInt("id_func"),rs.getString("nome"), 
                  rs.getLong("cpf"),rs.getString("cidade"),rs.getString("rua"),rs.getInt("nro"),
                  rs.getString("bairro"),rs.getLong("cep"),rs.getInt("tipo"),rs.getString("usuario"),rs.getString("senha"),
                  rs.getString("cnh"),rs.getString("formacao"));
            lista.add(obj);
}
return lista;
}
  public ArrayList<Usuario> carregarCombo() throws Exception{
      ArrayList<Usuario> lista = new ArrayList<>();
      String sql = "select * from funcionario order by nome";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while(rs.next()){
          Usuario c = new Usuario(rs.getInt("id_func"),rs.getString("nome"), 
                  rs.getLong("cpf"),rs.getString("cidade"),rs.getString("rua"),rs.getInt("nro"),
                  rs.getString("bairro"),rs.getLong("cep"),rs.getInt("tipo"),rs.getString("usuario"),rs.getString("senha"),
                  rs.getString("cnh"),rs.getString("formacao"));
          lista.add(c);
      }
      return lista;
  }
  public boolean excluir(int id) throws Exception{
      String sql="Delete from funcionario where id_func=?";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ps.setInt(1, id);
      return ps.executeUpdate()>0;
  }
  
//  public boolean validarUsuario(String usuario, String senha) throws Exception{
//      String sql ="SELECT * FROM tbusuarios where usuario = ? and senha = ?";
//      PreparedStatement ps = getConexao().prepareStatement(sql);
//      ps.setString(1, usuario);
//      ps.setString(2, senha);
//      ResultSet rs = ps.executeQuery();
//      if(rs.next())return true;
//      else return true;
//  }
  
   public Usuario validarUsuario(String usuario, String senha) throws Exception{
      String sql ="SELECT * FROM funcionario where usuario = ? and senha = ?";
      PreparedStatement ps = getConexao().prepareStatement(sql);
      ps.setString(1, usuario);
      ps.setString(2, senha);
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          Usuario obj = new Usuario();
          obj.setId(rs.getInt("id_func"));
          obj.setNome(rs.getString("nome"));
          obj.setUsuario(rs.getString("usuario"));
          obj.setSenha(rs.getString("senha"));
          obj.setCpf(rs.getLong("cpf"));
          obj.setCidade(rs.getString("cidade"));
          obj.setRua(rs.getString("rua"));
          obj.setNumero(rs.getInt("nro"));
          obj.setBairro(rs.getString("bairro"));
          obj.setCep(rs.getLong("cep"));
          obj.setTipo(rs.getInt("tipo"));
          obj.setFormacao(rs.getString("formacao"));   
          obj.setCnh(rs.getString("cnh"));      
          return obj;
      }
      else return null;
  }
}
