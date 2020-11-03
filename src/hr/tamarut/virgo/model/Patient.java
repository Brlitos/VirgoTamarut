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
public class Patient extends Person{
    private int IDPatient;
    private PatientDetailedData patientData;
    private PatientConditionData conditionData;
    private ContactDetails contactData;
    
    public Patient(String FirstName, String MiddleName, String LastName, String Sex, Date DateOfBirth) {
        super(FirstName, MiddleName, LastName, Sex, DateOfBirth);
    }

    public Patient(int IDPatient, String firstName, String middleName, String lastName, String sex, Date dateOfBirth, PatientDetailedData patientData, PatientConditionData conditionData, ContactDetails contactData){
        super(firstName, middleName, lastName, sex, dateOfBirth);
        this.IDPatient = IDPatient;
        this.patientData = patientData;
        this.conditionData = conditionData;
        this.contactData = contactData;
    }
    
    public Patient(String firstName, String middleName, String lastName, String sex, Date dateOfBirth, PatientDetailedData patientData, PatientConditionData conditionData, ContactDetails contactData){
        super(firstName, middleName, lastName, sex, dateOfBirth);
        this.IDPatient = IDPatient;
        this.patientData = patientData;
        this.conditionData = conditionData;
        this.contactData = contactData;
    }
    
    public int getIDPatient(){
        return IDPatient;
    }
    public PatientDetailedData getPatientData(){
        return patientData;
    }
    public PatientConditionData getConditionData(){
        return conditionData;
    }
    public ContactDetails getContactData(){
        return contactData;
    }
    
}
