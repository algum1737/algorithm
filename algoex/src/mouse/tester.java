package mouse;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;

public class tester {
	public static void main(String[] args) {
		try {
			Robot rb = new Robot();
			rb.mouseMove(500, 400);
			rb.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽
			rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			rb.delay(1000);
			rb.mouseMove(600, 400);
			rb.mousePress(InputEvent.BUTTON3_DOWN_MASK); // 마우스 오른쪽
			rb.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			
//			rb.mouseMove(610, 410);
//			rb.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽
//			rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
			/* 캡쳐 영역 */

			int x = 0, y = 0, width = 100, height = 100;

			 

			BufferedImage image = rb.createScreenCapture(new Rectangle(x, y, width, height));
			// 이미지 캡쳐부분
			// 이걸로 어찌할지 고민해보자!!
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("이동 실패");
		}
	}
}
