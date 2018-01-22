package eu.maciejfijalkowski.Generator_Kont_Bankowych;

import java.util.HashMap;
import java.util.Map;

public class Proba {
    public static void main(String[] args) {
        Map<String,String> bank = new HashMap<String,String>();
        bank.put("1", "Pocztowy");
        bank.put("2", "PKO");
        bank.put("3", "NORD");

        bank.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
