package com.sda.lectia4.ex1GenericType;

import com.sda.lectia4.ex1GenericType.model.Person;
import com.sda.lectia4.ex1GenericType.repository.IdentifiableRepository;

public class Main {
    public static void main(String[] args) {

        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();

        person.setCNP("290256631");
        person.setName("Rhonda");

        personRepository.addItem(person);

        System.out.println(personRepository.getItemById("23"));
        System.out.println(personRepository.getItemById("290256631"));

        personRepository.removeItemById("290256631");

        System.out.println(personRepository.getItemById("290256631"));


    }
}
