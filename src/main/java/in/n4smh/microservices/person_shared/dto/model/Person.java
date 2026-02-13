package in.n4smh.microservices.person_shared.dto.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private String id;

	@NonNull
	private String name;

	@NonNull
	private Gender gender;

	@NonNull
	private LocalDate dateOfBirth;

	private List<Role> roles;

	private long age;

	private boolean active;

	public static CustomBuilder builder() {
		return new CustomBuilder();
	}

	public static class CustomBuilder extends PersonBuilder {

		@Override
		public Person build() {

			Person person = super.build();
			person.preBuild();

			return person;
		}

	}

	public void preBuild() {
		if (ObjectUtils.isNotEmpty(dateOfBirth)) {
			age = Period.between(dateOfBirth, LocalDate.now()).getYears();
		}
	}

}
