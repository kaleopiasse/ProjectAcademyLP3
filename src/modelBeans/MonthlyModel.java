/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBeans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author kaleo.piasse
 */
public class MonthlyModel {
    
    private int id_monthly;
    private String cpf_student;
    private String dateRegistration;
    private String modality1;
    private String modality2;
    private int numPortion;
    private String datePortion;
    private double price;
    private String plan;

    public int getId_monthly() {
        return id_monthly;
    }

    public void setId_monthly(int id_monthly) {
        this.id_monthly = id_monthly;
    }

    public String getCpf_student() {
        return cpf_student;
    }

    public void setCpf_student(String cpf_student) {
        this.cpf_student = cpf_student;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String date) {
        this.dateRegistration = date;
    }

    public String getModality1() {
        return modality1;
    }

    public void setModality1(String modality1) {
        this.modality1 = modality1;
    }

    public String getModality2() {
        return modality2;
    }

    public void setModality2(String modality2) {
        this.modality2 = modality2;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getNumPortion() {
        return numPortion;
    }

    public void setNumPortion(int numPortion) {
        this.numPortion = numPortion;
    }

    public String getDatePortion() {
        return datePortion;
    }

    public void setDatePortion(String datePortion) {
        this.datePortion = datePortion;
    }
    
    public String parsedData(String data) throws ParseException{
        
        java.util.Date initDate = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String parsedDate = formatter.format(initDate);
        return parsedDate;
    }
    
    public String addMonth (String data) throws ParseException {
     
        Calendar c = Calendar.getInstance();
        java.util.Date initDate = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        c.setTime(initDate);
        c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
        String addMonth = new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
        return addMonth;    
    }
}
