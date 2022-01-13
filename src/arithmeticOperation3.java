import java.util.Scanner;

public class arithmeticOperation3 {

	public static void main(String[] args) {
		
		/*(세 자리 수) × (세 자리 수)의 과정을 구현해보자.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3자리 숫자 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("3자리 숫자 입력 : ");
		String b = sc.next();
		
		sc.close();        //입력을 안전하게 닫아준다
		
		System.out.println(a * (b.charAt(0)-0));      //b.charAt(0) 값은 숫자가 아닌 문자이기 때문에 -0을 해주어 숫자로 바꾼다.
		System.out.println(a * (b.charAt(1)-0));
		System.out.println(a * (b.charAt(2)-0));
		System.out.println(a * Integer.parseInt(b));   // String타입의 숫자를 int타입으로 변환해준다.
		
	}

}
