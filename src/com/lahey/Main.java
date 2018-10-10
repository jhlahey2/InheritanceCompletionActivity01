package com.lahey;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<Product>();

        Book b1 = new Book();
        b1.setCode("book001");
        b1.setDescription("This is a book");
        b1.setPrice(44.95);
        b1.setAuthor("Kipling");
        b1.setPages(345);
        list.add(b1);

        Book b2 = new Book();
        b2.setCode("book002");
        b2.setDescription("This is a great book");
        b2.setPrice(4418.55);
        b2.setAuthor("Kurosowa");
        b2.setPages(345);
        list.add(b2);

        Software s1 = new Software();
        s1.setCode("soft001");
        s1.setDescription("This is a software");
        s1.setPrice(44.95);
        s1.setProgrammer(" Mark Shuttleworth");
        s1.setPlatform("linux");
        s1.setOs("Ubuntu");
        list.add(s1);

        //display product count
        System.out.printf("There are %d Products", Product.getCount());

        //for-each product display characteristics
        for(Product p : list)
        {
            System.out.println("\n");
            System.out.println("Code:\t" + p.getCode());
            System.out.println("Description: " + p.getDescription());
            System.out.println("Price:\t" + p.getPrice());
            if(p instanceof Book)
            {
                System.out.println("Author:\t" + ((Book)p).getAuthor());
                System.out.println("Pages:\t" + ((Book)p).getPages());
            }
            if(p instanceof Software)
            {
                System.out.println("Programmer:\t" + ((Software)p).getProgrammer());
                System.out.println("Platform:\t" + ((Software)p).getPlatform());
                System.out.println("OS:\t" + ((Software)p).getOs());
            }

        }//end for(Product p : list)

    }//end public static void main(String[] args)

}//end public class Main
