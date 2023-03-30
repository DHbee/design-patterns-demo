package com.dharbor.observer;

import java.util.List;

/**
 * @Author: psaradhi
 * Created: 30-03-2023
 */
interface Observable {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void push(String subject);
}
