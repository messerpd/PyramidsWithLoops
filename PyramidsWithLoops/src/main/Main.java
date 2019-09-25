/*
 * 9/25/2019
 * Paul Messerly
 * messerpd@ucmail.uc.edu
 * IS4010 App Dev w/ Java
 * Fall 2019
 * Printing pyramids using loops. This program generates the below triangle
 *  for lines = 1 through 9 (integers only) 
        1
       222
      33333
     4444444
    555555555 
*/
package main;

/*import java.util.Scanner;*/ //potentially implement user input
 
public class Main {

	public static void main(String[] args) {
		int lines = 5;			//input the height of the triangle
		for ( int i = 1; i <= lines; i++) //loop through each ayer of the triangle
		{
			for (int k = lines-i; k>=0;k--) //print spaces before integer output
			{
				System.out.print(" ");
			}
			System.out.print(i);		//print the first integer on the line
			for (int r = 1; r<=i*2-2;r++) //print the above integer i*2-2 times
			{
				System.out.print(i);
			}
			System.out.println("");		//Go to the next line of the pyramid
		
		}
	}
}
