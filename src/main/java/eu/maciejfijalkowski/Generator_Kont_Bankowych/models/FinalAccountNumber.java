package eu.maciejfijalkowski.Generator_Kont_Bankowych.models;

import java.math.BigInteger;

public class FinalAccountNumber {
    private String sumaKontrolna;
    private String nazwaBanku;
    private String bankNumber;
    private String swrk;
    private String numberEF;
    private String admNumber;
    private String nazwaWM;
    private String nazwaKlienta;

    public FinalAccountNumber(String nazwaBanku, String bankNumber, String swrk, String numberEF, String admNumber, String nazwaWM, String nazwaKlienta) {
        this.sumaKontrolna = nrbGenerator(bankNumber+swrk+numberEF+admNumber+nazwaWM+nazwaKlienta);
        this.nazwaBanku = nazwaBanku;
        this.bankNumber = bankNumber;
        this.swrk = swrk;
        this.numberEF = numberEF;
        this.admNumber = admNumber;
        this.nazwaWM = nazwaWM;
        this.nazwaKlienta = nazwaKlienta;
    }

    public String getSwrk() {
        return swrk;
    }

    public void setSwrk(String swrk) {
        this.swrk = swrk;
    }

    public String getSumaKontrolna() {
        return sumaKontrolna;
    }

    public void setSumaKontrolna(String sumaKontrolna) {
        this.sumaKontrolna = sumaKontrolna;
    }

    public String getNazwaBanku() {
        return nazwaBanku;
    }

    public void setNazwaBanku(String nazwaBanku) {
        this.nazwaBanku = nazwaBanku;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getNumberEF() {
        return numberEF;
    }

    public void setNumberEF(String numberEF) {
        this.numberEF = numberEF;
    }

    public String getAdmNumber() {
        return admNumber;
    }

    public void setAdmNumber(String admNumber) {
        this.admNumber = admNumber;
    }

    public String getNazwaWM() {
        return nazwaWM;
    }

    public void setNazwaWM(String nazwaWM) {
        this.nazwaWM = nazwaWM;
    }

    public String getNazwaKlienta() {
        return nazwaKlienta;
    }

    public void setNazwaKlienta(String nazwaKlienta) {
        this.nazwaKlienta = nazwaKlienta;
    }

    public static String nrbGenerator (String nr){
        nr=nr.replaceAll("\\s+","");
        BigInteger nrKonta, modulo, wynik,liczba;
        nrKonta = new BigInteger(nr+"252100");
        modulo = new BigInteger("97");
        liczba = new BigInteger("98");
        wynik = nrKonta.mod(modulo);
        wynik=liczba.subtract(wynik);
        String y = ""+wynik;
        return y;
    }
}
