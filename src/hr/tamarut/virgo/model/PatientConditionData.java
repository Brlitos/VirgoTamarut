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
public class PatientConditionData {
    private String statementOfComplaint;
    private String historyOfPreviousTreatment;
    private String physicianHospitalTreated;
    private Boolean diabetic;
    private Boolean hypertensive;
    private String cardiacCondition;
    private String respiratoryCondition;
    private String digestiveCondition;
    private String orthopedicCondition;
    private String muscularCondition;
    private String neurologicalCondition;
    private String knownAllergies;
    private String reactionToDrugs;
    private String historyOfSurgeries; 
    
    
    public String getStatementOfComplaint(){
        return statementOfComplaint;
    }
    public void setStatementOfComplaint(String statementOfComplaint){
        this.statementOfComplaint = statementOfComplaint;
    }
    
    public String getHistoryOfPreviousTreatment(){
        return historyOfPreviousTreatment;
    }
    public void setHistoryOfPreviousTreatment(String historyOfPreviousTreatment){
        this.historyOfPreviousTreatment = historyOfPreviousTreatment;
    }
    
    public String getPhysicianHospitalTreated(){
        return physicianHospitalTreated;
    }
    public void setPhysicianHospitalTreated(String physicianHospitalTreated){
        this.physicianHospitalTreated = physicianHospitalTreated;
    }
    
    public Boolean getDiabetic(){
        return diabetic;
    }
    public void setDiabetic(Boolean diabetic){
        this.diabetic = diabetic;
    }
    
    public Boolean getHypertensive(){
        return hypertensive;
    }
    public void setHypertensive(Boolean hypertensive){
        this.hypertensive = hypertensive;
    }
    
    public String getCardiacCondition(){
        return cardiacCondition;
    }
    public void setCardiacCondition(String cardiacCondition){
        this.cardiacCondition = cardiacCondition;
    }
    
    public String getRespiratoryCondition(){
        return respiratoryCondition;
    }
    public void setRespiratoryCondition(String respiratoryCondition){
        this.respiratoryCondition = respiratoryCondition;
    }
    
    public String getDigestiveCondition(){
        return digestiveCondition;
    }
    public void setDigestiveCondition(String digestiveCondition){
        this.digestiveCondition = digestiveCondition;
    }
    
    public String getOrthopedicCondition(){
        return orthopedicCondition;
    }
    public void setOrthopedicCondition(String orthopedicCondition){
        this.orthopedicCondition = orthopedicCondition;
    }
    
    public String getMuscularCondition(){
        return muscularCondition;
    }
    public void setMuscularCondition(String muscularCondition){
        this.muscularCondition = muscularCondition;
    }
    
    public String getNeurologicalCondition(){
        return neurologicalCondition;
    }
    public void setNeurologicalCondition(String neurologicalCondition){
        this.neurologicalCondition = neurologicalCondition;
    }
    
    public String getKnownAllergies(){
        return knownAllergies;
    }
    public void setKnownAllergies(String knownAllergies){
        this.knownAllergies = knownAllergies;
    }
    
    public String getReactionToDrugs(){
        return reactionToDrugs;
    }
    public void setReactionToDrugs(String reactionToDrugs){
        this.reactionToDrugs = reactionToDrugs;
    }
    
    public String getHistoryOfSurgeries(){
        return historyOfSurgeries;
    }
    public void setHistoryOfSurgeries(String historyOfSurgeries){
        this.historyOfSurgeries = historyOfSurgeries;
    }
}