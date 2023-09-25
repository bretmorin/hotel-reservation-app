package hotel_reservation_app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@RestController
@CrossOrigin
@RequestMapping("/resources")
public class WelcomeController {

	// Create 2 executors
	private Executor exMessage = Executors.newFixedThreadPool(2);

	@GetMapping("welcome")
	public ResponseEntity<List<String>> getWelcomeMessage() {
		List<String> messageList = new ArrayList<String>();

		// Read English Message
		exMessage.execute(() -> {
			DisplayMessage readEnglish = new DisplayMessage("en", "US");
			messageList.add(readEnglish.getWelcomeMessage());
			System.out.println("en_US Message Received!");
		});

		// Read French Message
		exMessage.execute(() -> {
			DisplayMessage readFrench = new DisplayMessage("fr", "CA");
			messageList.add(readFrench.getWelcomeMessage());
			System.out.println("fr_CA Message Received!");
		});

		return ResponseEntity.ok(l);

	}
}
