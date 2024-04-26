/**
* File: Lab12Prob01.java
* Class: CSCI 1302
* Author: Jason Do, Charlie Hayslip
* Created on: April 26, 2024
* Last Modified: April 26, 2024
* Description:
*/


public class Lab12Prob01 {
	int n;
	
	public static void main(String[] args) {
		
	}
	
	public static int recursiveAbstract(int n) {
		if(n == 0){
			return 1;
		}
		else if(n == 1) {
			return 3;
		}
		else if(n == 2) {
			return 4;
		}
		else {
			return recursiveAbstract(n-3) * (recursiveAbstract(n-2) - recursiveAbstract(n-1));
		}
	}

}
