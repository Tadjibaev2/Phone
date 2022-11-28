import java.util.Arrays;

public class Phone {
    private Cards [] cards;
    private Contacts [] contacts;
    private Contacts [] newContacts;
    public Phone (Cards [] cards, Contacts [] contacts) {
        this.cards = cards;
        this.contacts = contacts;
    }

    public void setCards (Cards [] cards, Contacts [] contacts){
        this.cards = cards;
        this.contacts = contacts;
    }public Cards [] getCards (){
        return this.cards;
    }

    public void setContacts (Contacts [] contacts){
        this.contacts = contacts;
    }public Contacts [] contacts (){
        return this.contacts;
    }

    public void plusContact (String name, String code, String number){
        newContacts = Arrays.copyOf(contacts, contacts.length+1);
        newContacts [newContacts.length-1] = new Contacts(name, code, number);
        System.out.println(Arrays.toString(newContacts));
    }
    public void minusContact (int numberOfNumber){

        newContacts [numberOfNumber] = null;
        System.out.println(Arrays.toString(newContacts));
    }

    @Override
    public String toString() {
        return ("Cards " + Arrays.toString(cards) + "\n\nContacts" + Arrays.toString(contacts) );
    }
}
