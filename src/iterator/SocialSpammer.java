package iterator;

class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending email to: " + profile.getEmail() + " Message: " + message);
            //System.sendEmail(profile.getEmail(), message); // Método fictício de envio real
        }
    }
}
