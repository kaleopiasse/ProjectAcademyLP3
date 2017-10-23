/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.ModalityModel;
import modelConnection.ConnectionDB;

/**
 *
 * @author kaleo
 */
public class ModalityDao {
    
    ConnectionDB cntn = new ConnectionDB();
    ModalityModel modalityMod = new ModalityModel();
    
    public void saveModality (ModalityModel modalityMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("insert into modality (name, price) values (?,?)");
            pst.setString(1, modalityMod.getName());
            pst.setDouble(2, modalityMod.getPrice());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    public void deleteModality (ModalityModel modalityMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("delete from modality where id_modality=?");
            pst.setInt(1,modalityMod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    public void updateModality (ModalityModel modalityMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("update modality set name=?,price=? where id_modality=?");
            pst.setString(1, modalityMod.getName());
            pst.setDouble(2, modalityMod.getPrice());
            pst.setInt(3, modalityMod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar os dados! \n Erro:" +ex);
        }
        cntn.desconnection(); 
    }
    
    public ModalityModel searchModality (ModalityModel modalityMod){
        cntn.connection();
        cntn.executeSql("select *from modality where name like'%" + modalityMod.getSearch()+"%'");
        try{
            cntn.rs.first();
            modalityMod.setId(cntn.rs.getInt("id_modality"));
            modalityMod.setName(cntn.rs.getString("name"));
            modalityMod.setPrice(cntn.rs.getDouble("price")); 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar medico ! /nErro"+ex.getMessage());
        }
        cntn.desconnection();
        return modalityMod;
    }
}
