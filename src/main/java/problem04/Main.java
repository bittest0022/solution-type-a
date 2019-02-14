package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ran = (int)(Math.random()*1000)+1;
		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input);
	}
}