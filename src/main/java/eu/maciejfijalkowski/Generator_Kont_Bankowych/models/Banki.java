package eu.maciejfijalkowski.Generator_Kont_Bankowych.models;

import java.util.HashMap;
import java.util.Map;

public class Banki {
    public static Map<String,String> BankiMapa (){
        Map<String,String> bank = new HashMap<String,String>();
        bank.put("1", "Pocztowy");
        bank.put("2", "PKO");
        bank.put("3", "NORD");
        return bank;
    }

}
