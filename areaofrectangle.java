package areaofrectangle;

import java.util.Scanner;

public class areaofrectangle {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("enter the length of the rectangle:");
			double length = scanner.nextDouble();
			System.out.println("enter the width of rectangle:");
			double width = scanner.nextDouble();
			double area = length*width;
			System.out.println("area of rectangle is:"+area);
		}
		

	}

}
