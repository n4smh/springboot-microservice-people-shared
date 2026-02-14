package in.n4smh.microservices.person_shared.mapper;

import in.n4smh.microservices.person_shared.dto.model.Person;
import in.n4smh.microservices.person_shared.entity.PersonEntity;


public interface IPersonMapper {
	
	Person toPersonResponse(PersonEntity person);

	PersonEntity toPersonEntity(Person personResponse);
}
