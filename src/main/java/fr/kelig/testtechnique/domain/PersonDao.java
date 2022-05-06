package fr.kelig.testtechnique.domain;

import java.util.List;

public interface PersonDao {

    void save(Person person);

    List<Person> findAll();
}
