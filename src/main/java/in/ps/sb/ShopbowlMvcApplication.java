package in.ps.sb;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopbowlMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopbowlMvcApplication.class, args);
		
		System.out.println("\n\t\t\t=========="
				+ "\n\n ShopBowl application Started at :: " + LocalDateTime.now() 
				+ "\n\n\t\t\t==========\n");
	
	}

}
