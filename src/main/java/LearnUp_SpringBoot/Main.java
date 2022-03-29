package LearnUp_SpringBoot;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Welcome welcome = context.getBean("welcomeBean", Welcome.class);
        welcome.welcome();

        Game game = context.getBean("gameBean", Game.class);
        game.play();

        context.close();

    }


}
