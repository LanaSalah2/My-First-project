/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author user
 */
public class Magazine extends book {
private Date1 release_date;
 private int issue_No;
    public Magazine(String tittle,Author a1,int no,Date1 d1,String gen,String edtion,Date1 release_date ,int issue_No ) {
        super(tittle,a1,no,d1,gen,edtion);
        this.issue_No = issue_No;
        this.release_date = release_date;
    }
    public Date1 getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date1 release_date) {
        this.release_date = release_date;
    }

    public int getIssue_No() {
        return issue_No;
    }

    public void setIssue_No(int issue_No) {
        this.issue_No = issue_No;
    }
    
    @Override
    public String getInfo()
{
    return issue_No + release_date.getInfo() + super.getInfo();
}
    
}
