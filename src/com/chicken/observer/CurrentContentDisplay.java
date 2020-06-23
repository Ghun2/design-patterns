package com.chicken.observer;

public class CurrentContentDisplay implements Observer, DisplayElement {
    private String news;
    private String sports;
    private Subject contentsData;

    public CurrentContentDisplay(Subject contentsData) {
        this.contentsData = contentsData;
        contentsData.registerObserver(this);
    }

    public void update(String news, String sports, String essay) {
        this.news = news;
        this.sports = sports;
        display();
    }

    public void display() {
        System.out.println("Today Newspaper Contents - News : " + news + " / Sport : " + sports);
    }
}
