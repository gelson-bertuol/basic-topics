package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("Atual date: " + sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println("New date..: " + sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes...: " + minutes);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("Month.....: " + month);
		
	}
}
