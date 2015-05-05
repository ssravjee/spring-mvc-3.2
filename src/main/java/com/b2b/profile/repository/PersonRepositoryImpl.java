/**
 * 
 */
package com.b2b.profile.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.b2b.profile.model.Person;

/**
 * @author family
 *
 */
@Repository("personRepository")
public class PersonRepositoryImpl implements PersonRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Person save(Person person) {
		em.persist(person);
		em.flush();
		return person;
	}
}
