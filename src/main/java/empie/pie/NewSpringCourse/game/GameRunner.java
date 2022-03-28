package empie.pie.NewSpringCourse.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    //Field Injection. Or Constructor Injection if Constructor is active below.
    //Constructor Injection Recommended
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
    System.out.println("Using Constructor");
        this.game = game;
    }

//    @Autowired
//    public void setGame(GamingConsole game) {
//        System.out.println("Using Setter");
//        this.game = game;
//    }

    public void runGame(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
