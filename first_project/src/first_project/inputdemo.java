package first_project;

import java.util.Scanner;

public class inputdemo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// scanner object name left ==== rigth vreate me a new Scanner pacakage object

		char a = sc.next().charAt(0);
		int n = sc.nextInt();

		// after scanning a integer if we scan string enter will be considered as input
		// for the string
		// which is a great problem;

		int z = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		// this is prefered to follow

	}
}
