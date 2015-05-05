/**
 * 
 */
package com.b2b.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.profile.model.Person;
import com.b2b.profile.repository.PersonRepositoryImpl;

/**
 * @author family
 *
 */
@Service
public class PersonService {

	@Autowired
	private PersonRepositoryImpl personRepository;
	
	public List<Person> findAll() {
		return personRepository.getAllPerson();
	}
	
	public void add(Person person){
		personRepository.add(person);
	}
	
	public void remove(int id){
		List<Person> persons = personRepository.getAllPerson();
		persons.remove(id);
	}

}
