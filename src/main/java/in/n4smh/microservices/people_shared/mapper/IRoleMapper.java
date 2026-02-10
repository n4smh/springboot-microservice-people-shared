package in.n4smh.microservices.people_shared.mapper;

import in.n4smh.microservices.people_shared.dto.model.Role;
import in.n4smh.microservices.people_shared.entity.RoleEntity;


public interface IRoleMapper {
	
	RoleEntity toRoleEntity(Role Role);

	Role toPersonRole(RoleEntity role);
}
