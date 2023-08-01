package Practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        DesignBrowserHistory bh = new DesignBrowserHistory("leetcode.com");

        bh.visit("google.com");
     //   bh.visit("linkedin.com");
        //System.out.println("Forward 1 step: "+bh.forward(1));
        System.out.println("Back 7 step: "+ bh.back(7));
        System.out.println("Back 7 step: "+ bh.back(7));
//

//        bh.visit("apple.com");
//        bh.visit("oroe.com");
//        bh.visit("lego.com");
////        System.out.println("Forward 2 steps: "+ bh.forward(2));
////        System.out.println("Back 2 steps: "+bh.back(2));
//        System.out.println("Back 7 steps: "+bh.back(7));
//        bh.visit("cup.com");
//        System.out.println("Back 6 steps: "+bh.back(6));
//        System.out.println("Forward 9 steps: "+ bh.forward(9));

    }
}
