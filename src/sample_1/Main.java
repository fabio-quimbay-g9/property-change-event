package sample_1;

public class Main {

    public static void main(String[] args) {

        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());
    }
}
