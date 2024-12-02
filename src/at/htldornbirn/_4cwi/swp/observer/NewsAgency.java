package at.htldornbirn._4cwi.swp.observer;

import java.util.List;

public class NewsAgency {

    private final String name;
    private List<NewsChannel> newsChannels;
    

    public NewsAgency(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.name;
    }

    public void broadcastMessage(String message) {

    }

    public void registerNewsChannel(NewsChannel newsChannel) {

    }
}
