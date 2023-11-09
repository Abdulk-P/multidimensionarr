package day5;

import java.util.Scanner;

public class twodimensionarr {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		
		
		//int[][] nu = new int[2][2];
		
		//without using input method
		
//		int nu[][] = {{2,3}, {5,6}};
//		
//		for(int i=0; i<nu.length; i++ ) {
//			
//			for(int j=0; j<nu.length; j++ ) {
//				
//				System.out.print(nu[i][j]);
//			}
//			System.out.println();
//
//
//			
//		}
		
		
		
		//using input keyword for values of  two dimensanal arrray 
		System.out.println("Enter the how many row");
		int row = Sc.nextInt();
		
		System.out.println("Enter the how many col");

		int col = Sc.nextInt();
		
		int num[][] = new int[row][col];
		
		
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				
					
				System.out.print("Enter the value of " + i + " " + j + " : ");
				num[i][j] =Sc.nextInt();
				
				
			
			}
			
			
		}
		
		for(int i=0; i<num.length; i++ ) {
			
			for(int j=0; j<num[i].length; j++ ) {
				
				System.out.print(num[i][j] + " ");
			}
			System.out.println();


			
		}
		
		
		
		
	}

}
