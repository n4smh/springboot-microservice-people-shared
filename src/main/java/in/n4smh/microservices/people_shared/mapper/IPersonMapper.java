package in.n4smh.microservices.people_shared.mapper;

import in.n4smh.microservices.people_shared.dto.model.Person;
import in.n4smh.microservices.people_shared.entity.PersonEntity;


public interface IPersonMapper {
	
	Person toPersonResponse(PersonEntity person);

	PersonEntity toPersonEntity(Person personResponse);
}
