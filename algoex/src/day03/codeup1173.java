package day03;

import java.util.Scanner;

public class codeup1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 != 0) {

			n1 *= 60;
		} else {
			n1 = 24 * 60;
		}

		int n3 = n1 + n2;
		n1 = (n3 - 30) / 60;
		if (n1 == 24) {
			n1 = 0;
		}
		n2 = (n3 - 30) % 60;

		System.out.printf("%d %d", n1, n2);
	}
	/* if 없이 응용버전!
	 * 야매로 while이나 for 를 사용하지 않고 연산자만 사용해서 문제를 풀고 싶다면
	 * 
	 * %연산자를 이용해 overflow(넘침)를 응용하면 됩니다.
	 * 
	 * 
	 * 간단한 예시
	 * 
	 * getTime=hour*60+min; getTime=getTime-30; getTime=24*60+getTime;
	 * getTime=getTime%(24*60); hour=getTime/60;
	 * 
	 * 만약 getTime이 음수일경우(입력값이 0 5 같은) 전체 시간값(24*60)+getTime이 그대로 출력되고 getTime이 양수일
	 * 경우 전체 시간값(24*60)+getTime을 전체 시간값으로 나누었을때 나머지 값은 getTime만 출력된다.
	 * 
	 * 분까지 알려드린다면 답이 될수 있기 때문에 생략했습니다.
	 */
}
