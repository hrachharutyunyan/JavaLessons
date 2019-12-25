package Observer;

import java.util.ArrayList;
import java.util.List;

public class Provider {

    public List<Subscriber> list = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        list.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        list.remove(subscriber);
    }

    public void promotion() {
        for (Subscriber subscriber : list) {
            subscriber.update("акция на тарифы");
        }
    }
}
