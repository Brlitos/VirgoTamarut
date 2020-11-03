/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.bussiness;

import hr.tamarut.virgo.model.ContactDetails;
import hr.tamarut.virgo.model.Patient;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TAMARUT
 */
public class PatientsService extends BaseService{
    private static PatientsService instance;
    private PatientsService(){
        
    }
    public static PatientsService getInstance() {
        if(instance == null) {
            instance = new PatientsService();
        }
        return instance;
    }

    public void insertPatient(Patient patient) {
        repository.insertPatient(patient);
    }
    
    public void insertContactData(ContactDetails contact){
        repository.insertContactData(contact);
    }
    
    public List<Patient> getAllPatientsShortInfo() {
        return repository.getAllPatientsShortInfo();
    }
    
    public List<Patient> getPatientsAssignedToDoctor(int IDDoctor) {
        return repository.getPatientsAssignedToDoctor(IDDoctor);
    }
    
    public void assignPatientToDoctor(int IDPatient, int IDDoctor){
        repository.assignPatientToDoctor(IDPatient, IDDoctor);
    }
    
    public void removePatientFromDoctor(int IDPatient, int IDDoctor){
        repository.removePatientFromDoctor(IDPatient, IDDoctor);
    }
    
    public void chargePatient (int IDPatient, int IDDoctor, int price){
        repository.chargePatient(IDPatient, IDDoctor, price, Timestamp.from(Instant.now()));
    }
    
    public List<String> getChargedPatients(){
        return repository.getChargedPatients();
    }
}
