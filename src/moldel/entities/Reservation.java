package moldel.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomnumber;
	private Date checkIn;
	private Date checkout;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyy");

	public Reservation(Integer roomnumber, Date checkIn, Date checkout) {

		this.roomnumber = roomnumber;
		this.checkIn = checkIn;
		this.checkout = checkout;
	}

	public Integer getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(Integer roomnumber) {
		this.roomnumber = roomnumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkout;
	}

	public Date checkIn() {

		return checkIn;

	}

	public Date checkout() {
		return checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkIn.getTime();// get the difference of checking and checkout in
															// milliseconds//

		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// convert the milliseconds difference in days .//

	}

	public void updatedDates(Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new IllegalArgumentException(" Reservation dates for updates must be future dates");
		}
		if(!checkout.after(checkin)) {
			throw new IllegalArgumentException("Checkout date must be after checkin date");
			
		}
		
		
		this.checkIn = checkin;
		this.checkout = checkout;

	}

	@Override
	public String toString() {

		return "Room " + roomnumber + ", checkin" + sdf.format(checkIn) + ", checkout " + sdf.format(checkout) + ", "
				+ duration() + " nigths";
	}
}
