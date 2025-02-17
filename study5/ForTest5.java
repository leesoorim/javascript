package study5;

public class ForTest5 {

	public static void main(String[] args) {
		
		//=======내가푼것=================================

		// 1
		for(int i=-5; i<=5; i++) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n");
		
		//2
		for(int i=101; i<=109; i++) {
			System.out.print(i+" ");
			if(i==103 || i==106) {
				System.out.println();
			}
			
		}
		
		System.out.print("\n\n");
		
		//2 - 응용
		int cnt = 0;
		for(int i=101; i<=109; i++) {
			cnt++;
			System.out.print(i+" ");
			if(cnt%3==0) {
				System.out.println();
			}
			
		}
		
		
		
		System.out.print("\n\n");
		
		//3
		for(int i=2; i<=4; i++) {
			System.out.println("<front size='"+i+"'>java</font>");
		}
		
		System.out.print("\n\n");
		
		//4	else if 버전	

		for(int t=1; t<=23; t++) {
			String name = "";
			if	   (t>=0 && t<=5)  name = "새벽"; // 두개이상 실행문은 괄호 생략x
			else if(t>=6 && t<=11) name = "오전";
			else if(t>=12 && t<=18)name = "오후";
			else name = "저녁";
			System.out.println(name+" "+t+"시");
		}
		/* if문은 단건이라 else if는 패밀리라 아니면 끝나는데 if문은 단건이라 프로그램을 실행해버림 그래서 위에가 더 좋음
		for(int t=0; t<=23; t++) {
			String name = "";
			if(t>=0 && t<=5) {
				name = "새벽";
			}
			if(t>=6 && t<=11) {
				name = "오전";
			}
			if(t>=12 && t<=18) {
				name = "오후";
			}
			if(t>=19 && t<=23) {
				name = "저녁";
			}
			System.out.println(name+" "+t+"시");
		}
		*/
		
		//=======쌤이푼것=================================
		//1
		
		
		
		
		
		
		
		
		
	}

}
