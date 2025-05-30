package kz.Akseleu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        player.play();

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();
    }
}
