package sample_1;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

    // standard getter and setter

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
