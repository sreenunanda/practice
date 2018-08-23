package Testcases;

import org.testng.annotations.Test;

public class DiffentTypeofLoops {

	@Test(enabled = false)
	private void infinitiveFor() {
		for (;;) {
			System.out.println("...");
		}
	}

	@Test
	public void whileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println("next i :" + i);
			i++;
		}
	}

	@Test(enabled = false)
	public void whileLoopInfinitive() {
		while (true) {
			System.out.println("whileLoopInfinitive");
		}
	}

	@Test
	public void doWhileLoop() {
		int i = 1;
		do {

			System.out.println(i);
			i++;
		} while (i < 2);
	}
}
