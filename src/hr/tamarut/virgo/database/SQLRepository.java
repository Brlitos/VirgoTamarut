/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.database;

import hr.tamarut.virgo.model.ContactDetails;
import hr.tamarut.virgo.model.Doctor;
import hr.tamarut.virgo.model.Patient;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author TAMARUT
 */
public class SQLRepository implements SQLRepositoryI {

    
    private static final String INSERT_DOCTOR = "{ CALL insertDoctor (?,?,?,?,?) }";
    private static final String INSERT_PATIENT = "{ CALL insertPatient (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }";
    private static final String GET_DOCTORS = "{ CALL getDoctors }";
    private static final String DELETE_DOCTOR = "{ CALL deleteDoctor (?) }";
    private static final String UPDATE_DOCTOR = "{ CALL updateDoctor (?,?,?,?,?) }";
    private static final String GET_PATIENTS = "{ CALL getPatients }";
    private static final String GET_DOCTORS_PATIENTS = "{ CALL getDoctorsPatients (?) }";
    private static final String ASSIGN_PATIENT_TO_DOCTOR = "{ CALL patientToDoctor (?, ?) }";
    private static final String REMOVE_PATIENT_FROM_DOCTOR = "{ CALL removePatientFromDoctor (?, ?) }";
    private static final String INSERT_CONTACT_DATA = "{ CALL insertContactData(?,?,?,?,?,?) }";
    private static final String CHARGE_PATIENT = "{ CALL chargePatient(?,?,?,?)}";
    private static final String GET_CHARGED_PATIENTS = "{ CALL getChargedPatients }";
    
