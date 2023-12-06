/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class book implements Display {
  private  String tittle;
  private  Author a1;
  private  int no;
  private  Date1 d1;
  private  String gen;
  private String edtion;
  

    public book() {
    }
  

    public book( String tittle,Author a1,int no,Date1 d1,String gen,String edtion) {
        this.tittle = tittle;
    this.a1 = a1;
    this.no = no;
    this.d1 = d1;
    this.gen = gen;
    this.edtion = edtion;
        
    }

    book(String tittle, Author a1, int no, java.util.Date d3, String gen, String edtion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Author getA1() {
        return a1;
    }

    public void setA1(Author a1) {
        this.a1 = a1;
    }

  
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Date1 getD1() {
        return d1;
    }

    public void setD1(Date1 d1) {
        this.d1 = d1;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getEdtion() {
        return edtion;
    }

    public void setEdtion(String edtion) {
        this.edtion = edtion;
    }

    
  @Override
    public String getInfo()
    {
        return "tittle:" + this.tittle + "author name:" + a1.getName() + "No:" + this.no + d1.getInfo() + "Gen:" + this.gen
                + "edtion:" + this.edtion;
    }

    @Override
    public boolean inLoan()
    {
       System.out.println("the book is in loan");
       return false;     // how to compare the date of return book that select from Libririan with the date of return book that select from Studant .
    }

  
    
    public Date1 getHistoryofborro(Date1 m) {
    return m;
    }
    public String setReturnDate(Date1 d) {
    return d.getInfo();
    }

    Calendar getHistoryofborro(java.util.Date d1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String setReturnDate(java.util.Date d2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

