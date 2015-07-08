/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rollarobotics.training2015.misc;

/**
 *
 * @author rob
 */
public class Student {

    public Student(int id, String familyName, String givenName) {
        this.id = id;
        this.familyName = familyName;
        this.givenName = givenName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    private int id;
    private String familyName;
    private String givenName;
    
    
}
