package in.n4smh.microservices.person.shared.config.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EnableConfigurationProperties
public class ServiceProperties {
	
	private String name;
	private String uri;
	private String port;
	private String context;
	private String securityUserName;
	private String securityUserPassword;
	private String securityAuth;
	
	private DbProperties db;

}
