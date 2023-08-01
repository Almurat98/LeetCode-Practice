package week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmostEquivalentTest {

    @Test
    void test1(){
        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
        String [] s = new String[]{"acccc","bbb","abb"};
        String [] t = new String[]{"aaccb","aaa","ac"};
        String[] expected = new String[]{"YES","YES","NO"};
        String[] actual= almostEquivalent.almostEqual(s, t);
        //Assertions.assertEquals(actual,expected);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    void test2(){
        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
        String [] s = new String[]{"acccc","bbb"};
        String [] t = new String[]{"","aaa"};
        String[] expected = new String[]{"NO","YES"};
        String[] actual= almostEquivalent.almostEqual(s, t);
        //Assertions.assertEquals(actual,expected);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    void test3(){
        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
        String [] s = new String[]{"acccc","bbb"};
        String [] t = new String[]{"aaa"};
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> almostEquivalent.almostEqual(s,t)
                );

    }
    @Test
    void test4(){
        AlmostEquivalent almostEquivalent = new AlmostEquivalent();
        String [] s = new String[]{};
        String [] t = new String[]{};
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> almostEquivalent.almostEqual(s,t)
        );
    }
}