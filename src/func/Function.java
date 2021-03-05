package func;

import java.util.Scanner;

public class Function implements IFunction {
	
	@Override	//2개 덧셈 기능
	public int add(int a, int b) {
		return a+b;
	}

	//3개 덧셈 기능
	@Override
	public int add(int a, int b, int c) {
		return a+b+c;

	}
	
	@Override	//2개 뺄셈 기능
	public int sub(int a, int b) {
		return a - b;
	}
	
	@Override
	public int sub(int a, int b, int c) {
		return a - b - c;
	}
	
	@Override	//2개 곱셈 기능
	public int mul(int a, int b) {
		int mul = a *b;
		return mul;
	}
	
	@Override //3개 곱셈 기능 
	public int mul(int a,int b,int c) {
		int mul=a*b*c;
		return mul;
	}
	
	@Override	//2개 나눗셈 기능
	public double div(int a, int b) {
		return (double)a/b;
	}
	@Override
	public double div(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (double)((a/b)/c);
	}
	
	

	public void twoCal(Scanner input,String sel) {
		
		System.out.print("a 입력 : ");
		int a= input.nextInt();
		System.out.print("b 입력 : ");
		int b= input.nextInt();
		switch (sel) {
		case "덧셈":
			System.out.println(a+" + "+b+" = "+add(a,b));
			break;
		case "뺄셈":
			System.out.println(a+" - "+b+" = "+sub(a,b));
			break;
		case "곱셈":
			System.out.println(a+" * "+b+" = "+mul(a,b));
			break;
		case "나눗셈":
			System.out.println(a+" / "+b+" = "+div(a,b));
			break;

		default:
			break;
		}
	}
	
	@Override
	public void treCal(Scanner input, String sel) {
		System.out.print("a 입력 : ");
		int a= input.nextInt();
		System.out.print("b 입력 : ");
		int b= input.nextInt();
		System.out.print("c 입력 : ");
		int c= input.nextInt();
		switch (sel) {
		case "덧셈":
			System.out.println(a+" + "+b+" + "+ c +" = "+add(a,b,c));
			break;
		case "뺄셈":
			System.out.println(a+" - "+b+" - "+ c +" = "+sub(a,b,c));
			break;
		case "곱셈":
			System.out.println(a+" * "+b+" * "+ c +" = "+mul(a,b,c));
			break;
		case "나눗셈":
			System.out.println(a+" / "+b+" / "+ c +" = "+div(a,b,c));
			break;

		default:
			break;
		}
	}

	public void menu(String sel, Scanner input) {
		System.out.println(sel +" 기능입니다.");
		System.out.println("1. 2개 숫자 입력 \t 2. 3개 숫자 입력");
		int key = input.nextInt();
		switch (key) {
		case 1:
			twoCal(input, sel);
			break;
		case 2:
			treCal(input, sel);
			break;

		default:
			break;
		}
		return;
	}





}
