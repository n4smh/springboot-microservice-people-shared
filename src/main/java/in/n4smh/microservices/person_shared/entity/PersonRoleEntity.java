package in.n4smh.microservices.person_shared.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "people_role")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonRoleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "person_id")
	private String personId;
	
	@Column(name = "role_id")
	private String roleId;
}
