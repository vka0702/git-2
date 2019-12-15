package ru.vasilyev.cource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(music.getSong());
        //Music music1 = ClassicalMusic.getClassicalMusic();

        //ClassicalMusic music1 = ClassicalMusic.getClassicalMusic();

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(22);
//
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer2.setVolume(48);
//
//        boolean confirm = (musicPlayer1==musicPlayer2);
//
//        System.out.println(confirm + "\n");
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());

        //musicPlayer1.playMusic();

        //System.out.println("\n" + musicPlayer1.getName());
        //System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
