
public class Main {
    public static void main(String[] args) {
        Contacts [] contacts = new Contacts[1];
        contacts[0] = new Contacts("Andrey", "707", "0707212313");
        Cards [] cards = new Cards[1];
        cards [0] = new Cards("master", "aman", 1234.2, "visa");
        Phone phone = new Phone(cards, contacts);
        System.out.println(phone);
        System.out.println();
        phone.plusContact("Andre", "500", "0500123456");
        phone.plusContact("пвыпв", "23", "ыва");
        System.out.println();
        phone.minusContact(0);
    }
}
