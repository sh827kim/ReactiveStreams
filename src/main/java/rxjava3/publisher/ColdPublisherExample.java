package rxjava3.publisher;

import io.reactivex.rxjava3.core.Flowable;

public class ColdPublisherExample {
    public static void main(String[] args) {
        var flowable = Flowable.just(1, 2, 3, 4, 5);

        flowable.subscribe(data -> System.out.println("Subscriber 1: " + data));
        flowable.subscribe(data -> System.out.println("Subscriber 2: " + data));
    }
}
