package tn.esprit.examblanc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamBlancApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamBlancApplication.class, args);
    }

}
