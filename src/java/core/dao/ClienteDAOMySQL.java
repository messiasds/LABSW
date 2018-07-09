/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ClienteDAO;
import api.modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author messias
 */
public class ClienteDAOMySQL implements ClienteDAO {
    
    private Connection conexao;
    
    public ClienteDAOMySQL(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbBIOS?" +
                                   "user=root&password=fatec");
        } catch (Exception e){
            System.out.print("Erro de conexão...CLienteDAOMysql");
            e.printStackTrace();
        }
        
    }
    
    
    
    @Override
    public void insert(Cliente cliente) {
            
        String sql = "insert into dbBIOS.Cliente (nome,email,senha) values (?,?,?)";
        
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,cliente.getNome());
            ps.setString(2,cliente.getEmail());
            ps.setString(3,cliente.getSenha());
            ps.executeUpdate();
            ps.close();
            //conexao.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    @Override
    public Cliente findById(int id) {
        
        Cliente cliente= null;
                
        
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from dbBIOS.Cliente where id = ?");  
            comandoSQLp.setString(1, String.valueOf(id));
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
           
            cliente = new Cliente();
            
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setEmail(rs.getString("email"));
            cliente.setSenha(rs.getString("senha"));
           
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return cliente;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... ClienteDAOMysql");
          e.printStackTrace();
        }
        
        return cliente;
            }

    @Override
    public void update(Cliente cliente) {
        
        String sql = "update into dbBIOS.Cliente set nome= ? email = ? senha =? where id=?";
        
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,cliente.getNome());
            ps.setString(2,cliente.getEmail());
            ps.setString(3,cliente.getSenha());
            ps.setInt(4, cliente.getId());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
        } catch (Exception e) {
            //Logger.getLogger(ClienteDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
            e.printStackTrace();
        }
        
        
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
