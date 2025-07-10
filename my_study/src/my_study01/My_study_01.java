package my_study01;

import java.util.Scanner;

public class My_study_01 {

	public static void main(String[] args) {
		
		//// 기초 복습 ////
//		1. Hello, World! 출력하기
		System.out.println("Hello, World!");

//		출력값
//		Hello, World!
		
		
//		2. 변수 언선 및 출력
		int a = 10;
		float b = 10.0f;
		char c = 'c';
		String d = "String";
		System.out.println(a +" "+ b +" "+ c +" "+ d);
//		출력값
//		10 10.0 c String
		
//		3. 두 수 더하기
		int aa = 10;
		int bb = 15;
		System.out.println(aa + bb);
//		출력값
//		25
		
		
//		4. 사용자 입력 받고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력하세요 >> ");
//		String cc = sc.nextLine();
//		나는바보
//		System.out.println(cc);
//		출력값
//		나는바보
		
		
//		5. 문자열 연결하기
		String dd = "나는";
		String ee = "바보";
		System.out.println(dd+" "+ee);
//		출력값
//		나는 바보
		
		
		
//		6. 형변환
//		문자열 to 정수
		String f = "100";
		int g = Integer.parseInt(f);
		System.out.println(g+100);
//		g 에 정수로 바뀐 f 값이 들어간다
//		출력 : 200
		
		String ff = "50";
		float gg = Float.parseFloat(ff);
		System.out.println(gg+50);
//		출력 : 100.0
		
		int ab = 5;
		float ba = Float.valueOf(ab);
		System.out.println(ba);
//		출력 : 5.0
		
		float ac = 5.5f;
		int ca = (int)ac;
		System.out.println(ca);
//		출력 : 5
//		소수점 아래 값은 버려진다
		double ad = (int)ca;
		System.out.println(ad);
//		출력 : 5.0
		
		
//		7. 원 넓이 구하기 상수 사용하기 

		final double PI = 3.14;
		int radius = 7;
		double area = PI * radius * radius;
		System.out.println(area);
//		출력 : 153.86
		
//		8. 실수 값을 소수점 2자리까지 출력
		float flt = 6.94292f;
		System.out.printf("%.2f",flt);
//		출력 : 6.94
		
		
		
	}

}
