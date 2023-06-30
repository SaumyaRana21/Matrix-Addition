package arrays;
import java.util.*;
public class Matrixaddition {
public static void main(String args[])
{
	Scanner kb=new Scanner (System.in);
	System.out.println("enter any dimensions of the array");
	int rows=kb.nextInt();
	int col=kb.nextInt();
	int a[][]=new int[rows][col];
	int b[][]=new int[rows][col];
	System.out.println("Enter a array elements");
	
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=kb.nextInt();
			}
		}
		System.out.println("Enter b array elements:");
	for(int i=0; i<rows;i++)
	{
		for (int j=0; j<rows;j++)
		{
			b[i][j]=kb.nextInt();
		}}
		int c[][]=new int [rows][col];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<col;j++) {
					c[i][j]=a[i][j]+b[i][j];
					}
			}
			System.out.println("The resultant c matrix is: ");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
				}
		
		
	
}}

