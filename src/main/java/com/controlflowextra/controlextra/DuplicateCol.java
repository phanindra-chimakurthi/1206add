package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-4 to find duplicates in a collection
 */
public class DuplicateCol {
	public static void main(String[] args) {
		boolean flag=false;
		//creating arraylist 
		Scanner read=new Scanner(System.in);
		System.out.println("enter the no of elements: ");
		int n=read.nextInt();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		System.out.println("enter th elements:");
		for(int i=0;i<n;i++) {
			ar.add(read.nextInt());
		}
		//finding for duplicates using set add method
		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> dup=new HashSet<Integer>();
		for(Integer i:ar) {
			if(!s.add(i)) {
				dup.add(i);
				flag=true;
			}
		}
		if(flag) {
			System.out.println(dup);
		}else {
			System.out.println("-1");
		}
		
		read.close();
	}

}
