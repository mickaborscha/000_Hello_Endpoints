package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Nick on 2/12/2017.
 */

public class LessonConfiguration {
    @Bean
    GreetingService greetingService(){
        return new GreetingServiceImp();
    }

}
