/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.mziuri.dao;

import ge.mziuri.model.User;

/**
 *
 * @author C4C5
 */
public interface UserDAO {
    
    void addUser(User user);
    
    User getUser(String userame, String password);
    
}
