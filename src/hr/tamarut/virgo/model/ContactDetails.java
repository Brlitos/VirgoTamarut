/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.model;

/**
 *
 * @author TAMARUT
 */
public class ContactDetails {
    private int IDContactDetails;
    private String pager;
    private String fax;
    private String email;
    private String telephone1;
    private String telephone2;
    
//    public ContactDetails(String pager, String fax, String email, String telephone1, String telephone2){
//        this.pager = pager;
//        this.fax = fax;
//        this.email = email;
//        this.telephone1 = telephone1;
//        this.telephone2 = telephone2;
//    }
    
    public int getIDContactDetails(){
        return IDContactDetails;
    }
    public void setIDContactDetails(int IDContactDetails){
        this.IDContactDetails = IDContactDetails;
    }
    
    public String getPager(){
        return pager;
    }
    public void setPager(String pager){
        this.pager = pager;
    }
    
    public String getFax(){
        return fax;
    }
    public void setFax(String fax){
        this.fax = fax;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelephone1(){
        return telephone1;
    }
    public void setTelephone1(String telephone1){
        this.telephone1 = telephone1;
    }
    
    public String getTelephone2(){
        return telephone2;
    }
    public void setTelephone2(String telephone2){
        this.telephone2 = telephone2;
    }
}