package iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type; // "friends" ou "coworkers"

    private int currentPosition = 0;
    private List<Profile> cache; // Usando List<Profile> em vez de array of Profile

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type); // Método fictício
        }
    }
    
    @Override
    public Profile getNext() {
        if (hasMore()) {
            Profile result = cache.get(currentPosition); // Usando .get() em List
            currentPosition++;
            return result;
        }
        throw new NoSuchElementException("No more elements"); // Melhor prática em Java
    }
    
    @Override
    public boolean hasMore() {
        lazyInit();
         return currentPosition < cache.size(); // .size() para List
    }
}
