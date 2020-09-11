package pr;

import java.lang.*;
public class testdog {
    public static void main(String[] args) {
        dog d1 = new dog("Royal flush", 6); //my dog
        dog d2 = new dog("Jaromir", 7); //my cat... whatever
        dog d3 = new dog();
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
