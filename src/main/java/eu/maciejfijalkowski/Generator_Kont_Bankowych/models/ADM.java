package eu.maciejfijalkowski.Generator_Kont_Bankowych.models;

public class ADM {
    private String admNumber;
    private String admName;

    public ADM(String admNumber, String admName) {
        this.admNumber = admNumber;
        this.admName = admName;
    }

    public String getAdmNumber() {
        return admNumber;
    }

    public void setAdmNumber(String admNumber) {
        this.admNumber = admNumber;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }
}
