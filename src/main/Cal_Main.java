package main;

import java.util.Scanner;

import func.Function;
import func.IFunction;

public class Cal_Main {

	public static void main(String[] args) {
		IFunction func = new Function();
		Scanner input = new Scanner(System.in);
		int a, b, result;
		
		while (true) {
			System.out.println("1.덧셈\t2.뺄셈\t3.곱셈\t4.나눗셈");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.println("덧셈 기능입니다. 두 숫자를 입력해주세요");
				System.out.print("a : ");
				a = input.nextInt();
				System.out.print("b : ");
				b = input.nextInt();
				result = func.add(a,b);
				System.out.println("덧셈 결과 : "+ result );
				break;
			case 2:
				System.out.println("뺄셈 기능입니다. 두 숫자를 입력해주세요");
				System.out.print("a : ");
				a = input.nextInt();
				System.out.print("b : ");
				b = input.nextInt();
				result = func.sub(a,b);
				System.out.println("뺄셈 결과 : "+ result );
				break;
			case 3:
				System.out.println("곱셈 기능입니다. 두 숫자를 입력해주세요");
				System.out.print("a : ");
				a = input.nextInt();
				System.out.print("b : ");
				b = input.nextInt();
				result = func.mul(a,b);
				System.out.println("곱셈 결과 : "+ result );
				break;
			case 4:
				System.out.println("나눗셈 기능입니다. 두 숫자를 입력해주세요");
				System.out.print("a : ");
				a = input.nextInt();
				System.out.print("b : ");
				b = input.nextInt();
				double result_d = func.div(a,b);
				System.out.println("나눗셈 결과 : "+ result_d );
				break;

			default:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
