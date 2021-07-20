package com.sda.streams;

import java.util.List;

/*List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
- Print All Courses individually
- Print Courses Containing the word "Spring"
- Print Courses Whose Name has at least 4 letters
- Print the number of characters in each course name*/
public class Main {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream().forEach(word -> System.out.println(word));
        System.out.println("-----------");

        courses.stream()
                .filter(word -> word.contains("Spring"))
                .forEach(word -> System.out.println(word)
                );
        System.out.println("-----------");

        courses.stream()
                .filter(word -> word.length()>4)
                .forEach(word -> System.out.println(word));

        System.out.println("-----------");

        courses.stream().forEach(word -> System.out.println(word.length()));
    }
}
