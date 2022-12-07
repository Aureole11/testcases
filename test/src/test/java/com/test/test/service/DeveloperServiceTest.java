package com.test.test.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.test.model.Developer;
import com.test.test.repository.DeveloperRepositorty;

@SpringBootTest
public class DeveloperServiceTest {

	@Mock
	private DeveloperRepositorty devRepo;
	
	@InjectMocks
	private DeveloperService devservice;
	
	public void testCreate() {
		//Give
		Developer developer = new Developer();
		developer.setId(1);
		developer.setName("Purva");
		developer.setDepartment("Sql Developer");
		
		//when and then..
		Mockito.when(devRepo.save(developer)).thenReturn(developer);
		
		assertThat(devservice.addDeveloper(developer)).isEqualTo(developer);
	}
}
