package br.com.maquiny.mvc.mudi.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.maquiny.mvc.mudi.model.User;
import br.com.maquiny.mvc.mudi.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {
	
	@Autowired
	private  UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setUsername("usuario@test.com");
		user.setPassword("$2y$10$CV4Kea4eWnwgndFZsVb3oe.FqoUjz2ZZStYyqN6Mld3IdsVXerrLC");
																							
		user.setEnabled(true);

		user.setAuthorities(Arrays.asList("ROLE_USER"));

		userRepository.save(user);
	}
}
