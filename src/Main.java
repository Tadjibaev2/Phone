import LinkedCards.LinkedCards;

public class Main {
    public static void main(String[] args) {
        LinkedCards cards = new LinkedCards(); // инициализируем экземпляр пустого массива привязанных карт
        cards.AddCard(); // запускаем процесс добавления банковской карты к телефону
        System.out.println(cards); // получим список привязанных карт
        cards.AddCard(); // запускаем процесс добавления еще одной банковской карты к телефону
        System.out.println(cards); // еще раз получим список привязанных карт
    }
}
