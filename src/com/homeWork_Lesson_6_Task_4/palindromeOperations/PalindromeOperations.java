package com.homeWork_Lesson_6_Task_4.palindromeOperations;

public class PalindromeOperations {
    /*
        The method converts a number to a string,
        a string to a character array.
        Then, in a loop, it compares the elements equidistant from the edges.
     */
    public static boolean isNumberPalindrome(long a){
        boolean isNumberPalindrome = false;

        String text = a + "";                               // change number to string
        char[] chars = text.toCharArray();                  // transform string to char array

        for (int i = 0; i < chars.length; i++) {            // comparison of equidistant elements
            if (chars[i] == chars[chars.length - 1 - i]){
                isNumberPalindrome = true;
            } else {
                isNumberPalindrome = false;
                break;
            }
        }

        System.out.println(isNumberPalindrome);
        return isNumberPalindrome;
    }
}
