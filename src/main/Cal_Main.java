package main;

import java.util.HashMap;
import java.util.Scanner;

import func.Function;
import func.IFunction;

public class Cal_Main {
	
	public static void main(String[] args) {
		IFunction func = new Function();
		Scanner input = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "덧셈"); map.put(2, "뺄셈"); map.put(3, "곱셈"); map.put(4, "나눗셈");
		
		while (true) {
			System.out.println("1.덧셈\t2.뺄셈\t3.곱셈\t4.나눗셈\t 5.프로그램 종료");
			int key = input.nextInt();
			
			//5입력 하면 프로그램 종료
			if(key == 5) { break;}
			
			//메뉴 불러오기
			func.menu(map.get(key),input);
		}
		
	}
}
