package LinkedCards;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class LinkedCards {
    private String [] cards = new String[2]; // массив с двумя слотами под привязку банковских карт к телефону (пустой массив)

    private String numberCard; // номер карты, которую хотим привязать

    Scanner sc = new Scanner(System.in);

    public String[] getCards() {
        return cards;
    }
    public void setCards(String[] cards) {
        this.cards = cards;
    }

    public void AddCard () { // метод, который добавит банковскую карту к телефону
        System.out.print("Введите номер банковской карты, которую хотите привязать к телефону: ");
        this.numberCard = sc.nextLine(); // вводим номер карты, которую хотим привязать к телефону:

        if (Objects.equals(numberCard, cards[0]) || Objects.equals(numberCard, cards[1])) { // если карта с таким номером уже была привязана,
            System.out.printf("Произошла ошибка. Карточка %s уже привязана. \n", numberCard); // печатаем ошибку
        }

        else if (numberCard.length() != 16) { // если номер карты введен неверно (больше или меньше 16 цифр)
            System.out.println("Вы ввели неверный номер карты. Номер карты должен состоять из 16 цифр"); // печатаем ошибку
        }

        else if (cards[0] == null) { // если первый слот не имеет привязанной карты,
            cards[0] = numberCard; // банковская карта займет первый слот привязанных карт
            System.out.printf("Вы привязали банковскую карточку под номером %s в первый слот привязанных карт к телефону \n", numberCard);
            // печатаем сообщение об успешной операции
        }

        else if (cards[1] == null) { // если второй слот не имеет привязанной карты,
            cards[1] = numberCard; // банковская карта займет второй слот привязанных карт
            System.out.printf("Вы привязали банковскую карточку под номером %s в второй слот привязанных карт к телефону \n", numberCard);
            // печатаем сообщение об успешной операции
        }
    }

    @Override
    public String toString() {
        return "Список привязанных карт к телефону: " + Arrays.toString(getCards());
    }
}
