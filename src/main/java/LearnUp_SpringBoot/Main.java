package LearnUp_SpringBoot;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

        Game game = context.getBean("game", Game.class);
        game.welcome();
        game.play();
    }


}
