package com.sda.lectia4.ex1GenericType.repository;

import com.sda.lectia4.ex1GenericType.model.Person;

public class PersonRepository extends IdentifiableRepository<Person> {
    public Person getPersonByName(String name){
        for(Person person : items){
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
}
