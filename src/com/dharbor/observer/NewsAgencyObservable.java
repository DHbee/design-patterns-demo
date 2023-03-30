package com.dharbor.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: psaradhi
 * Created: 30-03-2023
 */
public class NewsAgencyObservable implements Observable{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void push(String subject){
        for (Observer observer : observerList){
            observer.update(subject);
        }
    }

    @Override
    public void subscribe(Observer observer){
        this.observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer){
        this.observerList.remove(observer);
    }
}
