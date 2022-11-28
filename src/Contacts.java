public class Contacts {
    String name;
    String code;
    String number;

    public Contacts(String name, String code, String number) {
        this.name = name;
        this.code = code;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("name " + this.name + "\ncode " + this.code + "\nnumber " + this.number);
    }
}
