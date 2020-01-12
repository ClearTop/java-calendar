package hyunmo.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = -1;
		int year = -1;
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();

			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.println("**1~12 까지의 숫자를 입력해주세요!**");
				continue;
			}
			cal.printCalendar(year, month);
		}
		System.out.println("Have a nice day!");

		scanner.close();
	}

	public static void main(String[] args) {
		// 쉘 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
