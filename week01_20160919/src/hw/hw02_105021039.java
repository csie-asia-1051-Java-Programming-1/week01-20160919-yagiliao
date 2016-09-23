package hw;
import java.util.Random;
import java.util.Scanner;
public class hw02_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		Scanner scr=new Scanner(System.in);
		int r=scr.nextInt();
		int a=ran.nextInt(r)+1;
		int b=ran.nextInt(r)+1;
		int c=ran.nextInt(r)+1;
		int d=ran.nextInt(r)+1;
		int e=ran.nextInt(r)+1;
		int f=ran.nextInt(r)+1;
		System.out.print(a+"\n"+ b+"\n"+ c+"\n"+ d+"\n"+ e+"\n"+ f+"\n");
	}

}
