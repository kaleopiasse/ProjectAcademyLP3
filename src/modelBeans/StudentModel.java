/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBeans;

/**
 *
 * @author kaleo
 */
public class StudentModel extends PersonModel{
    
    private String situation;
    private String search;

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getSearch() {
        return search.replace(".","").replace("-","");
    }

    public void setSearch(String search) {
        this.search = search;
    }
    
    
}
