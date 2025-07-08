package Tests;

import Books.*;
import Exceptions.*;
import Services.Inventory;

public class BooksTesting {
    public static void main(String[] args) throws Exception {

        PaperBook paperBook1 = new PaperBook("100","Al-Nawawi Forty Hadith",2008
                ,90.0,5);
        PaperBook paperBook2 = new PaperBook("101","Forty Hadith",2015
                ,25.0,4);


        EBook ebook1 = new EBook("200","Sahih Muslim",2019
                ,50.0,"PDF");
        EBook ebook2 = new EBook("201","Rawdat Al Talibin",2013
                ,80.0,"PDF");


        DemoBook demoBook = new DemoBook("300","Majmu",2019,50.0);

        System.out.println("\nAdding books to inventory:");
        Inventory inventory = new Inventory();
        inventory.add(paperBook1);
        inventory.add(paperBook2);
        inventory.add(ebook1);
        inventory.add(ebook2);
        inventory.add(demoBook);
        System.out.println();

        System.out.println("Removing outdated books which older than 10 years:");
        inventory.removeOutdated(10);


        System.out.println("\nTrying to buy a removed book with ISBN (100):");
        try{
            inventory.buy("100",1,"","");
        }catch (BookNotFoundExcepiton e){
            System.out.println(e.getMessage()+'\n');
        }

        System.out.println("Trying to Buy paper book with quantity exceeding stock:");
        try{
            double paidPaperBook = inventory.buy("101",50,"","antar st, Birket El Sab");
            System.out.println("Total paid: "+paidPaperBook);
        }catch (OutOfStockException e){
            System.out.println(e.getMessage()+'\n');
        }

        System.out.println("Successful buying for paper book:");
        try {
            double paidPaperBook = inventory.buy("101",2,"","antar st, Birket El Sab");
            System.out.println("Total paid: "+paidPaperBook+'\n');
        }catch (Exception e){
            System.out.println(e.getMessage()+'\n');
        }


        System.out.println("Successful buying for ebook:");
        double paidEBook = inventory.buy("200",10,"sameh@gmail.com","");
        System.out.println("Total paid: "+paidEBook+'\n');

        System.out.println("Trying to buy demo book:");
        try{
            double paidDemoBook = inventory.buy("300",2,"","");
            System.out.println("Total paid: "+paidDemoBook);

        }catch (BuyingDemoExcption e){
            System.out.println(e.getMessage());
        }
    }
}