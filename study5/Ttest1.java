package study5;

public class Ttest1 {

	public static void main(String[] args) {

		// 5강 실습1
		int age = 22;
		String call = "";
		String okay = "";
		
		if(age<20) {
			call = "미성년자";
			okay = "불가능";
		}else {
			call = "성인";
			okay = "가능";
		}
		System.out.println(age+"세는 "+call+"로 담배 판매가 "+okay+"합니다.");
		
		System.out.print("\n\n");
		
		// 5강 실습2
		int year1 = 2003;
		int year2 = 2025;
		String age2 = "";
		String no = "";
		
		if((year2-year1)>=20) {
			age2 = "성인";
			no = "가능";
		}else {
			age2 = "미성년자";
			no = "불가능";
		}
		
		System.out.println((year2-year1)+"세는 "+age2+"로 담배 판매가 "+no+"합니다.");
		
		
		System.out.print("\n\n");
		
		// 5강 실습3
		int money = 1400;
		int price = 1500;
		int result = money-price;
		String goods = "빼빼로";
		
		if(money>=price) {
			System.out.println(goods+"를 사고 "+result+"원이 남았습니다.");
		}else {
			System.out.println(goods+"를 사지 못했습니다.");
		}
		
		
		System.out.print("\n\n");
		
		// 5강 다중 실습1
		int year = 12;
		String name = "홍길동";
		String level = "";
		
		if(year>=16) {
			level = "특급";
		}else if(year>=11) {
			level = "고급";
		}else if(year>=6) {
			level = "중급";
		}else if(year>=3) {
			level = "초급";
		}else {
			level = "신입";
		}
		
		System.out.println(name+"님의 연차는 "+year+"년으로 "+level+"입니다.");
		
		System.out.print("\n\n");
		
		// 5강 다중 실습2
		String nam = "홍길동";
		String gender = "F";
		String address = "구리시";
		String result2 = "";
		
		if(gender.equals("M")) {
			result2="남성입니다.";
		}else if(gender.equals("F")) {
			result2="여성입니다.";
		}else {
			result2="잘못됨.";
		}
		
		System.out.println("회원님의 이름은"+nam+"이고 주소는 "+address+"이며 성별은 "+result2);
		
		System.out.print("\n\n");
		
		// 5강 연산자 실습1
		byte t1 = 1;
		byte t2 = 45;
		byte t3 = 60;
		String yes = "";
		
		if(t1>=0 && t1<=23 && t2>=0 && t2<=59 && t3>=0 && t3<=49) {
			yes = "올바른";
		}else {
			yes = "잘못된";
		}
		
		System.out.println(t1+"시 "+t2+"분 "+t3+"초는 "+yes+" 시간입니다.");
		
		System.out.print("\n\n");
		
		// 5강 연산자 실습3
		int number = 100;
		String jja = "";
		String bba = "";
		
		if(number%2==0) {
			jja= "짝수";
		}else {
			jja="홀수";
		}
		if(number%10==0) {
			bba = "10의 배수가 맞습니다.";
		}else {
			bba = "10의 배수가 아닙니다.";
		}
		
		
		System.out.println(jja+"이고 "+bba);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
