package com.controlflowextra.controlextra;
import java.util.*;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-2 to find the position of customer
 */
public class CustomerPosition {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//reading customer names
		System.out.println("Enter the no of elements: ");
		int n=read.nextInt();
		ArrayList<String> cust=new ArrayList<String>();
		System.out.println("enter the customer names: ");
		for(int i=0;i<n;i++) {
			cust.add(read.next());
		}
		//finding position of customer
		System.out.println("enter the customer to find: ");
		String find=read.next();
		if(cust.contains(find)) {
			System.out.println("the position of customer is: "+(cust.indexOf(find)+1));
			
		}else
			System.out.println("-1");
		read.close();
			

		
	}

}
