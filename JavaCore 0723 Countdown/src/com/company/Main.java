package com.company;

/*
0723 Countdown
Write a program that counts down from 30 to 0,
and at the end displays the text “Boom!”.
The program should reduce the number 10 times per second.
To insert a delay into the program, use the function:
Thread.sleep (100); // one tenth of a second delay.
Example:
thirty
29th
...
1
0
Boom!

Requirements:
1. The program should not read data from the keyboard.
2. The program should display a countdown from 30 to 0. Each digit on a new line.
3. The program should output "Boom!" after the countdown.
4. The program should use the method "Thread.sleep (100);" 30 times.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        for(int i=30; i>=0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Boom!");
    }
}








