/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.PersonModel;

/**
 *
 * @author kaleo
 */
public class PersonController {
    
    ConnectionDB cntn = new ConnectionDB();
    PersonModel personMod = new PersonModel();
    
    public void Save (PersonModel personMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("insert into person (cpf,name, sex,street, district,num,"
                    + "cep, city, estado) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, personMod.getCpf());
            pst.setString(2, personMod.getName());
            pst.setString(3, personMod.getSex());
            pst.setString(4, personMod.getStreet());
            pst.setString(5, personMod.getDistrict());
            pst.setInt(6,personMod.getNum());
            pst.setString(7, personMod.getCep());
            pst.setString(8, personMod.getCity());
            pst.setString(9, personMod.getState());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
}
