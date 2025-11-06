package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	public static Faker faker = new Faker();

	public static String getFirstName() {
		return faker.name().firstName();

	}

	public static String getPassword() {
		return faker.internet().password();

	}
}
