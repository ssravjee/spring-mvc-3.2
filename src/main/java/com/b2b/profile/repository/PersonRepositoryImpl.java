/**
 * 
 */
package com.b2b.profile.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.b2b.profile.model.Person;

/**
 * @author family
 *
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	private List<Person> persons = null;
	
	public PersonRepositoryImpl() {
		if(this.persons == null) {
			this.persons = new ArrayList<Person>();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.repository.PersonRepository#add(com.b2b.profile.model.Person)
	 */
	public void add(Person person) {
		this.persons.add(person);
	}
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.repository.PersonRepository#getAllPerson()
	 */
	public List<Person> getAllPerson(){
		return this.persons;
	}
	
	/* (non-Javadoc)
	 * @see com.b2b.profile.repository.PersonRepository#remove(com.b2b.profile.model.Person)
	 */
	public void remove(Person person) {
		this.persons.remove(person);
	}
}
