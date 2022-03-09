import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution {
	 public static void main(String[] args) {
		 int[][] array = { {1, 2, 3}, {1, 1, 1}, {3, 4, 5}, {10, 20,30}};
		 int[] row = new int[4];
		 int[] col = new int[3];
		 
		 for(int i=0;i<array.length;i++) {
			 for(int j=0;j<array[i].length;j++) {
				 System.out.print("\t"+array[i][j]+"       ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=0;i<array.length; i++) {
			 for(int j=0;j<array[i].length;j++) {
				 row[i]  = row[i] + array[i][j];
				 col[j] = col[j] + array[i][j];
				 
			 }
			 for(int j=0; j<col.length;j++) {
				 System.out.print(" " +col[j]+"    ");
			 }
			 System.out.println();
		 }
		 
		 for (int i=0; i<4;i++)
				System.out.println("row #"+(i+1)+": "+ row[i]);
			for (int j =0; j<3;j++)
				System.out.println ("col #"+(j+1)+": "+ col[j]);
		 
		 
	  }
	        
	 
	 
	 public void duplicateElement() {
		 int[] array = {10,65,89,52,65,74,21,52,32,14,52,144,69,5,2,1,745,2,454,15,74,85,17,984,25,786,54,85,632,147,56};
		 for(int i=0; i<array.length-1; i++) {
			 for(int j=i+1; j<array.length;j++) {
				 if((array[i] == array[j]) && (i != j)) {
					 System.out.print(array[i] +", ");
					 break;
				 }
			 }
		 }
	 }
	 
	 public void kthLargest() {
		 int[] array = { 89, 10,  65, 21 , 14, 52, 144, 69, 5, 2, 1, 745, 454, 15, 74, 85, 17, 984, 25, 786, 54, 632, 147, 56};
		 int temp;
		 int k = 10;
		 for(int i=0; i<array.length-1; i++) {
			 for(int j=i+1; j<array.length; j++) {
				 if(array[i]>array[j]) {
					 temp = array[i];
					 array[i] = array[j];
					 array[j] = temp;
				 }
			 }
			 if(i == (k-1)) {
				 System.out.println(array[i]);
				 break;
			 }
		 }
		 for(int i=0;i<=array.length-1;i++) {
				System.out.print(array[i]+", ");
			}
	 }
	 
	 public void secondLargest() {
		 int[] array = {10,65,89,52,65,74,21,52,32,14,52,144,69,5,2,1,745,2,454,15,74,85,17,984,25,786,54,85,632,147,56};
		 int largestNumber = Integer.MIN_VALUE;
		 int secondLargest = Integer.MIN_VALUE;
		 for(int i=0; i<array.length; i++) {
			 if(array[i]>largestNumber) {
				 secondLargest = largestNumber;
				 largestNumber = array[i];
			 }
			 else if(array[i]>secondLargest && array[i]!=largestNumber) {
				 secondLargest = array[i];
			 }
		 }
		 System.out.println(secondLargest);
	 }
	 
	 public void insertionSort() {
		 int numberArray[] = {36,25,85,42,12,66,15};
		 int cardInHand, smallestCardAt, swap;
		 for(int i=0; i<numberArray.length-1;i++) {
			 cardInHand = numberArray[i+1];
			 smallestCardAt = i+1;
			 for(int j=i; j>=0; j--) {
				 if(numberArray[j]>cardInHand) {
					 smallestCardAt = j;
				 }
			 }
			 while(smallestCardAt>0) {
				 numberArray[smallestCardAt-1] = numberArray[smallestCardAt];
				 smallestCardAt = smallestCardAt-1;
			 }
		 }
		 for(int i=0;i<=numberArray.length-1;i++) {
				System.out.print(numberArray[i]+", ");
			}
	 }
	 
	 public static void selectionSort() {
		 int numberArray[] = {36,25,85,42,12,66,15};
			int minimum = Integer.MAX_VALUE;
			int minimumAt = -1;
			for(int i=0; i<=numberArray.length-1; i++) {
				minimum = numberArray[i];
				minimumAt = i;
				for(int j=i+1; j<=numberArray.length-1; j++) {
					if(numberArray[j] < minimum) {
						minimum = numberArray[j];
						minimumAt = j;
					}
				}
				numberArray[minimumAt] = numberArray[i];
				numberArray[i] = minimum;
			}
			for(int i=0;i<=numberArray.length-1;i++) {
				System.out.print(numberArray[i]+", ");
			}
	 }
}
