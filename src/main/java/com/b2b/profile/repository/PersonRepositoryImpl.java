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
public class PersonRepositoryImpl {
	
	private List<Person> persons = null;
	
	public PersonRepositoryImpl() {
		if(this.persons == null) {
			this.persons = new ArrayList<Person>();
		}
	}
	
	public void add(Person person) {
		this.persons.add(person);
	}
	
	public List<Person> getAllPerson(){
		return this.persons;
	}
	
	public void remove(Person person) {
		this.persons.remove(person);
	}
}
