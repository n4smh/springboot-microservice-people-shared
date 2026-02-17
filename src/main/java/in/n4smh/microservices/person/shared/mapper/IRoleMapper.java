package in.n4smh.microservices.person.shared.mapper;

import in.n4smh.microservices.person.shared.dto.model.Role;
import in.n4smh.microservices.person.shared.entity.RoleEntity;


public interface IRoleMapper {
	
	RoleEntity toRoleEntity(Role Role);

	Role toPersonRole(RoleEntity role);
}
