package reto5.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import vistas.Ventana;
 

@SpringBootApplication
@ComponentScan("reto5.demo")
public class Reto5Application {
    
        public static void main(String[] args){
            new Ventana().setVisible(true);
        }

	public static void runSpringServer(String[] args){
		SpringApplication.run(Reto5Application.class, args);
	}
}
