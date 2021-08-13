package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

import org.springframework.context.annotation.Primary;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - Primary Bean!!";
	}

}
