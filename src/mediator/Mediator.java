package mediator;

interface Mediator {
    void notify(Component sender, String event);
}
