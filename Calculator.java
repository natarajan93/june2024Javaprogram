package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Method m = new Method();

		Scanner sc = new Scanner(System.in);

		Scanner numbers = new Scanner(System.in);

		Scanner sy = new Scanner(System.in);

		int add = 0, sub = 0, mul = 0;

		double div = 0;

		while (true) {
			if (add == 0 && sub == 0 && mul == 0 && div == 0) {
				System.out.println("Press ON/OFF Button");
			} else {
				System.out.println(
						"If you want to use the calculator Press Enter, or to turn it off Press the off button");

			}
			String a = "OFF";
			String status = sc.nextLine();
			if (!status.equalsIgnoreCase(a)) {

				if (add == 0 && sub == 0 && mul == 0 && div == 0) {

					System.out.println("Calculator is ON");
					System.out.println("Enter the Value");

					int num = numbers.nextInt();

					System.out.println("Enter the Symbal");

					char symbal = sy.next().charAt(0);

					System.out.println("Enter the Next Value");

					int num1 = numbers.nextInt();

					switch (symbal) {
					case '+':
						add = m.add(num, num1);
						System.out.println(add);
						break;

					case '-':
						sub = m.sub(num, num1);
						System.out.println(sub);
						break;

					case '*':
						mul = m.mul(num, num1);
						System.out.println(mul);
						break;

					case '/':
						div = m.div(num, num1);
						System.out.println(div);
						break;

					default:
						System.out.println("Enter the correct Symbal");

					}

				} else {
					System.out.println("Enter the Symbal");

					char sy1 = sy.next().charAt(0);

					System.out.println("Enter the Value");

					int n3 = numbers.nextInt();

					if (add != 0) {

						add = m.add1(add, n3, sy1);

						System.out.println(add);
					} else if (sub != 0) {

						sub = m.sub1(sub, n3, sy1);
						System.out.println(sub);
					}

					else if (mul != 0) {

						mul = m.mul1(mul, n3, sy1);
						System.out.println(mul);
					}

					else if (div != 0) {

						div = m.div1(div, n3, sy1);
						System.out.println(div);

					}
				}

			} else {

				System.out.println("Calculator is OFF");
				break;
			}
		}
	}
}
