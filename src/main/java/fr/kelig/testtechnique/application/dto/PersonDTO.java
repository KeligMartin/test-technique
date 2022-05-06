package fr.kelig.testtechnique.application.dto;

public class PersonDTO {

    private final String name;

    private final String firstName;

    private final int age;

    public PersonDTO(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
