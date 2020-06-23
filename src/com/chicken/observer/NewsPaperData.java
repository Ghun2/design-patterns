package com.chicken.observer;

import java.util.ArrayList;

public class NewsPaperData implements Subject {
    private ArrayList observers;
    private String news;
    private String sports;
    private String essay;

    public NewsPaperData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(news, sports, essay);
        }
    }

    public void paperContentsChanged() {
        notifyObservers();
    }

    public void setPaperContents(String news, String sports, String essay) {
        this.news = news;
        this.sports = sports;
        this.essay = essay;
        paperContentsChanged();
    }
}
