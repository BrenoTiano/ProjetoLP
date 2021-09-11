/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;

/**
 *
 * @author onerb
 */
public class TesteConexao {
    public static void main(String args []){
        try {
            Conexao c = new Conexao();
            System.out.println("Conexao OK!");
            System.out.println("Inserindo dados na tabela funcionario");
           String sql="Insert into funcionario(id_func,nome,usuario,senha,cpf,cidade,rua,nro,"
                   + "bairro,cep,tipo)"
                   + "values('1','Breno Tiano','brenoti','22072002','46235814895','Meridiano','Donato M.B',"
                   + "2342,'Cohab','15625000','1')";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
           if(ps.executeUpdate()>0)
               System.out.println("Gravado!");
           else
               System.out.println("Não foi possível atualizar!");
        } catch (Exception e) {
            System.out.println("Erro na conexão!" + e.getMessage());
        }
        
    }
    
    
}
