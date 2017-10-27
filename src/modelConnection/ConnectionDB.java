/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelConnection;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kaleo
 */
public class ConnectionDB {
    
    public Statement stm; //Pesquisa no banco de dados
    public ResultSet rs; //Armazena resultado da pesquisa
    private String driver = "com.mysql.jdbc.Driver"; //Identifica o servico do BD
    private String path = "jdbc:mysql://localhost:3306/ProjectAcademy"; //Caminho para banco de dados
    private String user = "root";
    private String password = "skiter";
    public Connection conn;
    
    public void connection(){
        try{
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(path,user,password);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso !!!");
        } 
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar conectar com o banco de dados\n"+ex.getMessage());
        }
    }
    
    public void executeSql (String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL \n" +ex.getMessage());
        }
    }   
    
    public void desconnection(){
        try{
            conn.close();
            //OptionPane.showMessageDialog(null, "Desconectado da base de dados");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com a base de dados\n" +ex.getMessage());
        }
    }
    
    public ResultSet executeResult (String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar SQL \n" +ex.getMessage());
        }
        
        return rs;
    }
     
}
