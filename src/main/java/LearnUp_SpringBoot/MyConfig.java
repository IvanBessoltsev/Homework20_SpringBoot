package LearnUp_SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Welcome welcomeBean() {
        return new Welcome();
    }

    @Bean
    public Game gameBean() {
        return new Game();
    }


}
