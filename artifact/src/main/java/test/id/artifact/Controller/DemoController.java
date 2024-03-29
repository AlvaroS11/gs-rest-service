 

 package test.id.artifact.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.id.artifact.Models.Persona;
import test.id.artifact.Repository.IPersonaRepo;


@RestController
class DemoController {

    @Autowired
    private IPersonaRepo repo;

     @GetMapping("/greeting")
     public String getMethodName(@RequestParam (name="name", required = false, defaultValue = "World") String name, Model model) {


        //esto que es la lógica iria en service
        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre("Mitocode");
        repo.save(p);
        


        model.addAttribute("name", name);
         return ("Hello world " + name);
     }
     
}