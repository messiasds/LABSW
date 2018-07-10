/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import api.modelo.Chamado;
import api.modelo.Cliente;
import api.modelo.Tecnico;
import api.servico.ServicoChamado;
import core.servico.ServicoChamadoImp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author messias
 */
public class ServicoChamadoTeste {
    
    private ServicoChamado chamadoServ;
    Chamado chamado1, chamado2, chamado3;
    Cliente cliente1,cliente2;
    Tecnico tecnico;
    
    @Before
    public void setUp() {
        
        limparTabela();
        chamadoServ = new ServicoChamadoImp();
        
        cliente1= new Cliente();
        cliente1.setId(1);
        cliente1.setNome("teste1");
        cliente1.setEmail("teste@teste");
        cliente1.setSenha("123");
        
        cliente2= new Cliente();
        cliente2.setNome("teste2");
        cliente2.setEmail("teste2@teste");
        cliente2.setSenha("123");
        
        chamado1 = new Chamado();
        chamado1.setDescricao("testando chamado JPA");
        chamado1.setEstado(true);
        //chamado1.setMensagem(null);
        //chamado1.setTecnico(null);
        chamado1.setTitulo("teste chamado1");
        chamado1.setCliente(cliente1);
        
        chamado2 = new Chamado();
        chamado2.setDescricao("testando chamado JPA 2");
        chamado2.setEstado(true);
        //chamado1.setMensagem(null);
        //chamado1.setTecnico(null);
        chamado2.setTitulo("teste chamado1");
        chamado2.setCliente(cliente1);
        
        chamado3 = new Chamado();
        chamado3.setDescricao("testando chamado JPA 3");
        chamado3.setEstado(true);
        //chamado1.setMensagem(null);
        //chamado1.setTecnico(null);
        chamado3.setTitulo("teste chamado 3");
        chamado3.setCliente(cliente1);
        
        
    }
    
    
    // teste
    
    @Test
    public void testeInsert(){
        
        String descricao="testando chamado JPA";
        
        chamadoServ.incluirChamado(chamado1);
        Chamado aux= chamadoServ.pesquisarId(1);
        Assert.assertEquals(descricao, aux.getDescricao());
        
    }
    
    
    @Test 
    public void testeDelete(){
        
      
        chamadoServ.incluirChamado(chamado3);
        Assert.assertNotNull(chamadoServ.pesquisarId(1));
        chamadoServ.deletarChamado(1);
        Assert.assertNull(chamadoServ.pesquisarId(1));
        
    }
    
    
    @Test
    public void testeUpdate(){
        
        String DescricaoNova="ATUALIZADO";
        
        
        Chamado atualizado = new Chamado();
        atualizado.setId(1); // mesmo id do chamado3
        atualizado.setTitulo(chamado3.getTitulo());
        atualizado.setCliente(cliente1);
        atualizado.setEstado(chamado3.isEstado());
        atualizado.setDescricao(DescricaoNova); // altera a descricao
        
        chamadoServ.incluirChamado(chamado3);
        chamadoServ.atualizarChamado(atualizado);
        
        Chamado resp = chamadoServ.pesquisarId(1);
        
        Assert.assertEquals(DescricaoNova, resp.getDescricao());
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
     private void limparTabela() {
            
        Connection conexao= null;
        
           try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           
            
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbBIOS?" +
                                   "user=root&password=fatec");
            
            PreparedStatement ps = conexao.prepareStatement("TRUNCATE table Chamado");
            ps.executeUpdate();
            ps = conexao.prepareStatement("ALTER table Chamado AUTO_INCREMENT = 1");
            ps.executeUpdate();
            ps.close();
            
        } catch (Exception e){
            System.out.print("Erro de conexão...ChamadoDAOMysql TESTE");
            e.printStackTrace();
        }
           
          
           
        
    }
    
    
    }

    
