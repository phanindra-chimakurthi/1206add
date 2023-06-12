package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-10 give the product of remaining elements in array
 */
public class ProdNext {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//declaring arrays and reading inputs
		System.out.println("enter the no. of elements: ");
		int n=read.nextInt();
		int[] a=new int[n];
		int prod=1;
		System.out.println("enter the elements(value can be anything except 0): ");
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
		}
		//calculating product
		for(int i=0;i<n;i++) {
			prod=prod*a[i];
		}
		for(int i=0;i<n;i++) {
			a[i]=prod/a[i];
		}
		System.out.println(Arrays.toString(a));
		read.close();
	}

}
