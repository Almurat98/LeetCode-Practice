package week8;

import java.util.*;

public class AlmostEquivalent {
//    Two strings are considered “almost equivalent” If they have the same length AND for each
//    lowercase letter x, the number of occurrences of x in the two strings differ by no more than 3.
//    There are two arrays of strings, arrays s and t. Strings s[i] and t[i] make the i
//    th pair. They are of
//    equal length and consist of lowercase English letters. For each pair of strings, determine if they
//    are almost equivalent. Return an array of / strings, either 'YES' or "NO', one for each pair.


//Example
 //s = [aabaab, saaaabb]
//t = [bbabbc, ab]
// s[0] t[0] difference
//a 4 1 3
//b 2 4 2
//c 0 1 1
//s[1] t[1] difference
//a 5 1 4
//b 2 2 0



    //loop through string, put char as key, and number of appearance as value in a map
    public static void main(String[] args) {
        String [] s = new String[]{"acccc","bbb"};
        String [] t = new String[]{"aaccb","aaa"};

        System.out.println(Arrays.toString(almostEqual(s, t)));

    }


    public static String[] almostEqual(String[]sr1, String[]sr2){
        String [] result = new String[2];
        for (int i = 0; i < sr1.length; i++) {
            String str1 = sr1[i];
            String str2 = sr2[i];
            if(str1.length()!=str2.length()){
                result[i]="NO";
                continue;
            }
            Map<Character, Integer> map1 = countCharacters(str1);
            Map<Character, Integer> map2 = countCharacters(str2);
            boolean isAlmostEqual = true;
            for (char c :str1.toCharArray()) {
                int countOfM1 = 0;
                int countOfM2 = 0;
                if (!map1.containsKey(c)) {
                    countOfM1 = 0;
                    countOfM2 = map2.get(c);
                    if (Math.abs(countOfM1 - countOfM2) > 3) {
                        isAlmostEqual = false;
                        break;
                    }
                }
                if (!map2.containsKey(c)) {
                    countOfM1 = map1.get(c);
                    countOfM2 = 0;
                    if (Math.abs(countOfM1 - countOfM2) > 3) {
                        isAlmostEqual = false;
                        break;
                    }
                } else {
                    countOfM1 = map1.get(c);
                    countOfM2 = map2.get(c);
                    if (Math.abs(countOfM1 - countOfM2) > 3) {
                        isAlmostEqual = false;
                        break;
                    }
                }
            }
            if(isAlmostEqual){
                result[i]="YES";
            }else {
                result[i]="NO";
            }

        }
        return result;
    }

    public static Map<Character,Integer> countCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < str.length(); j++) {
            if (map.containsKey(str.charAt(j))) {
                int count = map.get(str.charAt(j));
                map.put(str.charAt(j), count + 1);
            } else {
                map.put(str.charAt(j), 1);
            }
        }
        return map;
    }

}
