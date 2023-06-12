package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-9 Program to print elements whose pair sum is 10
 */
public class Sum10 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//reading the no of elements and creating arrays
		System.out.println("enter the no of elements: ");
		int n=read.nextInt();
		int a[] =new int[n];
		int b[]=new int[n];
		boolean flag=false;
		//creating array list
		ArrayList<Integer> c=new ArrayList<Integer>();
		System.out.println("enter the elements of array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=read.nextInt();
		}
		//checking if sum is 10 for pair elements
		for(int i=0;i<(a.length-1);i++) {
			if((a[i]+a[i+1])==10) {
				  b[i]=a[i];
				  b[i+1]=a[i+1];		
		}
		}
		//adding elements to arraylist
		for(int j=0;j<b.length;j++) {
			if(b[j]>0) {
				c.add(b[j]);
				flag=true;
				
			}
		}
		//printing according to given condition
	    if(flag) {
	    	System.out.println(c);
	    }else
	    	System.out.println("-1");
		
		read.close();
		
	}
}


