package Lab9.challenge1;

import reactor.core.publisher.Flux;

public class Challenge1 {
    public Flux<String> emptyFlux() {
        return Flux.empty();
    }

    public Flux<String> fooBarFluxFromValue() {
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux() {
        return Flux.error(new IllegalAccessError());
    }
}
