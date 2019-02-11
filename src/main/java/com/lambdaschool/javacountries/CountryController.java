package com.lambdaschool.javacountries;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;


@RestController
public class CountryController {

    @RequestMapping("names/all")
    public ArrayList<Country> getAllCountries() {
        return WebCountriesApplication.list.countryList;
    }

    @RequestMapping("names/begin")
    public ArrayList<Country> getCountriesByLetter(@RequestParam(value = "letter") String letter) {
        return WebCountriesApplication.list.findCountries(e -> (e.getName().substring(0, 1).toLowerCase().equals(letter.toLowerCase())));
    }

    @RequestMapping("names/size")
    public ArrayList<Country> getCountriesGreaterThanByNameLength(@RequestParam(value = "letters") int length) {
        return WebCountriesApplication.list.findCountries(e -> (e.getName().length()>length));
    }



}
