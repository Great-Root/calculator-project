package func;

import java.util.Scanner;

public interface IFunction {
	
	//덧셈기능
	int add(int a, int b);
	//3개 숫자 덧셈기능
	int add(int a, int b,int c);
	
	//뺄셈기능
	int sub(int a, int b);
	//3개 숫자 뺄셈기능
	int sub(int a, int b,int c);
	
	//곱셈기능
	int mul(int a, int b);
	//3개 숫자 곱셈기능
	int mul(int a, int b,int c);
	
	//나눗셈기능
	double div(int a, int b);
	//3개 숫자 나눗셈기능
	double div(int a, int b,int c);
	
	
	//숫자 2개 입력 기능
	public void twoCal(Scanner input,String sel);
	//숫자 3개 입력 기능
	public void treCal(Scanner input,String sel);
	
	//메뉴 입력 기능
	public void menu(String sel, Scanner input);

}
