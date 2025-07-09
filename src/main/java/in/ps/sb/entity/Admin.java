package in.ps.sb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int adminId;
	private String adminName;
	private String adminUserName;
	private String password;
	
	/*
	 There will be no separate admin login page/section.
	 If the userid/mailid matches the registered admin, it should show admin prevelages.
	 If it belongs to a customer, it should redirect to the appllication landing page.
	  */

}
