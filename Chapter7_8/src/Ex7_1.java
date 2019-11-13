//HEADER 
//Program Name: Chapter 7 Exercise 1
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/12/2019
// Description: Draw a table that shows the value of the variables i and n during the execution of loop. The table should contain one column for each variable and one line for each iteration.
//What is the output of this program?
//Can you prove that this loop terminates for any positive value of n?
public class Ex7_1 {


public static void main(String[] args) {
    loop(10);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
}
}
//1. n: constantly 10
//   I: 10 -> 5 -> 6 -> 3 -> 3 -> 4 -> 2
//2. 10
//    5
//    6
//    3
//    4
//    2
//3. If i will always be = to n. Then the statement will 
//always be true. 

//* FOOTER
//* 
//2. 10
//5
//6
//3
//4
//2
//
