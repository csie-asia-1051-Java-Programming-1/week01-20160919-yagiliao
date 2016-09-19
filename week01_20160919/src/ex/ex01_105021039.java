package ex;
/*
 * Topic:請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex01_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		int b = (a-32)*5/9;
		System.out.println("攝氏:" + b);
	}

}
