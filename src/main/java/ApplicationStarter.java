import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.akhil.spring.oauth.controller")
public class ApplicationStarter {
    public static void main(String ...args){
        SpringApplication.run(ApplicationStarter.class, args);

        /*
        * Default Spring security added
        * Default username: user
        * Password generated on the start of application
        */
    }
}
