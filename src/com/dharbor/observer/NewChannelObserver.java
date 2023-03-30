package com.dharbor.observer;

import java.util.Date;

/**
 * @Author: psaradhi
 * Created: 30-03-2023
 */
public class NewChannelObserver implements Observer{

    @Override
    public void update(String news) {
        System.out.println("Flash..Flash..Received -> "+news + " -> at " + new Date());

    }
}
