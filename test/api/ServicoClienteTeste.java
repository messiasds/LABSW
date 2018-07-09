/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;


import api.modelo.Cliente;
import api.servico.ServicoCliente;
import core.dao.ClienteDAOMySQL;
import core.servico.ServicoClienteImp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author messias
 */



public class ServicoClienteTeste {
    
    private String usuario="root";
    private String senha="fatec";
    private Cliente cliente1,cliente2,cliente3;
    
    
    ServicoCliente clienteServ;
    ClienteDAOMySQL dao;
   
 
    @Before
    public void setUp() {
        
        
        limparBanco();
        
        
        cliente1= new Cliente();
        cliente1.setId(1);
        cliente1.setNome("teste1");
        cliente1.setEmail("teste@teste");
        cliente1.setSenha("123");
        
        cliente2= new Cliente();
        //cliente2.setId(2);
        cliente2.setNome("teste2");
        cliente2.setEmail("teste2@teste");
        cliente2.setSenha("123");
        
        cliente3= new Cliente();
        cliente3.setId(30);
        cliente3.setNome("teste3");
        cliente3.setEmail("teste3@teste");
        cliente3.setSenha("123");
        
        clienteServ = new ServicoClienteImp();
          
    }
    
   
    
    @Test
    public void testaInserir(){
        
       
        clienteServ.incluirCliente(cliente1);
        clienteServ.incluirCliente(cliente2);
        clienteServ.incluirCliente(cliente3);
        
        Cliente aux= clienteServ.pesquisarId(2);
        Assert.assertEquals("teste2",aux.getNome());
          
                
        
        
    }
    
    private void limparBanco() {
            
        Connection conexao= null;
        
           try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
            
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbBIOS?" +
                                   "user=root&password=fatec");
            
            PreparedStatement ps = conexao.prepareStatement("TRUNCATE table Cliente");
            ps.executeUpdate();
            ps.close();
            
        } catch (Exception e){
            System.out.print("Erro de conexão...CLienteDAOMysql TESTE");
            e.printStackTrace();
        }
           
          
           
        
    }
        
        
    
}
