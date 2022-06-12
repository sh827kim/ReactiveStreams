package rxjava3.publisher;

import io.reactivex.rxjava3.processors.PublishProcessor;

public class HotPublisherExample {
    public static void main(String[] args) {
        var processor = PublishProcessor.create();
        processor.subscribe(data -> System.out.println("Subscriber 1: " + data));
        processor.onNext(1);
        processor.onNext(2);

        processor.subscribe(data -> System.out.println("Subscriber 2: " + data));
        processor.onNext(3);
        processor.onNext(4);

    }
}
