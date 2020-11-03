/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.model;

import java.util.Date;

/**
 *
 * @author TAMARUT
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private Date dateOfBirth;
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    public Person(String firstName, String middleName, String lastName, String sex, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }
    
}