package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/Mavai/Alive.git";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/Mavai/Alive";
    }

    public static String herokuUrl() {
        return "https://blooming-everglades-31746.herokuapp.com/";
    }
}
