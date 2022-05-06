package fr.kelig.testtechnique.infrastructure.mapper;

import fr.kelig.testtechnique.domain.Person;
import fr.kelig.testtechnique.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonMapper implements ObjectMapper<Person, PersonEntity> {

    public Person toDomain(PersonEntity personEntity) {
        return new Person(personEntity.getId(),
                personEntity.getName(),
                personEntity.getFirstName(),
                personEntity.getBirthdate()
        );
    }

    public PersonEntity toEntity(Person person) {
        return new PersonEntity(person.getId(),
                person.getName(),
                person.getFirstName(),
                person.getBirthDate()
        );
    }
}
