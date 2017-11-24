/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelBeans.MonthlyModel;
import modelBeans.StudentModel;
import modelConnection.ConnectionDB;

/**
 *
 * @author kaleo.piasse
 */
public class MonthlyDao {
   
    ConnectionDB cntn = new ConnectionDB();
    
    public void saveMonthly (MonthlyModel monthlyMod) throws ParseException{
        String studentCpf;
        int num = monthlyMod.getNumPortion();
        int i = 1;
        
        cntn.connection();
        try {
            while(i <= num){
                PreparedStatement pst = cntn.conn.prepareStatement("insert into monthly (cpf_student,dateRegistration,modality1,modality2,numPortion,datePortion,price,plan) values (?,?,?,?,?,?,?,?)");
                pst.setString(1, monthlyMod.getCpf_student());
                pst.setString(2, monthlyMod.parsedData(monthlyMod.getDateRegistration()));
                pst.setString(3, monthlyMod.getModality1());
                pst.setString(4, monthlyMod.getModality2());
                pst.setInt(5, i);
                pst.setString(6, monthlyMod.parsedData(monthlyMod.getDatePortion()));
                pst.setDouble(7, monthlyMod.getPrice());
                pst.setString(8, monthlyMod.getPlan());
                pst.execute();
                i++;
                monthlyMod.setDatePortion(monthlyMod.addMonth(monthlyMod.getDatePortion()));
            }
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir os dados! \n" +ex);
        }
        cntn.desconnection();
    }
    
    /*public void deletemonthly (MonthlyModel personMod, StudentModel studentMod){
        String studentCpf;
        cntn.connection();
        try {
            PreparedStatement pst = cntn.conn.prepareStatement("delete from monthly where cpf=?");
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
    }*/
    
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
    
    public ArrayList findAll(){
        cntn.connection();
        ResultSet resultSet;
        ArrayList list = new ArrayList();
        try {
            resultSet = cntn.executeResult("select name from modality");
                while ( resultSet.next() ) {
                    list.add(resultSet.getString("name")); 
                }
        }
        catch (SQLException ex) {
            Logger.getLogger(MonthlyDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        cntn.desconnection();
        return list;  
    }
}
