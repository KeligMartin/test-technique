package fr.kelig.testtechnique.domain;

import java.time.LocalDate;

public class Person {

    private String id;

    private String name;

    private String firstName;

    private LocalDate birthDate;

    public Person(String id, String name, String firstName, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public Person(String name, String firstName, LocalDate birthDate) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
