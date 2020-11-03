/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.main;

import hr.tamarut.virgo.gui.MenuGUI;

/**
 *
 * @author TAMARUT
 */
public class Main {
        public static void main(String[] args) {
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
                }
            });
//            SQLRepositoryI sqlRepo = new SQLRepository();
//            
//            Doctor doctor = new Doctor(1, "Šmokljan","Buzdo", "Neobrazovani", Doctor.TypeOfDoctor.Physician);
//            
//            sqlRepo.insertDoctor(doctor);
            
        }
    
}
