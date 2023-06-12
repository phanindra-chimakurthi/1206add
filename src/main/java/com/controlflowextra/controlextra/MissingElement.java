package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-3 to print the missing element in the distinct array range
 */
public class MissingElement {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//declaring array and reading inputs
		System.out.println("enter the value of N: ");
		int n=read.nextInt();
		int a[]=new int[n-1];
		//taking sum of n natural numbers
		int totalSum=(n*(n+1))/2;
		int sum=0;
		System.out.println("enter the values: ");
		for(int i=0;i<n-1;i++) {
			a[i]=read.nextInt();
			//sum of elements in array
			sum=sum+a[i];
		}
		System.out.println("Missing number is: "+(totalSum-sum));
		read.close(); 
	}

}
