package com.controlflowextra.controlextra;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @author phanindra
 * @since 12/06/2023
 * @version JDK11
 *Question-8 to sort an array
 */
public class ListSort {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		ArrayList<Float> height=new ArrayList<Float>();
		for(int i=0;i<10;i++) {
			System.out.println("enter the elements: ");
			height.add(read.nextFloat());
		}
		List<Float> sortedList=height.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		read.close();
	}
	

}
