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
public class PatientDetailedData {
    private String presentAddress;
    private String permanentAddress;
    private String maritalStatus;
    private int numberOfDependents;
    private int height;
    private int weight;
    private String bloodType;
    private String occupation;
    private int grossAnnualIncome;
    private Boolean isVegetarian;
    private Boolean isSmoker;
    private int avgCigarettesPerDay;
    private Boolean consumesAlcohol;
    private int avgDrinksPerDay;
    private String usedStimulants;
    private String consumptionOfCoffeTeaPerDay;
    private String consumptionOfSoftDrinksPerDay;
    private String hasRegularMeals;
    private String eatHomeOutsideDominantly;
    
    
    public String getPresentAddress(){
        return presentAddress;
    }
    public void setPresentAddress(String presentAddress){
        this.presentAddress = presentAddress;
    }
    
    public String getPermanentAddress(){
        return permanentAddress;
    }
    public void setPermanentAddress(String permanentAddress){
        this.permanentAddress = permanentAddress;
    }
    
    public String getMaritalStatus(){
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    
    public int getNumberOfDependents(){
        return numberOfDependents;
    }
    public void setNumberOfDependents(int numberOfDependents){
        this.numberOfDependents = numberOfDependents;
    }
    
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public String getBloodType(){
        return bloodType;
    }
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    
    public int getGrossAnnualIncome(){
        return grossAnnualIncome;
    }
    public void setGrossAnnualIncome(int grossAnnualIncome){
        this.grossAnnualIncome = grossAnnualIncome;
    }
    
    public Boolean getIsVegetarian(){
        return isVegetarian;
    }
    public void setIsVegetarian(Boolean isVegetarian){
        this.isVegetarian = isVegetarian;
    }
    
    public Boolean getIsSmoker(){
        return isSmoker;
    }
    public void setIsSmoker(Boolean isSmoker){
        this.isSmoker = isSmoker;
    }
    
    public int getAvgCigarettesPerDay(){
        return avgCigarettesPerDay;
    }
    public void setAvgCigarettesPerDay(int avgCigarettesPerDay){
        this.avgCigarettesPerDay = avgCigarettesPerDay;
    }
    
    public Boolean getConsumesAlcohol(){
        return consumesAlcohol;
    }
    public void setConsumesAlcohol(Boolean consumesAlcohol){
        this.consumesAlcohol = consumesAlcohol;
    }
    
    public int getAvgDrinksPerDay(){
        return avgDrinksPerDay;
    }
    public void setAvgDrinksPerDay(int avgDrinksPerDay){
        this.avgDrinksPerDay = avgDrinksPerDay;
    }
    
    public String getUsedStimulants(){
        return usedStimulants;
    }
    public void setUsedStimulants(String usedStimulants){
        this.usedStimulants = usedStimulants;
    }
    
    public String getConsumptionOfCoffeTeaPerDay(){
        return consumptionOfCoffeTeaPerDay;
    }
    public void setConsumptionOfCoffeTeaPerDay(String consumptionOfCoffeTeaPerDay){
        this.consumptionOfCoffeTeaPerDay = consumptionOfCoffeTeaPerDay;
    }
    
    public String getConsumptionOfSoftDrinksPerDay(){
        return consumptionOfSoftDrinksPerDay;
    }
    public void setConsumptionOfSoftDrinksPerDay(String consumptionOfSoftDrinksPerDay){
        this.consumptionOfSoftDrinksPerDay = consumptionOfSoftDrinksPerDay;
    }
    
    public String getHasRegularMeals(){
        return hasRegularMeals;
    }
    public void setHasRegularMeals(String hasRegularMeals){
        this.hasRegularMeals = hasRegularMeals;
    }
    
    public String getEatHomeOutsideDominantly(){
        return eatHomeOutsideDominantly;
    }
    public void setEatHomeOutsideDominantly(String eatHomeOutsideDominantly){
        this.eatHomeOutsideDominantly = eatHomeOutsideDominantly;
    }
}
