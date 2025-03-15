package iterator;

interface ProfileIterator {
    Profile getNext();  // Assumindo que existe uma classe Profile
    boolean hasMore();
}
