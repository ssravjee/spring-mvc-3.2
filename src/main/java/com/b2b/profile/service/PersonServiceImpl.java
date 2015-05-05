/**
 * 
 */
package com.b2b.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.profile.model.Person;
import com.b2b.profile.repository.PersonRepository;

/**
 * @author family
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.service.PersonService#findAll()
	 */
	public List<Person> findAll() {
		return personRepository.getAllPerson();
	}
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.service.PersonService#add(com.b2b.profile.model.Person)
	 */
	public void add(Person person){
		personRepository.add(person);
	}
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.service.PersonService#remove(int)
	 */
	public void remove(int id){
		List<Person> persons = personRepository.getAllPerson();
		persons.remove(id);
	}

}
