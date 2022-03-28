package empie.pie.NewSpringCourse;

import empie.pie.NewSpringCourse.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan() - set packages to scan for beans other than default package (with @SpringBootApplication)
public class NewSpringCourseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NewSpringCourseApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}

}
