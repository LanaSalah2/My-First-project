/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author user
 */
public class Person {
    private int id;
    private String name;
    private Date1 d1;
    private int address;

    public Person()
    {
        
    }
    public Person(int id,String name,Date1 d1,int address) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.d1 = d1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date1 getD1() {
        return d1;
    }

    public void setD1(Date1 d1) {
        this.d1 = d1;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
    public String getInfo()
    {
        return "id:" + this.id + "name:" + this.name + d1.getInfo();
    }
    
}
