package quiz;

import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("혼공자", 50000);
		System.out.println(book.printInfo1());
		System.out.println("가격 : " + book.printInfo2() + "원");
		
		System.out.println("==========================================");
		
		StringTool stringTool = new StringTool();
		
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("==========================================");
	}

}
