package com.b2b.profile.service;

import java.util.List;

import com.b2b.profile.model.Person;

public interface PersonService {

	public abstract List<Person> findAll();

	public abstract void add(Person person);

	public abstract void remove(int id);

}