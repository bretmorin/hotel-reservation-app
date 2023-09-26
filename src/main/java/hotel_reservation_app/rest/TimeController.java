package hotel_reservation_app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
@CrossOrigin
@RequestMapping("/time")
public class TimeController {
	final private String dateTimeFormat = "hh:mma z";
	final private String startTime = "06:00PM EST";
	final private String[] timeRegion = new String[]{"EST","MST","UTC"};
	private SimpleDateFormat timeFormatter = new SimpleDateFormat(dateTimeFormat);

	@GetMapping("/live")
	public ResponseEntity<List<String>> getLiveTimeZones() {
		List<String> liveTimes = new ArrayList<>();

		try {
			//format each timezone to the start date after parsing
			Date date = timeFormatter.parse(startTime);

			//loops through each timezone to generate the date
			for (String tr : timeRegion) {
				TimeZone tz = TimeZone.getTimeZone(tr);
				timeFormatter.setTimeZone(tz);
				String dateOut = timeFormatter.format(date);
				liveTimes.add(dateOut);
			}

			//EST time
			TimeZone tzEST = TimeZone.getTimeZone("EST");
			timeFormatter.setTimeZone(tzEST);

			//MST time
			TimeZone tzMST = TimeZone.getTimeZone("MST");

			//UTC time
			TimeZone tzUTC = TimeZone.getTimeZone("UTC");

		} catch (Exception e) {
			System.out.println(e.toString());
			liveTimes.add(e.toString());
		}

		return ResponseEntity.ok(liveTimes);
	}
}
