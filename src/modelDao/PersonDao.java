/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import modelConnection.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.PersonModel;

/**
 *
 * @author kaleo
 */
public class PersonDao {
    
    ConnectionDB cntn = new ConnectionDB();
    PersonModel personMod = new PersonModel();
    
    public void savePerson (PersonModel personMod){
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
    
    public void deletePerson (PersonModel personMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("delete from person where cpf=?");
            pst.setString(1, personMod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    public void updatePerson (PersonModel personMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("update person set cpf=?,name=?,sex=?,street=?, district=?,num=?,"
                    + "cep=?, city=?, estado=?, complement=? where cpf=?");
            pst.setString(1, personMod.getCpf());
            pst.setString(2, personMod.getName());
            pst.setString(3, personMod.getSex());
            pst.setString(4, personMod.getStreet());
            pst.setString(5, personMod.getDistrict());
            pst.setInt(6,personMod.getNum());
            pst.setString(7, personMod.getCep());
            pst.setString(8, personMod.getCity());
            pst.setString(9, personMod.getState());
            pst.setString(10, personMod.getComplement());
            pst.setString(11, personMod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar os dados! \n Erro:" +ex);
        }
        cntn.desconnection(); 
    }
    
    public PersonModel searchPerson (PersonModel personMod){
        cntn.connection();
        cntn.executeSql("select *from person where cpf like'%" + personMod.getSearch()+"%'");
        try{
            cntn.rs.first();
            personMod.setCpf(cntn.rs.getString("cpf"));
            personMod.setName(cntn.rs.getString("name"));
            personMod.setSex(cntn.rs.getString("sex"));
            personMod.setStreet(cntn.rs.getString("street"));
            personMod.setDistrict(cntn.rs.getString("district"));
            personMod.setNum(cntn.rs.getInt("num"));
            personMod.setCep(cntn.rs.getString("cep"));
            personMod.setCity(cntn.rs.getString("city"));
            personMod.setState(cntn.rs.getString("estado")); 
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar medico ! /nErro"+ex.getMessage());
        }
        cntn.desconnection();
        return personMod;
    } 
}
