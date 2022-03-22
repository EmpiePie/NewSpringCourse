package empie.pie.NewSpringCourse;

import empie.pie.NewSpringCourse.game.GameRunner;
import empie.pie.NewSpringCourse.game.MarioGame;
import empie.pie.NewSpringCourse.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NewSpringCourseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NewSpringCourseApplication.class, args);
		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);

		//SuperContraGame game = new SuperContraGame();

		runner.runGame();
	}

}
