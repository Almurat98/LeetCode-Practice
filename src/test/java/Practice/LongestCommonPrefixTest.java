package Practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void test1 (){
        LongestCommonPrefix lcp= new LongestCommonPrefix();
        String[]strs = new String[]{"flower","flow","flight"};
        String expected = "fl";
        String actual= lcp.longestCommonPrefix(strs);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test2 (){
        LongestCommonPrefix lcp= new LongestCommonPrefix();
        String[]strs = new String[]{"flower","leaf","tree"};
        String expected = "";
        String actual= lcp.longestCommonPrefix(strs);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void test3 (){
        LongestCommonPrefix lcp= new LongestCommonPrefix();
        String[]strs = new String[]{"cat"};
        String expected = "cat";
        String actual= lcp.longestCommonPrefix(strs);
        Assertions.assertEquals(expected,actual);
    }
}