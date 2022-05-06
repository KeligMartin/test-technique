package fr.kelig.testtechnique.infrastructure.persistence;

import fr.kelig.testtechnique.domain.Person;
import fr.kelig.testtechnique.domain.PersonDao;
import fr.kelig.testtechnique.infrastructure.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonEntityDao implements PersonDao {

    private final PersonEntityRepository repository;
    private final PersonMapper mapper;

    @Autowired
    public PersonEntityDao(PersonEntityRepository repository, PersonMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Person> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList()
                );
    }

    public void save(Person person) {
        PersonEntity personEntity = mapper.toEntity(person);
        repository.save(personEntity);
    }
}
