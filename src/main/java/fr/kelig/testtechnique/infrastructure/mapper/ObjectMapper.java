package fr.kelig.testtechnique.infrastructure.mapper;

public interface ObjectMapper<T, S> {

    T toDomain(S entity);

    S toEntity(T domainObject);
}
