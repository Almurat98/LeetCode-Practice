package week2;

import java.util.stream.Stream;

public class Assignment_W2 {



    //Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After
    //Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter.
    //When writing on Twitter, he is known for almost always capitalizing every word. For
    //simplicity, you'll have to capitalize each word, check out how contractions are expected to
    //be in the example below.
    //Your task is to write a method that converts strings to how they would be written by Jaden
    //Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the
    //same way he originally typed them.
    //Note that this function should a return empty string for an empty string or null.
    //Example:
    //Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
    //Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"'


    public static void main(String[] args) {


        System.out.println(getJadenCasedSentence("How can mirrors be real if our eyes aren't real"));
    }

    private static String getJadenCasedSentence(String str) {

    String[] strArray = str.split(" ");

        String capitalizedSentence = "";

        for (String s : strArray){
            String firstLetter= s.substring(0,1).toUpperCase();
            String otherLetters= s.substring(1).toLowerCase();

            capitalizedSentence+= firstLetter+otherLetters+" ";
        }

        return capitalizedSentence.trim();

    }


    private static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        char[] array = phrase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}
