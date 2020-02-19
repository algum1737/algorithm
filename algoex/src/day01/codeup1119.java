package day01;

import java.util.Scanner;



public class codeup1119 {

	public static void main(String[] args) {
		int a, b;
		double c;
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = (double)a*b/2;
		System.out.printf("%.1f",c);
		
	}
}
