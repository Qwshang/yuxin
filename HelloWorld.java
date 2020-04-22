package day2;
import java.lang.*;
public class HelloWorld{
	public static void main(String[] args){
		int a=5823;
		int d=(a++)+(++a)+(a--)+(a++);
		System.out.println(d);
		int m=1;
		int n=m%10;
		System.out.println(n);
	}
}