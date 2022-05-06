package fr.kelig.testtechnique.application.dto;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class AddPersonDTO {

    @NotNull
    private final String name;

    @NotNull
    private final String firstName;

    @Past
    private final LocalDate birthDate;

    public AddPersonDTO(String name, String firstName, LocalDate birthDate) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
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
