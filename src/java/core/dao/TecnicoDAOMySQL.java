/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.TecnicoDAO;
import api.modelo.Tecnico;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author messias
 */
public class TecnicoDAOMySQL implements TecnicoDAO {
    
    private Connection conexao;
    
    public TecnicoDAOMySQL(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conexao = DriverManager.getConnection("jdbc:mariadb://172.16.7.63:3306/agenda","usuario", "usuario123");

            //conexao = DriverManager.getConnection("jdbc:mysql://150.163.17.237:3306/agenda?" +
            //                       "user=usuario&password=usuario123");
        } catch (Exception e){
            System.out.print("Erro de conexão...PapelDAOMysql");
            e.printStackTrace();
        }
    }
    

    @Override
    public void insert(Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tecnico findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
