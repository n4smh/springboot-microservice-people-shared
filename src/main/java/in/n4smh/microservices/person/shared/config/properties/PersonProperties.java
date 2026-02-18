package in.n4smh.microservices.person.shared.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

	private String swaggerCentralUri;
	private String swaggerEnabled;
	
	private String loggingPatternCorrelation;

	private String otlpMetricsUri;
	private String otlpLoggingUri;
	private String otlpTracingUri;
	private String otlpTracingSamplingProbability;
	
	private ServiceProperties gw;
	private ServiceProperties swaggerCentral;
	private ServiceProperties query;
	private ServiceProperties cud;
}
