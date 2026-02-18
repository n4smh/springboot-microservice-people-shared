package in.n4smh.microservices.person.shared.config;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileValidator implements CommandLineRunner {

	private final Environment environment;
	private static final Set<String> ALLOWED_PROFILES = Set.of("prod", "staging", "unit-test", "integration-test");

	public ProfileValidator(Environment environment) {
		this.environment = environment;
	}

	@Override
	public void run(String... args) throws Exception {

		List<String> activeProfiles = Arrays.asList(environment.getActiveProfiles());

		for (String profile : activeProfiles) {
			if (!ALLOWED_PROFILES.contains(profile) && !"default".equals(profile)) {
				throw new RuntimeException("Invalid active profile detected: " + profile
						+ ". Only 'prod', 'staging', 'unit-test' & 'integration-test' are allowed.");
			}
		}

		boolean isProdOrStagingActive = activeProfiles.stream().anyMatch(ALLOWED_PROFILES::contains);
		if (!isProdOrStagingActive) {
			throw new RuntimeException(
					"No valid environment profile ('prod', 'staging', 'unit-test' & 'integration-test' ) is active.");
		}

	}

}
