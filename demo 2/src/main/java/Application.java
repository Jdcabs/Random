import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstspringboot.service.SpeakerService;
import com.firstspringboot.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println(service.findAll().get(0).getLastName());
	}

}
