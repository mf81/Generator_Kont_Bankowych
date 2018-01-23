package eu.maciejfijalkowski.Generator_Kont_Bankowych;

import java.math.BigInteger;

public class NRB {
    public static void main(String[] args) {
        System.out.println(nrbGenerator("132000220169001100060011"));
    }

    public static int nrbGenerator (String nr){
        BigInteger nrKonta, modulo, wynik;
        nrKonta = new BigInteger(nr+"252100");
        modulo = new BigInteger("97");
        wynik = nrKonta.mod(modulo);
        String y = ""+wynik;
        int wynikKoncowy = Integer.parseInt(y);
        wynikKoncowy=98-wynikKoncowy;
        return wynikKoncowy;
    }
}
