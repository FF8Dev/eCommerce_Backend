/*
 * GNU General Public License v3.0
 */
package com.alocoifindo.ecommerce;

/**
 *
 * @author Alocoifindo
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String priviligies;

    public User() {
    }

    public User(int id, String username, String password, String priviligies) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.priviligies = priviligies;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPriviligies() {
        return priviligies;
    }

    public void setPriviligies(String priviligies) {
        this.priviligies = priviligies;
    }

    
}