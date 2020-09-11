package pr;

import pr.book;

import java.lang.*;
public class testbook{
    public static  void main(String[] args){
        book b1 = new book("Alina", 15);
        book b2 = new book("Andjey", 400);
        book b3 = new book("Слово о полку Игореве");
        book b4 = new book(1437);
        b3.setVol_page(42);
        System.out.println(b3);
    }
}
