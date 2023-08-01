package Practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        DesignBrowserHistory bh = new DesignBrowserHistory("leetcode.com");

        bh.visit("google.com");
      bh.visit("linkedin.com");
        bh.visit("apple.com");
        //System.out.println("Forward 1 step: "+bh.forward(1));
        System.out.println("Back 1 step: "+ bh.back(1));
        System.out.println("Back 1 step: "+ bh.back(1));

//        bh.visit("apple.com");
//        bh.visit("oroe.com");
//        System.out.println("Back 10step: "+ bh.back(10));
       System.out.println("Forward 1 steps: "+ bh.forward(1));



        bh.visit("lego.com");
        bh.visit("cup.com");
        bh.visit("phone.com");
        bh.visit("water.com");
        bh.visit("finger.com");
        bh.visit("foot.com");
         System.out.println("Forward 5 steps: "+ bh.forward(5));
         System.out.println("Forward 5 steps: "+ bh.forward(5));
        bh.visit("cat.com");
        System.out.println("Back 9 steps: "+bh.back(9));
        bh.visit("dog.com");
        bh.visit("lion.com");
        bh.visit("yoda.com");
        bh.visit("alien.com");
        System.out.println("Forward 4 steps: "+ bh.forward(4));
        bh.visit("paper.com");
        bh.visit("food.com");
        bh.visit("gaga.com");
//        System.out.println("Back 7 steps: "+bh.back(7));

//        System.out.println("Back 6 steps: "+bh.back(6));
//        System.out.println("Forward 9 steps: "+ bh.forward(9));

    }
}
