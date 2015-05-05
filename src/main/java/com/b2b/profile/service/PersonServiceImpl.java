/**
 * 
 */
package com.b2b.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.b2b.profile.model.Person;
import com.b2b.profile.repository.PersonRepository;

/**
 * @author family
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public Person save(Person person) {
		System.out.println("save method called.");
		return personRepository.save(person);
	}
}
