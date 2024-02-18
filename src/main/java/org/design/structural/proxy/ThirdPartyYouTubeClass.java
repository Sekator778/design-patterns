package org.design.structural.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("https://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("https://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "...");
        // Simulate connection to server
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connected!");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading popular videos...");
        // Simulate downloading popular videos
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HashMap<String, Video> videos = new HashMap<>();
        videos.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        videos.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        videos.put("dancesvideoo", new Video("asdfas3ffas", "Dancing video.mpq"));
        videos.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        videos.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        System.out.println("Done!" + "\n");
        return videos;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        // Simulate downloading video
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Video(videoId, "Some video title");
    }
}
