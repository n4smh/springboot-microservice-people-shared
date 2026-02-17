package in.n4smh.microservices.person.shared.mapper;

import in.n4smh.microservices.person.shared.dto.model.Person;
import in.n4smh.microservices.person.shared.entity.PersonEntity;


public interface IPersonMapper {
	
	Person toPersonResponse(PersonEntity person);

	PersonEntity toPersonEntity(Person personResponse);
}
