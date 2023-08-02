package Practice;

import java.util.Arrays;

class LongestCommonPrefix {

    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       int commonPrefix=0;
       String sFirst= strs[0];
       String sLast= strs[strs.length-1];
        while (commonPrefix<sFirst.length()){
           if( sFirst.charAt(commonPrefix)==sLast.charAt(commonPrefix)){
               commonPrefix++;
           }else {
               break;
           }
        }
      
       if(commonPrefix>0){
           return sFirst.substring(0,commonPrefix);
       }else {
           return "";
       }
    }
}