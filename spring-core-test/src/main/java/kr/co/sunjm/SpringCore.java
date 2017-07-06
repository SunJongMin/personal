package kr.co.sunjm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringCore {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void run() {
		logger.debug("app Start!");
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/ApplicationContext.xml");
		SpringCore app = (SpringCore) ac.getBean("springCore");
		app.run();
	}
}
