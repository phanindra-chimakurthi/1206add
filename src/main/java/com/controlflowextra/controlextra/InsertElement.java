package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-6 to insert element at specified position into array
 */
public class InsertElement {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter the no.of elements: ");
		int n=read.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=read.nextInt();
		}
		System.out.println("enter the element to add: ");
		int add=read.nextInt();
		System.out.println("enter the index to add: ");
		int index=read.nextInt();
		int newarr[]=new int[n+1];
		for(int i=0;i<n+1;i++) {
			if(i<index-1) {
				newarr[i]=a[i];
			}else if(i==(index-1)) {
				newarr[i]=add;
			}else if(i>index-1) {
				newarr[i]=a[i-1];
			}
		}
		System.out.println(Arrays.toString(newarr));
		read.close();
	}

}
