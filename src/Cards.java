public class Cards {
    private String nameOfCard;
    private String nameOfBank;
    private double balanceOfCard;
    private String typeOfCard; //visa or elkart

    public Cards(String nameOfCard, String nameOfBank, double balanceOfCard, String typeOfCard){
        this.nameOfCard = nameOfCard;
        this.nameOfBank = nameOfBank;
        this.balanceOfCard = balanceOfCard;
        this.typeOfCard = typeOfCard;
    }

    public void setNameOfCard (String nameOfCard){
        this.nameOfCard = nameOfCard;
    }public String getNameOfCard (){
        return this.nameOfCard;
    }

    public void setNameOfBank (String nameOfBank){
        this.nameOfBank = nameOfBank;
    }public String getNameOfBank (){
        return this.nameOfBank;
    }

    public void setTypeOfCard (String typeOfCard){
        this.typeOfCard = typeOfCard;
    }public String getTypeOfCard (){
        return this.typeOfCard;
    }

    public void setBalanceOfCard (double balanceOfCard){
        this.balanceOfCard = balanceOfCard;
    }public double getBalanceOfCard () {
        return this.balanceOfCard;
    }

    public double plusBalance (int money) {
        balanceOfCard += money;
        return balanceOfCard;
    }
    public double minusBalance (int money) {
        balanceOfCard -= money;
        return balanceOfCard;
    }

    @Override
    public String toString() {
        return ("Card:" +
                "\nName Of Card -> " + nameOfCard +
                ",\nName Of Bank -> " + nameOfBank +
                ",\nBalance Of Card -> " + balanceOfCard +
                ",\nType Of Card -> " + typeOfCard);
    }
}
