/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author santa
 */
public class Pessoa {
    private String name;
    private String gender;
    private String civilStatus;



    public Pessoa(String name, String gender, String civilStatus) {
        this.name = name;
        this.gender = gender;
        this.civilStatus = civilStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    
    public String getCivilStatus() {
        return civilStatus;
    }
}
