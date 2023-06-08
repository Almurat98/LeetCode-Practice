package Practice;


import java.util.Arrays;
import java.util.stream.Stream;

public class Assignment {
    public static void main(String[] args) {


        String animal = "cat";
        String dish = "caramel shit";
        System.out.println(checkIfDishMatchName(animal,dish));

    }

    //Question-1 Animal Feast
    //All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the
    //dish must start and end with the same letters as the animal's name. For example, the great
    //blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
    //Write a method that takes the animal's name and dish as arguments and returns true or
    //false to indicate whether the beast is allowed to bring the dish to the feast.
    //Assume that beast and dish are always lowercase strings, and that each has at least two
    //letters. Beast and dish may contain hyphens and spaces, but these will not appear at the
    //beginning or end of the string. They will not contain numerals.
    public static boolean checkIfDishMatchName(String name,String dish){
        name = name.replace("-", "").replace(" ", "");
        dish = dish.replace("-", "").replace(" ", "");

        // Check if the dish starts and ends with the same letters as the animal's name

        if (dish.startsWith(String.valueOf(name.charAt(0))) && dish.endsWith(String.valueOf(name.charAt(name.length() - 1)))) {
            return true;
        } else {
            return false;
        }

    }


//Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
//return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
//lowercase.
//( Do not use String class functions other than charAt() and length()



        public static int findFirstUniqueVowel(String str){

        char[] vowels ={'a','e','i','o','u'};

        for (int i =0;i<str.length();i++){

        }







        }
















}
