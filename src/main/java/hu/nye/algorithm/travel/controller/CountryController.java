package hu.nye.algorithm.travel.controller;

import java.util.List;

import hu.nye.algorithm.travel.model.Countries;
import hu.nye.algorithm.travel.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

  @Autowired
  private CountryService countryService;

  @GetMapping("/countries")
  public String showAllCountry(Model model) {
    List<Countries> listCountries = countryService.listAll();
    System.out.println(listCountries);
    model.addAttribute("listCountries", listCountries);
    return "countries";
  }
}
