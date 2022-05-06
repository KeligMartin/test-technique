package fr.kelig.testtechnique.application;

import fr.kelig.testtechnique.application.dto.PersonDTO;
import fr.kelig.testtechnique.domain.PersonDao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindAllPeople {

    private final PersonDao personDao;


    public FindAllPeople(PersonDao personDao) {
        this.personDao = personDao;
    }

    public List<PersonDTO> execute() {
        return personDao.findAll()
                .stream()
                .map(p -> new PersonDTO(p.getName(), p.getFirstName(), LocalDate.now().getYear() - p.getBirthDate().getYear()))
                .collect(Collectors.toList());
    }
}
