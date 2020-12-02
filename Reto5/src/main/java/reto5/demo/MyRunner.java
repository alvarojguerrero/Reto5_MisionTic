/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.demo;

import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import modelo.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositorio.RepositorioUsuarios;


/**
 *
 * @author alvaroguerrero
 */
@Component
public class MyRunner implements CommandLineRunner{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(MyRunner.class);
    
    
    @Autowired
    private RepositorioUsuarios repositoriousuario;

    @Override
    public void run(String... args) throws Exception {
         //To change body of generated methods, choose Tools | Templates.
    }

}

