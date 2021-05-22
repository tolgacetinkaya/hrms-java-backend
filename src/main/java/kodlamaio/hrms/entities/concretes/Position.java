package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candidates")
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;
	
	@Column(name = "detail")
	private String detail;
	
	@Column(name = "is_active")
	private boolean isActive;

	public Position(int id, String positionName, String detail, boolean isActive) {
		super();
		this.id = id;
		this.positionName = positionName;
		this.detail = detail;
		this.isActive = isActive;
	}
	
	
	
}
