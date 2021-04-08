package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("check-in date (dd/mm/yyy)");
		Date checkin = sdf.parse(sc.next());
		System.out.print("check-out date (dd/mm/yyy)");
		Date checkout = sdf.parse(sc.next());
		
		
		
		sc.close();
	}

}
