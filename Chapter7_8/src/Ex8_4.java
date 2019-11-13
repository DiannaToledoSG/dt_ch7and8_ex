//HEADER 
//Program Name: Chapter 8 Exercise 4
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 11/12/2019
// Description:   Write a method called indexOfMax that takes an array of integers and returns 
//the index of the largest element. 
//Can you write this method using an enhanced for loop? Why or why not?
public class Ex8_4 {
	

	   public static int indexOfMax(int[] numbers){
		   //creates array
		
		      int index = 0;
		      for (int i=1;i<numbers.length;i++){
		         if (numbers[i] > numbers[index]){
		            index = i;
		            
		    		         }
		      }
		      return index; 
	   
	   }
}
		   

//You can write this as an enhanced for loop because essentially
//a for loop can be written as an enhanced one. however, it will be more 
//difficult to understand.

//* FOOTER
//* 
