package edu.fra.uas;

public class Book extends Articld {
    private int pages;

    public int getPages(){
        return this.pages;
    }

    public void setPages(){
        if (pages <= 0) {
            System.err.println("Zero or less pages are not allowed");
        }
        this.pages=pages;
    }
 
    public void print(){
        super.print();
        System.out.println("Book: "+ pages);
    }
}
