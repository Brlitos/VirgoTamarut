/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.database;

import hr.tamarut.virgo.model.ContactDetails;
import hr.tamarut.virgo.model.Doctor;
import hr.tamarut.virgo.model.Patient;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author TAMARUT
 */
public interface SQLRepositoryI {
    Doctor getDoctor(int idDoctor);
    List<Doctor> getAllDoctors();
    int insertDoctor(Doctor doctor);
    void updateDoctor(Doctor who,int idDoctor);
    void deleteDoctor(Doctor doctor);
    int insertPatient(Patient patient);
    int insertContactData(ContactDetails contact);
    List<Patient> getAllPatientsShortInfo();
    List<Patient> getPatientsAssignedToDoctor(int idDoctor);
    void assignPatientToDoctor(int idPatient, int idDoctor);
    void removePatientFromDoctor(int idPatient, int idDoctor);    
    void chargePatient(int idPatient, int idDoctor, int price, Timestamp dateTimeBilled);
    List<String> getChargedPatients();
}
