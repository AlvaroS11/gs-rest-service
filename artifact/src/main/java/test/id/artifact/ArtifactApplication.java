package test.id.artifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import test.id.artifact.Service.IPersonaService;


@SpringBootApplication
public class ArtifactApplication implements  CommandLineRunner{


//	@Autowired
	//private IPersonaService service;
	public static void main(String[] args) {
		SpringApplication.run(ArtifactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//service.registrar("ddd");
		System.out.println("holaaaa ");
	}

}
