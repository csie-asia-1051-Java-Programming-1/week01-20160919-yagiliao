package hw;
import java.util.Scanner;
public class hw03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ran=new Scanner(System.in);
		float a=ran.nextFloat();
		float b=ran.nextFloat();
		float c=ran.nextFloat();
		float d=ran.nextFloat();
		float e=ran.nextFloat();
		float f=ran.nextFloat();
		int one=Math.round(a);
		int two=Math.round(b);
		int three=Math.round(c);
		int four=Math.round(d);
		int five=Math.round(e);
		int six=Math.round(f);
		int z=Math.min(one,two);
		int y=Math.min(three,four);
		int x=Math.min(five,six);
		int w=Math.min(z,y);
		int v=Math.min(y,x);
		int u=Math.min(w,v);
		System.out.println(u);
	}

}
