/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBeans;

/**
 *
 * @author kaleo.piasse
 */
public class MonthlyModel {
    
    private int id_monthly;
    private String cpf_student;
    private String date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
