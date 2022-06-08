package hu.nye.algorithm.travel.repository;

import hu.nye.algorithm.travel.model.Countries;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Countries, Integer> {
}
