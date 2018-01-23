package eu.maciejfijalkowski.Generator_Kont_Bankowych.models;

public class TypKonta {
    private String numberEF;
    private String nameEF;

    public TypKonta(String numberEF, String nameEF) {
        this.numberEF = numberEF;
        this.nameEF = nameEF;
    }

    public String getNumberEF() {
        return numberEF;
    }

    public void setNumberEF(String numberEF) {
        this.numberEF = numberEF;
    }

    public String getNameEF() {
        return nameEF;
    }

    public void setNameEF(String nameEF) {
        this.nameEF = nameEF;
    }
}
