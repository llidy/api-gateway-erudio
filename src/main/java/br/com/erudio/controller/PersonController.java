package br.com.erudio.controller;

import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices service;
    @RequestMapping (value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) throws Exception{
      return service.findById(id);
    }

    @RequestMapping (method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() throws Exception{
        return service.findAll();
    }

    @RequestMapping (method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person createPerson(@RequestBody Person person) throws Exception{
        return service.createPerson(person);
    }

    @RequestMapping (value = "/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person updatePerson(@PathVariable(value = "id") Long id, @RequestBody Person person) throws Exception{
        return service.updatePerson(person, id);
    }

    @RequestMapping (value = "/{id}",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePerson(@PathVariable(value = "id") Long id) throws Exception{
        service.deletePerson(id);
    }


}


