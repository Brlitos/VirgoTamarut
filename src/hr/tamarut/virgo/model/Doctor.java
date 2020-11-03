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
public class Doctor extends Person {

    public enum TypeOfDoctor{
        Surgeon,
        Pediatrician,
        Psychiatrist,
        Physician,
        Cardiologist,
        Neurologist;
        
        public static TypeOfDoctor getFromString(String doctorType){
            for(TypeOfDoctor typeOfDoctor : TypeOfDoctor.values()){
                if(typeOfDoctor.name().equals(doctorType))
                    return typeOfDoctor;
            }
            return null;
        }
    }
    
    private int IDDoctor;
    private String title;
    private TypeOfDoctor doctorType;
    
    public int getIDDoctor(){
        return IDDoctor;
    }
    public void setIDDoctor(int IDDoctor){
        this.IDDoctor = IDDoctor;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    
    public TypeOfDoctor getDoctorType(){
        return doctorType;
    }
    public void setDoctorType(TypeOfDoctor doctorType){
        this.doctorType = doctorType;
    }
    

    public Doctor(int IDDoctor, String firstName, String lastName, String title, TypeOfDoctor doctorType) {
        super(firstName, lastName);
        this.IDDoctor = IDDoctor;
        this.title = title;
        this.doctorType = doctorType;
    }
    
    public Doctor(String firstName, String lastName, String title, TypeOfDoctor doctorType) {
        super(firstName, lastName);
        this.title = title;
        this.doctorType = doctorType;
    }
}