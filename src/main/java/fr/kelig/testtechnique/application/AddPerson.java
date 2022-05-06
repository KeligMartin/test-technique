package fr.kelig.testtechnique.application;

import fr.kelig.testtechnique.application.dto.AddPersonDTO;
import fr.kelig.testtechnique.common.TooOldException;
import fr.kelig.testtechnique.domain.Person;
import fr.kelig.testtechnique.domain.PersonDao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AddPerson {

    private final PersonDao personDao;

    public AddPerson(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void execute(AddPersonDTO person) {
        if (LocalDate.now().getYear() -  person.getBirthDate().getYear() >= 150) {
            throw new TooOldException("person", "birthdate");
        }
        personDao.save(new Person(
                person.getName(),
                person.getFirstName(),
                person.getBirthDate())
        );
    }
}
