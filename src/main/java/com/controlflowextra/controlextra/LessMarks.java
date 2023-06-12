package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-5 find Students who got less marks than average of total class marks
 */
public class LessMarks {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//taking no of inputs
		System.out.println("enter the no of elements: ");
		int n=read.nextInt();
		//creating arraylist and reading inputs
		ArrayList<Integer> ar=new ArrayList<Integer>();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			ar.add(read.nextInt());
		}
		//calculating average of class
		int j=ar.stream().reduce(0,(ans,i)->ans+i);
		int avg=j/n;
		//creating another arraylist and adding the index of students whose marks are less than average
		ArrayList<Integer> index=new ArrayList<Integer>(); 
		for(Integer k:ar) {
			if(k<avg) {
				index.add(ar.indexOf(k));
			}
		}
		System.out.println(index);
		read.close();
	}

}
