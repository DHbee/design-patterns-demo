package com.dharbor.observer;

/**
 * @Author: psaradhi
 * Created: 30-03-2023
 */
public class Main {

    public static void main(String[] args) {

        NewsAgencyObservable newsAgencyObservable = new NewsAgencyObservable();

        Observer observer1 = new NewChannelObserver();
        newsAgencyObservable.subscribe(observer1);

        Observer observer2 = new NewChannelObserver();
        newsAgencyObservable.subscribe(observer2);

        newsAgencyObservable.push("Today Stocks are fall down");

    }
}
