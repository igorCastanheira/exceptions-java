package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import moldel.entities.Reservation;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("check-in date (dd/mm/yyy)");
			Date checkin = sdf.parse(sc.next());
			System.out.print("check-out date (dd/mm/yyy)");
			Date checkout = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation : " + reservation);
			System.out.println();

			System.out.println("Enter data to update the reservation: ");
			System.out.print("check-in date (dd/mm/yyy)");
			checkin = sdf.parse(sc.next());
			System.out.print("check-out date (dd/mm/yyy)");
			checkout = sdf.parse(sc.next());

			reservation.updatedDates(checkin, checkout);
			System.out.println("Reservation " + reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (IllegalArgumentException e) {
			System.out.println("Error in reservation");

		}

		sc.close();
	}

}
