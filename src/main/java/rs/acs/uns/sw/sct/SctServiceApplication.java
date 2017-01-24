package rs.acs.uns.sw.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application - root.
 */
@SpringBootApplication
public class SctServiceApplication { //NOSONAR - invalid warning

    /**
     * Main method
     *
     * @param args standard arguments
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SctServiceApplication.class);
        app.setAdditionalProfiles("test");
        app.run(args);
    }
}
