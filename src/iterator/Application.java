package iterator;

class Application {

    SocialNetwork network;
    SocialSpammer spammer;

    public void config() {
        //Exemplo simples. Em um caso real, usariamos algum tipo de configuração,
        // factory ou injeção de dependência.
        boolean workingWithFacebook = true; //  definir como você carrega essa configuração

        if (workingWithFacebook) {
            this.network = new Facebook();
        }
        //  else if (workingWithLinkedIn) { //se quisesse usar com linkedin.
		//	    this.network = new LinkedIn();
		// }
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
