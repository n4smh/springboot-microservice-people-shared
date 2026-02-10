package in.n4smh.microservices.people_shared.mapper;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import in.n4smh.microservices.people_shared.dto.model.Role;
import in.n4smh.microservices.people_shared.entity.RoleEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RoleMapper implements IRoleMapper {

	@Override
	public Role toPersonRole(RoleEntity role) {
		log.debug(role.toString());

		role = ObjectUtils.getIfNull(role, new RoleEntity());

		return Role.builder().id(role.getId()).name(role.getName()).build();

	}

	@Override
	public RoleEntity toRoleEntity(Role personRole) {
		log.debug(personRole.toString());
		personRole = ObjectUtils.getIfNull(personRole, new Role());

		return RoleEntity.builder().id(personRole.getId()).name(personRole.getName()).build();

	}
}
