/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.library;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Library {
    private ArrayList <book> book = new ArrayList<>();
    private ArrayList<Studant> studant = new ArrayList<>();
 public Library() {
 
    }
    public ArrayList<book> getList() {
    return book;
    }

    public void setList(ArrayList<book> list) {
    this.book = list;
    }

    public ArrayList<Studant> getStudant() {
        return studant;
    }

    public void setStudant(ArrayList<Studant> studant) {
        this.studant = studant;
    }

    public void storeBook(book b)
    {
        
    book.add(b);
    }
    public String getBook (int index)
    {
      return book.get(index).getInfo();
        
    }
    public int NumOfBook ()
    {
    return book.size();
    }
    public void remove (int index){
        book.remove(index);      // to remve the selection book from the libririan
    }
    public void printAllBook()
    {
    if(!book.isEmpty())
    {
        for(int i=0;i<book.size();i++)
        {
            System.out.println(book.get(i).getInfo()); // to print all book
        }
    }
    else
        {
        System.out.println("No book in our Library");
        }
    }
    public boolean SearchTheExactBook (book c)
    {
        boolean found = true;
     for (book books :book )
     {
             if(books.getInfo().equals(c.getInfo()))
     return found;
     }
     return c.inLoan();
   }
   public void cheek (Date1 d1 , Date1 d2) throws ParseException
   {
    // Set borrow date
        LocalDate borrowDate = LocalDate.of(d1.getYear(),d1.getMounth(),d1.getDay());

        // Set return date
        LocalDate returnDate;
        returnDate = LocalDate.of(d2.getYear(), d2.getMounth(), d2.getDay());

        // Add 5 days to borrow date
        LocalDate extendedBorrowDate = borrowDate.plusDays(5);

        // Compare extended borrow date with return date
        if (extendedBorrowDate.isEqual(returnDate)) {
            System.out.println("The extended borrow date is equal to the return date.");
        } else if (extendedBorrowDate.isBefore(returnDate)) {
            System.out.println("The extended borrow date is after the return date.");
        } else {
            System.out.println("The extended borrow date is befor the return date.");
        }
    }
   public void cheakTheNumOfbook(int x)
   {
       if (x <= 3)
       {
           System.out.println("This Studant take the appropriate number of books");
       }
    else
           System.out.println("This studant is not take the inappropriate number of book");
     
       }
   public void addStudant(Studant s)
   {
       studant.add(s);
   }
   public void removeStudant (int index)
   {
       studant.remove(index);
   }
   public void printAllStudant()
    {
        for(int i=0;i<studant.size();i++)
        {
            System.out.println(studant.get(i).getInfo()); // to print all book
        }
    }
   public void searchBook(book c , int s)
   {
       switch(s)
       {
           case 1:
            for (book books :book )
     {
             if (books.getTittle().equals(c.getTittle()));
             System.out.println("The book in this name is found");
             System.out.println(books.getInfo());
             break;
     }
            System.out.println("No book in this name is found in our library");
            break;
           case 2:
            for (book books :book )
     {
             if (books.getNo()==(c.getNo()));
             System.out.println("The book in this no is found");
             System.out.println(books.getInfo());
             break;
     }
           System.out.println("No book in this no is found in our library"); 
            break;
           case 3:
             for (book books :book )
     {
             if (books.getA1().getName().equals(c.getA1().getName()));
             System.out.println("The book in this Author name is found");
             System.out.println(books.getInfo());
             break;
     }
            System.out.println("No book in this Author name is found in our library");   
             break;
       }
   }
    public static void main(String[] args) throws ParseException {
    Library l1 = new Library();
    Scanner scan = new Scanner(System.in);
    int x;
    String m = "The Menu:"
            + "1- add the book to the library"
            + "2- remove the book from library"
            + "3- cheak the number of book in the libraby"
            + "4- print all the book in the library"
            + "5- cheak if the studant return the book after five days from borrow's day"
            + "6- cheak if the Studan take the appropriate number of books or not"
            + "7- shearch the exact book you nedded if is found"
            + "8- get book"
            + "9- add Studant"
            + "10 - remove Studant"
            + "11- add Magazine"
            + "12 add journal"
            + "Search a book from it name or it no or it Author Name"
            + "14- Exit";
    do 
    {
        System.out.println("This program is intended for librarians only");
        System.out.println(m);
        System.out.println("Enter what you need from this programme");
        x = scan.nextInt();
    switch (x)
    {
        case 1:
            System.out.println("Now!The information of the book's Author");
            System.out.println("Enter the id of an author");
            int id = scan.nextInt();
            System.out.println("Enter the Name of an author");
            String AuthorName = scan.next();
            System.out.println("Enter the address of an author");
            int address =scan.nextInt();
            System.out.println("Now!The BirthDate of an author");
            System.out.println("Enter the day of birth of author");
            int d1 = scan.nextInt();
            System.out.println("Enter the mounth of birth of author");
            int m1 = scan.nextInt();
            System.out.println("Enter the year of birth of author");
            int y1 = scan.nextInt();
            Date1 d2;
            d2 = new Date1 (d1,m1,y1);
            Author a1 = new Author(id,AuthorName,d2,address);
            System.out.println("Now!The information of a book");
            System.out.println("Now!The no of a book");
            int no = scan.nextInt();
            System.out.println("Now!The realseDate of a book");
            System.out.println("Enter the day of realse of a book");
            int d4 = scan.nextInt();
            System.out.println("Enter the mounth of realse of a book");
            int m4 = scan.nextInt();
            System.out.println("Enter the year of realse of a book");
            int y4 = scan.nextInt();
            Date1 d3 = new Date1 (d4,m4,y4);
            System.out.println("Enter the genre of a book");
            String gen = scan.next();
            System.out.println("Enter the edittion of a book");
            String edtion = scan.next();
            System.out.println("Enter the tittle of a book");
            String tittle = scan.next();
            book b1 = new book (tittle,a1,no,d3,gen,edtion);
            l1.storeBook(b1);
        break;

        case 2:
           l1.printAllBook();
           System.out.println("Enter the index of book that you want to remove from the library");
           int y = scan.nextInt();
           l1.remove(y);
            break;
        case 3:
          System.out.println("the Number of book is   " + l1.NumOfBook());
            break;
        case 4:
           l1.printAllBook();
            break;
        case 5:
            System.out.println("Now!The Date of borrow book");
            System.out.println("Enter the day of borrow book");
            int d6 = scan.nextInt();
            System.out.println("Enter the mounth of borrow book");
            int m6 = scan.nextInt();
            System.out.println("Enter the year of borrow book");
            int y6 = scan.nextInt();
            Date1 s1 = new Date1 (d6,m6,y6);
            System.out.println("Now!The Date of return book");
            System.out.println("Enter the day of return book");
            int d9 = scan.nextInt();
            System.out.println("Enter the mounth of return book");
            int m9 = scan.nextInt();
            System.out.println("Enter the year of return book");
            int y9 = scan.nextInt();
            Date1 s2 = new Date1 (d9,m9,y9);
            l1.cheek(s1, s2);
            break;
        case 6:
         System.out.println("Enter the number of book that studant take");
         int aa = scan.nextInt();
         l1.cheakTheNumOfbook(aa);
         break;
        case 7:
            
            System.out.println("enter the information of book");
            System.out.println("Now!The information of the book's Author");
            System.out.println("Enter the id of an author");
            int id1 = scan.nextInt();
            System.out.println("Enter the Name of an author");
            String AuthorName1 = scan.next();
            System.out.println("Enter the address of an author");
            int address1 =scan.nextInt();
            System.out.println("Now!The BirthDate of an author");
            System.out.println("Enter the day of birth of author");
            int d10 = scan.nextInt();
            System.out.println("Enter the mounth of birth of author");
            int m10 = scan.nextInt();
            System.out.println("Enter the year of birth of author");
            int y10 = scan.nextInt();
            Date1 d88;
            d88 = new Date1 (d10,m10,y10);
            Author a11 = new Author(id1,AuthorName1,d88,address1);
            System.out.println("Now!The information of a book");
            System.out.println("Now!The no of a book");
            int no1 = scan.nextInt();
            System.out.println("Now!The realseDate of a book");
            System.out.println("Enter the day of realse of a book");
            int d44 = scan.nextInt();
            System.out.println("Enter the mounth of realse of a book");
            int m44 = scan.nextInt();
            System.out.println("Enter the year of realse of a book");
            int y44 = scan.nextInt();
            Date1 d33 = new Date1 (d44,m44,y44);
            System.out.println("Enter the genre of a book");
            String gen1 = scan.next();
            System.out.println("Enter the edittion of a book");
            String edtion1 = scan.next();
            System.out.println("Enter the tittle of a book");
            String tittle1 = scan.next();
            book b5 = new book (tittle1,a11,no1,d33,gen1,edtion1);
            l1.SearchTheExactBook(b5);
            break;
        case 8:
        System.out.println("Enter the idex of the book you nedded");
        int index = scan.nextInt();
        System.out.println(l1.getBook(index)); // to cheak the index of book
            break;
        case 9:
            System.out.println("enter the information of a studant");
            System.out.println("Now!The information of the book's Author");
            System.out.println("Enter the id of an author");
            int id4 = scan.nextInt();
            System.out.println("Enter the Name of an author");
            String Name4 = scan.next();
            System.out.println("Enter the address of an author");
            int address4 =scan.nextInt();
            System.out.println("Now!The BirthDate of an author");
            System.out.println("Enter the day of birth of author");
            int d100 = scan.nextInt();
            System.out.println("Enter the mounth of birth of author");
            int m100 = scan.nextInt();
            System.out.println("Enter the year of birth of author");
            int y100 = scan.nextInt();
            Date1 d90;
            d90 = new Date1 (d100,m100,y100);
            System.out.println("Enter the major of the studant");
            String Major = scan.next();
            Studant p1 = new Studant(id4,Name4,d90,address4,Major);
            l1.addStudant(p1);
            break;
        case 10:
            l1.printAllStudant();
            System.out.println("Enter the index of who studant you want to remove from the Library List");
            int index3 = scan.nextInt();
            l1.removeStudant(index3);  
        break;
        case 11:
           System.out.println("Now!The information of the Magazin's Author");
            System.out.println("Enter the id of an author");
            int id2 = scan.nextInt();
            System.out.println("Enter the Name of an author");
            String AuthorName2 = scan.next();
            System.out.println("Enter the address of an author");
            int address2 =scan.nextInt();
            System.out.println("Now!The BirthDate of an author");
            System.out.println("Enter the day of birth of author");
            int d12 = scan.nextInt();
            System.out.println("Enter the mounth of birth of author");
            int m12 = scan.nextInt();
            System.out.println("Enter the year of birth of author");
            int y12 = scan.nextInt();
            Date1 d21;
            d21 = new Date1 (d12,m12,y12);
            Author a21 = new Author(id2,AuthorName2,d21,address2);
            System.out.println("Now!The information of a Magazine");
            System.out.println("Now!The no of a Magazine");
            int no2 = scan.nextInt();
            System.out.println("Now!The realseDate of a Magazine");
            System.out.println("Enter the day of post of a Magazine");
            int d42 = scan.nextInt();
            System.out.println("Enter the mounth of post of a Magazine");
            int m42 = scan.nextInt();
            System.out.println("Enter the year of post of a Magazine");
            int y42 = scan.nextInt();
            Date1 d34 = new Date1 (d42,m42,y42);
            System.out.println("Enter the genre of a Magazine");
            String gen2 = scan.next();
            System.out.println("Enter the edittion of a Magazine");
            String edtion2 = scan.next();
            System.out.println("Enter the tittle of a Magazine");
            String tittle2 = scan.next();
            System.out.println("enter the issueNo of a magazine");
            int issueNo = scan.nextInt();
            System.out.println("Enter the information of a release date");
            System.out.println("Enter the day of realse of a Magazine");
            int d41 = scan.nextInt();
            System.out.println("Enter the mounth of realse of a Magazine");
            int m41 = scan.nextInt();
            System.out.println("Enter the year of realse of a Magazine");
            int y41 = scan.nextInt();
            Date1 releaseDate = new Date1 (d41,m41,y41);
            book b13 = new Magazine (tittle2,a21,no2,d34,gen2,edtion2,releaseDate,issueNo); 
            l1.storeBook(b13);
            break;
        case 12:
            System.out.println("Now!The information of the Journals's Author");
            System.out.println("Enter the id of an author");
            int id5 = scan.nextInt();
            System.out.println("Enter the Name of an author");
            String AuthorName5 = scan.next();
            System.out.println("Enter the address of an author");
            int address5 =scan.nextInt();
            System.out.println("Now!The BirthDate of an author");
            System.out.println("Enter the day of birth of author");
            int d5 = scan.nextInt();
            System.out.println("Enter the mounth of birth of author");
            int m5 = scan.nextInt();
            System.out.println("Enter the year of birth of author");
            int y5 = scan.nextInt();
            Date1 d55;
            d55 = new Date1 (d5,m5,y5);
            Author a3 = new Author(id5,AuthorName5,d55,address5);
            System.out.println("Now!The information of a Journal");
            System.out.println("Now!The no of a Journal");
            int no5 = scan.nextInt();
            System.out.println("Now!The realseDate of a Journal");
            System.out.println("Enter the day of realse of a Journal");
            int d46 = scan.nextInt();
            System.out.println("Enter the mounth of realse of a Journal");
            int m45 = scan.nextInt();
            System.out.println("Enter the year of realse of a Journal");
            int y45 = scan.nextInt();
            Date1 d37 = new Date1 (d46,m45,y45);
            System.out.println("Enter the genre of a Journal");
            String gen5 = scan.next();
            System.out.println("Enter the edittion of a Journal");
            String edtion5 = scan.next();
            System.out.println("Enter the tittle of a Journal");
            String tittle5 = scan.next();
            System.out.println("Enter Conference Journal");
            String Conference_Name = scan.next();
            System.out.println("Enter Conferance No");
            int Conference_No = scan.nextInt();
            book b16 = new Journals (tittle5,a3,no5,d37,gen5,edtion5,Conference_Name,Conference_No);
            l1.storeBook(b16);
            break;
        case 13:
            book cc = new book ();
            Author a4 = new Author();
            System.out.println("The menu");
            System.out.println("1- Search obout the book from it name");
            System.out.println("2- search about the book from it no");
            System.out.println("3- Search about the book from it AuthorName");
            System.out.println("------------------------------");
            System.out.println("Enter the name of a book");
            String k = scan.next();
            cc.setTittle(k);
            System.out.println("Enter The name of an Authour");
            String k1 = scan.next();
            cc.getA1().setName(k1);
            System.out.println("Enter the no of book");
            int k3 = scan.nextInt();
            cc.setNo(k3);
            System.out.println("Enter what you need from this menu");
            int rx = scan.nextInt();
            l1.searchBook(cc, rx);
            break;
         case 14:
            System.exit(0);
        default:
            System.out.println("No other choices");
    }
    }
    while (true);
    
   

    }

    private void cheek(book b1, String m, int d1, Date1 d2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  

