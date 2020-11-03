/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.tamarut.virgo.bussiness;

import hr.tamarut.virgo.database.SQLRepositoryFactory;
import hr.tamarut.virgo.database.SQLRepositoryI;

/**
 *
 * @author TAMARUT
 */
public class BaseService {
    final SQLRepositoryI repository;
    
    public BaseService() {
        this.repository = SQLRepositoryFactory.getRepository();
    }
}

