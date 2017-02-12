import Annotation.GreetingService;
import Annotation.LessonConfiguration;
import AutoWiring.Exam;
import Bean.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Nick on 2/12/2017.
 */
public class Main {
    public static void main(String... args){
       ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringDesc.xml");
        Exam exam = (Exam) context.getBean("exam");
        System.out.println(exam.getSubject());
        exam.examCheck();
    }
}
