package entities;

public sealed interface Trackable permits Record {
    void track();
}
