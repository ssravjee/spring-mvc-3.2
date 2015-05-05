/**
 * 
 */
package com.b2b.profile.contoller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.b2b.profile.model.Person;
import com.b2b.profile.service.PersonService;

/**
 * @author family
 *
 */
@Controller
@RequestMapping("profile")
@SessionAttributes({"profiles","profile"})
public class ProfileController {

	@Autowired
	private PersonService personService;
	
	
	@Autowired
	public ProfileController(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create(Model model) {
		System.out.println("create method called..");
		model.addAttribute("profile", new Person());
		return "create"; 
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String updateProfile(@ModelAttribute ("profile") Person person) {
		this.personService.add(person);
		return "redirect:list.html";
	}
	
	 @RequestMapping(value="/remove", method = RequestMethod.GET)
	 public String remove(@ModelAttribute ("profile") Person person, BindingResult result){
		 if(result.hasErrors()) {
			 return "redirect:list.html";
		 }
		 System.out.println("remove person id : " + person.getId());
		 this.personService.remove(getIndexToRemoveElement(personService.findAll(), person.getId()));
		 return "redirect:list.html";
	 }
	
	@RequestMapping(value ="/list", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println("list method");
		model.addAttribute("profiles", personService.findAll());
		return "list";
	}

	public int getIndexToRemoveElement(List<Person> persons, long id){
		int index = 0;
		for (Iterator iterator = persons.iterator(); iterator.hasNext();) {
			Person o = (Person) iterator.next();
			if(o.getId() == id ){
				System.out.println("list index : " + index);
				break;
			}
			index++;
		}
		return index;
	}
}