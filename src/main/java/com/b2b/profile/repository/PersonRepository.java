package com.b2b.profile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.b2b.profile.model.Person;

@Repository("personRepository")
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}