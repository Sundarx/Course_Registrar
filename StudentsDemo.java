// SUNDAR RAJ
import java.util.Scanner;

public class StudentsDemo
{
	public static void main(String[] args)
	{
		Course csc162 = new Course("CSC162", 1, 3, null);
		Course his101 = new Course("HIS101", 2, 4, null);
		Course csc236 = new Course("CSC236", 4, 3, null);

		Students students = new Students(3);

		students.addStudent(1111, csc162);
		students.addStudent(1111, his101);
		students.addStudent(2357, csc236);
		students.addStudent(1234, null);


		int choice = 0;
		while(choice != 4)
			{
			System.out.println("What action would you like to implement?");
			System.out.println(		"1: Show all Students"
								+ "\n2: Add a Course"
								+ "\n3: Drop a Course"
								+ "\n4: Quit");
			Scanner keyboard = new Scanner(System.in);
			int action = keyboard.nextInt();

			if(action == 1)
			{
				System.out.println(students);

		/*		for(int i = 0; i < students.studentArr.size(); i++)
			{
				System.out.println(students.studentArr.get(i));
			}*/
			}

			if(action == 2)
			{
				System.out.println("Type the Student ID# for the student you would like"
									+ " to add a course for.");
				System.out.println("Student ID#: 1111\n" +
									"Student ID#: 1234\n" +
									"Student ID#: 2357\n");
				int stNum = keyboard.nextInt();

				System.out.println("Which course would you like to add?");
				System.out.println("1: CSC162\n" +
									"2: HIS101\n" +
									"3: CSC236");
				int coNum = keyboard.nextInt();
				if(coNum == 1)
				{
					students.addCourse(stNum, csc162);
				}
				if(coNum == 2)
				{
					students.addCourse(stNum, his101);
				}
				if(coNum == 3)
				{
					students.addCourse(stNum, csc236);
				}
			}

			if(action == 3)
			{
				System.out.println("Type the Student ID# for the student you would like"
									+ " to drop a course for.");
				System.out.println("Student ID#: 1111\n" +
									"Student ID#: 1234\n" +
									"Student ID#: 2357\n");
				int stNum = keyboard.nextInt();

				System.out.println("Which course would you like to drop?");
				System.out.println("1: CSC162\n" +
									"2: HIS101\n" +
									"3: CSC236");
				int coNum = keyboard.nextInt();
				if(coNum == 1)
				{
					students.dropCourse(stNum, csc162);
				}
				if(coNum == 2)
				{
					students.dropCourse(stNum, his101);
				}
				if(coNum == 3)
				{
					students.dropCourse(stNum, csc236);
				}
			}

			if(action == 4)
			{
				System.out.println("----Program exited----");
				System.exit(0);
			}
		}
	}
}