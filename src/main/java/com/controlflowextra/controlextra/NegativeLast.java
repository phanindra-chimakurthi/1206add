package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-1 To arrange negative numbers to last of array
 */
public class NegativeLast {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//declaring array
		System.out.println("enter the no of elements: ");
		int n=read.nextInt();
		System.out.println("enter the elements: ");
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
		}
		//decalring another array and sorting them according to condition
		int newarr[]=new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				newarr[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				newarr[count]=a[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(newarr));
		read.close();
	}

}
