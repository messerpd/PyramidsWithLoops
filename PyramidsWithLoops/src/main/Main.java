/*
 * Paul Messerly
 * messerpd@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

/*import java.util.Scanner;*/
 
public class Main {

	public static void main(String[] args) {
		int lines = 5;
		int RowCount = 1;
		for ( int i = lines; i > 0; i--)
		{
			for (int j = 1; j <= i; i++) 
				{
				
					System.out.print(" ");
				}
				for (int j = 1; j<= RowCount; j++)
				System.out.println(RowCount+"");
			
		System.out.println();
		RowCount++;
		}
	}
}
