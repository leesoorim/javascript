package study5;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		/* if 단순복습
		 * if(1==1 || 2==3) {
			System.out.println("33");
		}
		if(1==1 && 2==1) {
			System.out.println("66");
		}else {
			System.out.println("77");
		}*/
		
		int number = 2;
		
		switch(number) {
			case 1 : System.out.println("1입니다.");
			break;
			case 2 : System.out.println("2입니다.");
			break;
			case 3 : System.out.println("3입니다.");
			break;
			default : System.out.println("몰라요.");
		}
		// = 위아래 같은 내용
		if(number == 1) {
			System.out.println("1입니다.");
		}else if(number==2) {
			System.out.println("2입니다.");
		}else if(number==3) {
			System.out.println("3입니다.");
		}else {
			System.out.println("몰라요.");
		}
		
		
		char gender = 'M';
		switch(gender) {
			case 'M' : System.out.println("남성");
			break;
			case 'F' : System.out.println("여성");
			break;
			default : System.out.println("모름");
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.print("연산기호입력");
		
		int a = 10;
		int b = 20;
		String mark = ("+");
		switch(mark){
			case "+" : System.out.println(a+b);
			break;
			case "-" : System.out.println(a-b);
			break;
			case "*" : System.out.println(a*b);
			break;
			case "%" : System.out.println(a%b);
			break;
			default : System.out.println("오류");
		}
		
		if(mark.equals("+")) {
			System.out.println(a+b);
		}else if(mark.equals("-")) {
			System.out.println(a-b);
		}else {
				System.out.println("오류");
			}
		
		//switch(number>2) {	} (x) error
		//----------예제4
		
		String name = "홍길동";
		int pay = 100;
		int level = 1;
		switch(level) {
			case 1 : pay +=  30;
			break;
			case 2 : pay += 20;
			break;
			case 3 : pay += 10;
			break; // =>종료를 의미 다음 실행 x ,안써도 출력은 됨 근데 모든 현상이 실행됨, 마지막은 안써도 되는데 쓰는 게 좋음
		}
		System.out.println(pay);
		
		int age = 109;
		String msg ="";
		switch(age%10) {
			case 9 : msg = "올해 아홉수네요."; 
			break;
			default : msg = "평범한 한해~";
			// break; default 뒤에는 안 씀
		}
		System.out.println(msg);
		
		/*int n1 = 10;
		int n2 = 20;
		
		boolean result = n1 > n2;
		
		switch(result) {
			case true :
		}
		System.out.println(n1 > n2); boolean 사용 안됨
		*/
		
		
		
		
		
		
		
		
		
		
		}
		
	

	}


