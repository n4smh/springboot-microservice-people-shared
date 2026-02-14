package in.n4smh.microservices.person_shared.mapper;

import in.n4smh.microservices.person_shared.dto.model.Role;
import in.n4smh.microservices.person_shared.entity.RoleEntity;


public interface IRoleMapper {
	
	RoleEntity toRoleEntity(Role Role);

	Role toPersonRole(RoleEntity role);
}
