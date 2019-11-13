//HEADER 
//Program Name: Chapter 8 Exercise 2
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/12/2019
// Description: For each method, write one sentence 
//that describes what the method does,
//without getting into the details of how it works.
//For each variable, identify the role it plays.

public class Ex8_2 {


//***********part1 ***************
public static int banana(int[] a) { 
	//banana is the name of the calculation
    int kiwi = 1;
    //kiwi is the name for the Array
    int i = 0;
    while (i < a.length) {
        kiwi = kiwi * a[i];
        i++;
    }
    return kiwi;
}
//Creates the product of multiplying all elements in "a"


//*********** part 2 **************

public static int grapefruit(int[] a, int grape) {
    //grapefruit is the name of the calculation
	for (int i = 0; i < a.length; i++) {
        if (a[i] == grape) {
     //grape is the Array
            return i;
        }
    }
    return -1;
 //Finds the index for first of "grape" and returns -1 if not found.
}

//*********** part 3 **************
public static int pineapple(int[] a, int apple) {
	//pineapple is the name of the calculation
    int pear = 0;
    //pear is int name
    for (int pine: a) {
        if (pine == apple) {
            pear++;
        }
    }
    return pear;
   
    //Counts the total of "apple" in "a", returns pear if none.
	
}
}
//* FOOTER
 //* Errors
//
