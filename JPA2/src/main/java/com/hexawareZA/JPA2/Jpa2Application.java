package com.hexawareZA.JPA2;

import com.hexawareZA.JPA2.entity.App;
import com.hexawareZA.JPA2.entity.Mobile;
import com.hexawareZA.JPA2.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa2Application implements CommandLineRunner {

	@Autowired
	private MobileRepository mobileRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jpa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 3 Entities to add to Mobile Table
		Mobile samsung = new Mobile("Samsung", "Galaxy");
		Mobile apple = new Mobile("Apple", "iPhone 13 Pro");
		Mobile google = new Mobile("Google", "Pixel");
		samsung.addApp(new App("WhatsApp"));
		apple.addApp(new App("Facebook"));
		google.addApp(new App("Instagram"));
		mobileRepository.saveMobile(samsung);
		mobileRepository.saveMobile(apple);
		mobileRepository.saveMobile(google);

		// Print out each mobile
		mobileRepository.getAllMobiles().forEach(e -> System.out.println(e));

		// Print out mobile by search by name
		System.out.println(mobileRepository.findByName("Google"));
		System.out.println(mobileRepository.findByName("Google").getApps());
	}
}
