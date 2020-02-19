package day01;

import java.util.Scanner;



public class codeup1118 {

	public static void main(String[] args) {
		int a = 300;
		int b = 60;
		int c = 10;
		int d;
		Scanner sc = new Scanner(System.in);
		d = Integer.parseInt(sc.next());
		if(d%10==0) {
			System.out.printf("%d %d %d",d/a, d%a/b, d%a%b/c);
		}else {
			System.out.println(-1);
		}
		
	}
}
