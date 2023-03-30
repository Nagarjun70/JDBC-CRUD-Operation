package com.jsp.studentDbS;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentInterface si = new StudentImplementation();
	

		while (true) {
			System.out.println("Enter the choice 1 to 5");
			System.out.println("1:SaveStudent\n2:DeleteStudent\n3:UpdateStudent\n4:GetStudentByMarks\n5:GetAllStudent");
			int choice = scanner.nextInt();
			System.out.println("-----------------------------------------------------------");
			switch (choice) {
			case 1:
				si.SaveStudent();

				break;
			case 2:
				si.DeleteStudent();

				break;
			case 3:
				si.UpdateStudent();

				break;
			case 4:
				si.GetStudentByMarks();

				break;
				
			case 5:
				si.GetAllStudent();

				break;

			default:
				System.out.println("Invalid Choice");

			}
		}
	}
}
