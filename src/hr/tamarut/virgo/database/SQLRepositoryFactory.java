/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.database;

/**
 *
 * @author TAMARUT
 */
public class SQLRepositoryFactory {
    
    public static SQLRepositoryI getRepository(){
        return new SQLRepository();
    }
}