    @Override
    public Doctor getDoctor(int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertDoctor(Doctor doctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
            CallableStatement stmt = con.prepareCall(INSERT_DOCTOR);){
            stmt.setString(1, doctor.getFirstName());
            stmt.setString(2, doctor.getLastName());
            stmt.setString(3, doctor.getTitle());
            stmt.setString(4, doctor.getDoctorType().toString());
            stmt.registerOutParameter(5, Types.INTEGER);

            stmt.executeUpdate();
            return stmt.getInt(5);
            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public void updateDoctor(Doctor doctor, int idDoctor) {
        DataSource dataSource = DataSourceSingleton.getInstance();

        try(Connection con = dataSource.getConnection();
            CallableStatement stmt = con.prepareCall(UPDATE_DOCTOR)) {
            stmt.setString(1, doctor.getFirstName());
            stmt.setString(2, doctor.getLastName());
            stmt.setString(3, doctor.getTitle());
            stmt.setString(4, doctor.getDoctorType().toString());
            stmt.setInt(5, idDoctor);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }            
    }
    
     @Override
    public int insertPatient(Patient patient) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement stmt = con.prepareCall(INSERT_PATIENT);
             ){
            stmt.setString(1, patient.getFirstName());
            stmt.setString(2, patient.getMiddleName());
            stmt.setString(3, patient.getLastName());
            stmt.setString(4, String.valueOf(patient.getSex()));
            stmt.setDate(5, new java.sql.Date(patient.getDateOfBirth().getTime()));
            stmt.setString(6,  patient.getPatientData().getPresentAddress());            
            stmt.setString(7,  patient.getPatientData().getPermanentAddress());
            stmt.setString(8, patient.getPatientData().getMaritalStatus());
            stmt.setInt(9, patient.getPatientData().getNumberOfDependents());
            stmt.setInt(10, patient.getPatientData().getHeight());
            stmt.setInt(11, patient.getPatientData().getWeight());
            stmt.setString(12, patient.getPatientData().getBloodType());
            stmt.setString(13, patient.getPatientData().getOccupation());
            stmt.setInt(14, patient.getPatientData().getGrossAnnualIncome());
            stmt.setBoolean(15, patient.getPatientData().getIsVegetarian());
            stmt.setBoolean(16, patient.getPatientData().getIsSmoker());
            stmt.setInt(17, patient.getPatientData().getAvgCigarettesPerDay());
            stmt.setBoolean(18, patient.getPatientData().getConsumesAlcohol());
            stmt.setInt(19, patient.getPatientData().getAvgDrinksPerDay());
            stmt.setString(20, patient.getPatientData().getUsedStimulants());
            stmt.setString(21, patient.getPatientData().getConsumptionOfCoffeTeaPerDay());
            stmt.setString(22, patient.getPatientData().getConsumptionOfSoftDrinksPerDay());
            stmt.setString(23, patient.getPatientData().getHasRegularMeals());
            stmt.setString(24, patient.getPatientData().getEatHomeOutsideDominantly());
            stmt.setString(25, patient.getConditionData().getStatementOfComplaint());
            stmt.setString(26, patient.getConditionData().getHistoryOfPreviousTreatment());
            stmt.setString(27, patient.getConditionData().getPhysicianHospitalTreated());
            stmt.setBoolean(28, patient.getConditionData().getDiabetic());
            stmt.setBoolean(29, patient.getConditionData().getHypertensive());
            stmt.setString(30, patient.getConditionData().getCardiacCondition());
            stmt.setString(31, patient.getConditionData().getRespiratoryCondition());
            stmt.setString(32, patient.getConditionData().getDigestiveCondition());
            stmt.setString(33, patient.getConditionData().getOrthopedicCondition());
            stmt.setString(34, patient.getConditionData().getMuscularCondition());
            stmt.setString(35, patient.getConditionData().getNeurologicalCondition());
            stmt.setString(36, patient.getConditionData().getKnownAllergies());
            stmt.setString(37, patient.getConditionData().getReactionToDrugs());
            stmt.setString(38, patient.getConditionData().getHistoryOfSurgeries());          
            //stmt.setInt(39, patient.getContactData().getIDContactDetails());

            stmt.registerOutParameter(39, Types.INTEGER);

            stmt.executeUpdate();
            return stmt.getInt(39);
            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        DataSource dataSource = DataSourceSingleton.getInstance();

        List<Doctor> doctors = new ArrayList<>();
        
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTORS);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        doctors.add(
                                new Doctor(
                                    resultSet.getInt("IDDoctor"), 
                                    resultSet.getString("FirstName"), 
                                    resultSet.getString("LastName"),
                                    resultSet.getString("Title"),
                                    Doctor.TypeOfDoctor.getFromString(resultSet.getString("Type"))));
                    }
            return doctors;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }
    
    public void deleteDoctor(Doctor doctor){
        DataSource dataSource = DataSourceSingleton.getInstance();

        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(DELETE_DOCTOR)) {
            stmt.setInt(1, doctor.getIDDoctor());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }

    @Override
    public List<Patient> getAllPatientsShortInfo() {
        DataSource dataSource = DataSourceSingleton.getInstance();

        List<Patient> patients = new ArrayList<>();
        
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATIENTS);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        patients.add(
                                new Patient(
                                    resultSet.getInt("IDPatient"), 
                                    resultSet.getString("FirstName"), 
                                    resultSet.getString("MiddleName"),
                                    resultSet.getString("LastName"),
                                    resultSet.getString("Sex"),
                                    resultSet.getDate("DateOfBirth"),
                                    null, null, null));
                    }
            return patients;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patients;
    }

    public List<Patient> getPatientsAssignedToDoctor(int idDoctor){
        DataSource dataSource = DataSourceSingleton.getInstance();

        List<Patient> patients = new ArrayList<>();
        
         try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTORS_PATIENTS)){
                stmt.setInt(1, idDoctor);
            try(ResultSet resultSet = stmt.executeQuery()) {
               while (resultSet.next()) {
                        patients.add(
                                new Patient(
                                    resultSet.getInt("IDPatient"), 
                                    resultSet.getString("FirstName"), 
                                    resultSet.getString("MiddleName"),
                                    resultSet.getString("LastName"),
                                    resultSet.getString("Sex"),
                                    resultSet.getDate("DateOfBirth"),
                                    null, null, null));
                    }
            return patients;
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patients;
    }
    
    @Override
    public void assignPatientToDoctor(int idPatient, int idDoctor){
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement stmt = con.prepareCall(ASSIGN_PATIENT_TO_DOCTOR);
             ){
            stmt.setInt(1, idPatient);
            stmt.setInt(2, idDoctor);

            stmt.executeUpdate();            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void removePatientFromDoctor(int idPatient, int idDoctor){
                DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement stmt = con.prepareCall(REMOVE_PATIENT_FROM_DOCTOR);
             ){
            stmt.setInt(1, idPatient);
            stmt.setInt(2, idDoctor);

            stmt.executeUpdate();            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int insertContactData(ContactDetails contact) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
            CallableStatement stmt = con.prepareCall(INSERT_CONTACT_DATA);){
            stmt.setString(1, contact.getPager());
            stmt.setString(2, contact.getFax());
            stmt.setString(3, contact.getEmail());
            stmt.setString(4, contact.getTelephone1());
            stmt.setString(5, contact.getTelephone2());
            stmt.registerOutParameter(6, Types.INTEGER);

            stmt.executeUpdate();
            return stmt.getInt(6);
            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public void chargePatient(int idDoctor, int idPatient, int price, Timestamp dateTimeBilled) {
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement stmt = con.prepareCall(CHARGE_PATIENT);
             ){
            stmt.setInt(1, idDoctor);
            stmt.setInt(2, idPatient);
            stmt.setInt(3, price);
            stmt.setTimestamp(4, dateTimeBilled);
            stmt.executeUpdate();   
//            return stmt.getInt(4);
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<String> getChargedPatients() {
        List<String> chargedPatients = new ArrayList<>();
        DataSource dataSource = DataSourceSingleton.getInstance();
        try (Connection con = dataSource.getConnection();
             CallableStatement stmt = con.prepareCall(GET_CHARGED_PATIENTS);
             ResultSet resultSet = stmt.executeQuery()){
            
            while(resultSet.next()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bill ").append(resultSet.getInt("IDBill"))
                        .append(": Patient ")
                        .append(resultSet.getString("FirstNamePat"))
                        .append(" ")
                        .append(resultSet.getString("LastNamePat"))
                        .append(", Doctor ")
                        .append(resultSet.getString("FirstNameDoc"))
                        .append(" ")
                        .append(resultSet.getString("LastNameDoc"))
                        .append(", Amount: ")
                        .append(resultSet.getInt("Price"))
                        .append("$ ")
                        .append("Date: ")
                        .append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(resultSet.getTimestamp("DateOfBill")));
                chargedPatients.add(sb.toString());
            }
            return chargedPatients;
            
        } catch (Exception ex) {
            Logger.getLogger(SQLRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}