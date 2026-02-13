package in.n4smh.microservices.person_shared.mapper;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import in.n4smh.microservices.person_shared.dto.model.Person;
import in.n4smh.microservices.person_shared.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersonMapper implements IPersonMapper {

	@Override
	public Person toPersonResponse(PersonEntity person) {
		log.debug(person.toString());

		person = ObjectUtils.getIfNull(person, new PersonEntity());

		return Person.builder().id(person.getId()).name(person.getName()).gender(person.getGender())
				.dateOfBirth(person.getDateOfBirth()).active(person.getIsActive() == 1 ? true : false).build();

	}

	@Override
	public PersonEntity toPersonEntity(Person personResponse) {
		log.debug(personResponse.toString());
		personResponse = ObjectUtils.getIfNull(personResponse, new Person());

		return PersonEntity.builder().id(personResponse.getId()).name(personResponse.getName())
				.gender(personResponse.getGender()).dateOfBirth(personResponse.getDateOfBirth())
				.isActive(personResponse.isActive() ? 1 : 0).build();

	}
}
