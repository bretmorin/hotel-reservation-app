package hotel_reservation_app.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage {
	private Locale locale;
	private ResourceBundle resourceBundle;

	public String getWelcomeMessage() {

		return resourceBundle.getString("welcomeMessage");
	}

	public DisplayMessage() {
	}

	public DisplayMessage(String language, String country){
		locale = new Locale(language,country);
		resourceBundle = ResourceBundle.getBundle("translate",locale);
		System.out.printf("%s, %s%n",language, country);
	}
}
