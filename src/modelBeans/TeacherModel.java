/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBeans;

/**
 *
 * @author Kaleo
 */
public class TeacherModel extends PersonModel {

    private String Modality1;
    private String Modality2;
    
    public String getModality1() {
        return Modality1;
    }

    public void setModality1(String Modality1) {
        this.Modality1 = Modality1;
    }

    public String getModality2() {
        return Modality2;
    }

    public void setModality2(String Modality2) {
        this.Modality2 = Modality2;
    } 
}
