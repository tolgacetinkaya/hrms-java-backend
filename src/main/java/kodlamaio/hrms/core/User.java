package kodlamaio.hrms.core;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")	
	private int id;
	
	@Column(name = "email")	
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "update_date")
	private Date updateDate;
	
	
	public User(int id, String email, String password, boolean isActive, boolean isVerified, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isVerified = isVerified;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	

}
