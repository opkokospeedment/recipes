package recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Throwable {
        new Project1Application().start();
        SpringApplication.run(Application.class, args);
    }

}
