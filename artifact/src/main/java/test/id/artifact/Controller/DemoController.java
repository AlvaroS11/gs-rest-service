 

 package test.id.artifact.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.id.artifact.Models.Persona;
import test.id.artifact.Repository.IPersonaRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
class DemoController {

    @Autowired
    private IPersonaRepo repo;

     @GetMapping("/greeting")
     public String getMethodName(@RequestParam (name="name", required = false, defaultValue = "World") String name, Model model) {


        //esto que es la lógica iria en service
        System.out.println("llego con" + name);
        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre(name);
        repo.save(p);
        
        model.addAttribute("name", name);
         return ("Hello world " + name);
     }

     @GetMapping("/list")
     public List<Persona> greeting() {
         return repo.findAll();
     }

     @PostMapping
     public String insert(@RequestBody Persona per) {
        System.out.println("***");
         repo.save(per);
         return(per.getNombre());
     }
     
     
     
}