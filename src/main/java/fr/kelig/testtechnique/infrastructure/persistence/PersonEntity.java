package fr.kelig.testtechnique.infrastructure.persistence;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class PersonEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;

    private String name;

    private String firstName;

    private LocalDate birthdate;

    public PersonEntity() {}

    public PersonEntity(String id, String name, String firstName, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.birthdate = birthdate;
    }

    public PersonEntity(String name, String firstName, LocalDate birthdate) {
        this.name = name;
        this.firstName = firstName;
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
