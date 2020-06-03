package display;

import java.awt.*;

public class Display {

	static Frame f;
	static Dialog dl;
	static Choice cho;

	public static void main(String[] args) {
		f = new Frame();
		f.setSize(900, 700);
		f.setLayout(null);
		System.out.println("콘솔창 출력 메서드");

		f.setVisible(true);

	}

}
