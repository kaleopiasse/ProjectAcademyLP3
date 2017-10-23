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
    
    public void SaveModality (ModalityModel modalityMod){
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
}
