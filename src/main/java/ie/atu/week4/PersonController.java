package ie.atu.week4;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class PersonController {

    private List<Person> personList = new ArrayList<>();
    @GetMapping("/getPerson")
    public List<Person> getPerson(){
        return personList;
    }

    @PostMapping("/person/createPerson")
    public List<Person> addPerson(@Valid @RequestBody Person person){
        personList.add(person);
        return personList;
    }

}
