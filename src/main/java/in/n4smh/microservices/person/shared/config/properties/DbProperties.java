package in.n4smh.microservices.person.shared.config.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EnableConfigurationProperties
public class DbProperties {

	private String Uri;
	private String username;
	private String password;
	private boolean showSql;
	private String database;
}
