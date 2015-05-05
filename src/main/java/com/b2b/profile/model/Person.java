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
    private Long id = 1L;
     
	private String name = "Shahjahan";

	@Range(min = 16, max = 90)
	private int age = 30;

	
	public int getAge() {
		return age;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString(){
        return "id=" + id + ", name=" + name + ", age=" + age;
    }
	
}
