package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){

        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Lidiane");
        person.setLastName("Alves");
        person.setAddress("Gama-DF");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++ ){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person createPerson(Person person){
        logger.info("Creating one person!");
        return person;
    }

    public Person updatePerson(Person person, Long id){
        logger.info("Updating one person!");
        return person;
    }

    public void deletePerson(Long id){
        logger.info("Deleting one person!");
    }
    private Person mockPerson(int i) {

        logger.info("Finding all people!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Name" + i);
        person.setLastName("Last Name" + i);
        person.setAddress("Brasil" + i);
        person.setGender("Male" + i);
        return person;
    }
}
