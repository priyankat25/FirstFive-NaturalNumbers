package com.kodnest.fnn;

public class FirstFiveNaturalNumbers {
	public static void main(String[] args) {	
		int n = 1;
		int count = 0;
		while(true) {
			if(n%5 == 0) {
				n++;
				continue;
			}
			count++;
			System.out.print(n +" ");				
			n++;
			if(count == 10) {
				break;
			}
		}
		
		
		//   OR
		
//		int count = 0;
//		for(int i=1; ; i++) {
//			if(count != 10) {
//				if(i%5 != 0) {
//					count++;
//					System.out.print(i + " ");
//				}
//			}
//			else {
//				break;
//			}
//		}
	}
}