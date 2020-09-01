package pl.przykladowastrona.restapi.maturity.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.przykladowastrona.restapi.maturity.swamp.Profile;
import pl.przykladowastrona.restapi.maturity.util.DataFixtureUtils;


import java.util.List;

@RestController("/api/maturity/profiles")
public class ProfileService {

	@PostMapping
	public List<Profile> getAllProfiles() {
		return DataFixtureUtils.allProfiles();
	}

}
