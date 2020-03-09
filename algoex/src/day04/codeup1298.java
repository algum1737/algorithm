package day04;

import java.util.Scanner;

public class codeup1298 {
	public static void main(String[] args) {
		long a,b,c,x,y;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		for(x=1; x<=c; x++) {
			for(y=1; y<=c; y++) {
				if(a*x+b*y==c) {
					System.out.println(x+","+y);
					return;
				}
			}			
		}
		System.out.println("Not Exist");
	}
	
	
}
