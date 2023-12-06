/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author user
 */
public class Journals extends book {
    private String Conference_Name;
    private int Conference_No;
    public Journals(String tittle,Author a1,int no,Date1 d1,String gen,String edtion,String Conference_Name, int Conference_No) {
        super(tittle,a1,no,d1,gen,edtion);
        this.Conference_Name = Conference_Name;
        this.Conference_No = Conference_No;
    }

    public String getConference_Name() {
        return Conference_Name;
    }

    public void setConference_Name(String Conference_Name) {
        this.Conference_Name = Conference_Name;
    }

    public int getConference_No() {
        return Conference_No;
    }

    public void setConference_No(int Conference_No) {
        this.Conference_No = Conference_No;
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo()+ this.Conference_Name + this.Conference_No + super.getInfo();
    }

}
