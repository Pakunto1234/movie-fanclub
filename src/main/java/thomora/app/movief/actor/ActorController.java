package thomora.app.movief.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ActorController {

    @Autowired
    PersonRepository repository;

    @GetMapping("/actor/{id}")
    public  String listActor(@PathVariable("id")long id, Model model){
       Person p =  repository.findById(id).get() ;

        model.addAttribute("actor", p);
        return "actor-view";
    }

} 