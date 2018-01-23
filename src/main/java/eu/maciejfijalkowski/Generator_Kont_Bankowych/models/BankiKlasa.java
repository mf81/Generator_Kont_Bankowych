package eu.maciejfijalkowski.Generator_Kont_Bankowych.models;

public class BankiKlasa{
    private String id;
    private String name;
    private String bankNumber;

    public BankiKlasa(String id, String name, String bankNumber) {
       this.id = id;
       this.name = name;
       this.bankNumber = bankNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
