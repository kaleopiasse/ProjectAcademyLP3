/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelBeans.PersonModel;
import modelBeans.StudentModel;
import modelBeans.TeacherModel;
import modelConnection.ConnectionDB;

/**
 *
 * @author Kaleo
 */
public class TeacherDao {
    ConnectionDB cntn = new ConnectionDB();
    PersonModel personMod = new PersonModel();
    TeacherModel teacherMod = new TeacherModel();
    
    public void saveTeacher (PersonModel personMod, TeacherModel teacherMod){
        String personCpf;
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("insert into person (cpf,name, sex,street, district,num,"
                    + "cep, city, estado, complement) values (?,?,?,?,?,?,?,?,?,?)");
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
            if (pst.execute() == false){
                personCpf = personMod.getCpf();
                PreparedStatement pst2 = cntn.conn.prepareStatement("insert into teacher (cpf_teacher, modality1, modality2) values (?,?,?)");
                pst2.setString(1, personCpf);
                pst2.setString(2, teacherMod.getModality1());
                pst2.setString(3, teacherMod.getModality2());
                pst2.execute();
            }
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    public void deleteStudent (PersonModel personMod, StudentModel studentMod){
        String personCpf;
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("delete from person where cpf=?");
            pst.setString(1, personMod.getCpf());
            if (pst.execute() == false){
                personCpf = personMod.getCpf();
                PreparedStatement pst2 = cntn.conn.prepareStatement("delete from student where cpf_student=?");
                pst2.setString(1, personCpf);
                pst2.execute();
            }
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    public StudentModel searchStudent (StudentModel studentMod){
        cntn.connection();
        cntn.executeSql("select *from student where cpf_student like'%" + studentMod.getSearch()+"%'");
        try{
            cntn.rs.first();
            studentMod.setSituation(cntn.rs.getString("situation"));
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar medico ! /nErro"+ex.getMessage());
        }
        cntn.desconnection();
        return studentMod; 
    }
    
    public void updateStudent (StudentModel studentMod){
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("update student set cpf_student=?,situation=? where cpf_student=?");
            pst.setString(1, studentMod.getCpf());
            pst.setString(2, studentMod.getSituation());
            pst.setString(3, studentMod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar os dados! \n Erro:" +ex);
        }
        cntn.desconnection(); 
    }
}
