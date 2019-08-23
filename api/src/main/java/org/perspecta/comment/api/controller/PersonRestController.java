/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perspecta.comment.api.controller;

import java.util.List;
import org.perspecta.comment.api.domain.Person;
import org.perspecta.comment.api.services.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 500540
 */
@RestController
@RequestMapping("/person")
public class PersonRestController {
    @Autowired
    PersonRepository personRepository;
 
    /**
     *
     * @return
     */
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
 
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}
