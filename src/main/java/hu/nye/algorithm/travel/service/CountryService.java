package hu.nye.algorithm.travel.service;

import java.util.List;

import hu.nye.algorithm.travel.model.Countries;
import hu.nye.algorithm.travel.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired
  private CountryRepository countryRepository;

  public List<Countries> listAll() {
    return (List<Countries>) countryRepository.findAll();
  }
}
