package fr.kelig.testtechnique.application;

import fr.kelig.testtechnique.application.dto.AddPersonDTO;
import fr.kelig.testtechnique.application.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("people")
public class PersonController {

    private final AddPerson addPerson;
    private final FindAllPeople findAllPeople;

    @Autowired
    public PersonController(AddPerson addPerson, FindAllPeople findAllPeople) {
        this.addPerson = addPerson;
        this.findAllPeople = findAllPeople;
    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> findAll() {
        return new ResponseEntity<>(findAllPeople.execute(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> save(@Valid @RequestBody AddPersonDTO addPersonDTO) {
        addPerson.execute(addPersonDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
