package edu.fra.uas;

public class Start {
    
    public static void main(String[] args) {
        Articld a = new Articld();
        Book b = new Book();
        Articld c = a;                   

        
        a.setPrice(3.99);
    
        b.setPrice(12.43);

        a.print();
        b.print();

       //System.out.println(a.toString());
       //System.out.println(b.toString());
       //System.out.println(c.toString());


    }
}
