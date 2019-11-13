//HEADER 
//Program Name: Chapter 8 Exercise 3
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/12/2019
// Description: What is the output of the following program? 
//Describe in a few words what mus does. 
//Draw a stack diagram just before mus returns.

public class Ex8_3 {

	public static void main1(String[] args) { }
		
//The following program has the final output of 30. "mus" calculates the addition
//of all the elements in "zoo"
	
public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = i + 1;
    }
    return a;
}
public static void dub(int[] jub) {
    for (int i = 0; i < jub.length; i++) {
        jub[i] *= 2;
    }
}
public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
        fus += zoo[i];
    }
    return fus;
}
public static void main(String[] args) {
    int[] bob = make(5);
    dub(bob);
    System.out.println(mus(bob));
}
	}
/*
 * bob [] -> make | n [5] a [] | -> [1|2|3|4|5]
 * bob [] -> dub | jub [bob[]]| -> [2|4|6|8|10]
 * mus | zoo [bob []] fus [30]|
 * 
 * output:30
 */

//* FOOTER
//* 