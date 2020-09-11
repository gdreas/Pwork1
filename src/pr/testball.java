package pr;

import java.lang.*;
public class testball {
    public static  void main(String[] args){
        ball b1 = new ball("polyurethane");
        ball b2 = new ball("polyvinylchloride", 34);
        ball b3 = new ball(65);
        b1.setSize(124);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
