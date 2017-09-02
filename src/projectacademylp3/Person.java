/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacademylp3;

/**
 *
 * @author kaleo
 */
public class Person {
    
    private String cpf;
    private String name;
    private int dtBirthday;
    private String street;
    private int num;
    private String neigh;
    private String city;
    private String state;           
    private String phone;
    private String email;

    public Person(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "cpf=" + cpf + ", name=" + name + ", dtBirthday=" + dtBirthday + ", street=" + street + ", num=" + num + ", neigh=" + neigh + ", city=" + city + ", state=" + state + ", phone=" + phone + ", email=" + email + '}';
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDtBirthday() {
        return dtBirthday;
    }

    public void setDtBirthday(int dtBirthday) {
        this.dtBirthday = dtBirthday;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNeigh() {
        return neigh;
    }

    public void setNeigh(String neigh) {
        this.neigh = neigh;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
