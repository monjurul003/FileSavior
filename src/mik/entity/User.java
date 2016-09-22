/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mik.entity;

/**
 *
 * @author Rasel
 */
public class User {
    
    private String userName;
    private String password; 
    private String creationString;
    private String lastModifiedString;
    
    
    public User(String userName, String password, String creationString) {
        this.userName = userName;
        this.password = password;
        this.creationString = creationString;
    }
    
    

    public void setLastModifiedDate(String lastModifiedString) {
        this.lastModifiedString = lastModifiedString;
    }

    
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getCreationDate() {
        return creationString;
    }

    public String getLastModifiedDate() {
        return lastModifiedString;
    }
    
    
}
