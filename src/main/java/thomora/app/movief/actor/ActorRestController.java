package thomora.app.movief.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ActorRestController {

    @Autowired
    PersonRepository repository;

    @GetMapping("/actor-rest/{id}")
    public Person listActor(@PathVariable("id")long id){
      return repository.findById(id).orElse(null);
    }

} 