package com.homeWork_Lesson_6_Task_4;

import com.homeWork_Lesson_6_Task_4.palindromeOperations.PalindromeOperations;

import java.util.Scanner;

/**
 * ЗАДАНИЕ 4
 * 	Написать метод для проверки является ли число палиндромом.
 *
 * 	Что практикуем в этом задании:
 * 		- построение алгоритмов
 * 		- управляющие конструкции, операции ветвления
 *
 * 	Палиндро́м — число,  одинаково читающееся в обоих направлениях. Например, число 101;	 [Wiki]
 */
public class HomeWork_Lesson_6_Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           // scanner opened
        System.out.println("Press a number: ");
        long x = scanner.nextInt();

        scanner.close();                                    // scanner closed

        PalindromeOperations.isNumberPalindrome(x);
    }
}
