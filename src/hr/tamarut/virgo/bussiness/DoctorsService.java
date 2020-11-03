/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.bussiness;

import hr.tamarut.virgo.model.Doctor;
import java.util.List;

/**
 *
 * @author TAMARUT
 */
public class DoctorsService extends BaseService{
    private static DoctorsService instance;
    private DoctorsService(){
        
    }
    public static DoctorsService getInstance() {
        if(instance == null) {
            instance = new DoctorsService();
        }
        return instance;
    }

    public int insertDoctor(Doctor doctor) {
        return repository.insertDoctor(doctor);
    }
    public List<Doctor> getAllDoctors() {
        return repository.getAllDoctors();
    }
    
    public void updateDoctor(Doctor doctor) {
        repository.updateDoctor(doctor, doctor.getIDDoctor());
    }
    
    public void deleteDoctor(Doctor doctor) {
        repository.deleteDoctor(doctor);
    }
}
