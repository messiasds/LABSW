/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ChamadoDAO;
import api.modelo.Chamado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author messias
 */
public class ChamadoDAOMySQL implements  ChamadoDAO {
    
    
    private Connection conexao;
    
    public ChamadoDAOMySQL(){
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
           
            
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbBIOS?" +
                                   "user=root&password=fatec");
        } catch (Exception e){
            System.out.print("Erro de conexão...ChamadoDAOMysql");
            e.printStackTrace();
        }
    }
    
    

    @Override
    public void insert(Chamado chamado) {
        
        String sql="inser into dbBIOS.chamado (titulo,descicao,estado,idCliente,idTecnico)" +
                   " values(?,?,?,?,?)";
         
       
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,chamado.getTitulo());
            ps.setString(2,chamado.getDescricao());
            ps.setBoolean(3, chamado.isEstado());
            ps.setInt(4,chamado.getCliente().getId());
            ps.setInt(5,999); // mudar essa gambiarra
            
            ps.executeLargeUpdate();
            ps.close();
            conexao.close();
            
            
        } catch ( Exception e) {
            System.out.print("Erro de enserção ...ChamadoDAOMysql");
            e.printStackTrace();
            
            
        }
        
       
    }

    @Override
    public Chamado findById(int id) {
        
        Chamado chamado=null;
        
        String sql= "select from dbBIOS.chamado where id=?";
        
        
        try{
        PreparedStatement ps= conexao.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs= ps.executeQuery();
        rs.next();
        
        chamado.setTitulo(rs.getString("titulo"));
        chamado.setId(rs.getInt("id"));
        chamado.setDescricao(rs.getString("descricao"));
        
       
        
       
     
        }catch(Exception e){
            System.out.println("Erro findByid ChamadoDAO");
            e.printStackTrace();
            
        }
        
        
        return null;
    }

    @Override
    public void update(Chamado chamado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chamado> findByClienteId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
