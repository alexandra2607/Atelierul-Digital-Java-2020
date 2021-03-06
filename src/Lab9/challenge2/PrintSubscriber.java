package Lab9.challenge2;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class PrintSubscriber<String> implements Subscriber<String> {
    public void onSubscribe(Subscription subscription) {
        subscription.request(1);
    }

    public void onNext(String item) {
        System.out.println(item);
    }

    public void onComplete(){
        System.out.println("completed");
    }

    public void onError(Throwable t){
        System.out.println(t);
    }
}
