package at.bbrz.demoinjection;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Log
public class DemoInjectionApplication implements CommandLineRunner
{
    @Autowired
    private Schule schule;

    public static void main(String[] args)
    {
        SpringApplication.run(DemoInjectionApplication.class, args);
    }

    @Override
    public void run(String[] args) throws Exception
    {
        log.info("Gestartet!");
        System.out.println("Gestartet Sysout");

        schule.starteSchule();
    }

}
