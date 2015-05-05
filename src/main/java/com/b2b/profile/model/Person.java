/**
 * 
 */
package com.b2b.profile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;



/**
 * @author family
 *
 */
@Entity
@Table(name="PERSON")
public class Person {

	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id = 1;
     
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name = "Shahjahan";

	@Override
    public String toString(){
        return "id=" + id + ", name=" + name;
    }
	
	@Range(min = 16, max = 90)
	private int age = 30;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
