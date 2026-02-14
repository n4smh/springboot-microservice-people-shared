package in.n4smh.microservices.person_shared.entity;

import java.time.LocalDate;

import in.n4smh.microservices.person_shared.dto.model.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "is_active")
	private int isActive;

}
