package eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.BankiKlasa;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value="session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class BankiZbior {
    private List<BankiKlasa> listaBankow;

    public BankiZbior(){
        listaBankow = new ArrayList<BankiKlasa>();
        listaBankow.add(new BankiKlasa("0","PKO BP","1020 4274"));
        listaBankow.add(new BankiKlasa("1","Pocztowy","1320 1856"));
        listaBankow.add(new BankiKlasa("2","Nord Bank","1370 1398"));
    }

    public List<BankiKlasa> getListaBankow() {
        return listaBankow;
    }

    public void setListaBankow(List<BankiKlasa> listaBankow) {
        this.listaBankow = listaBankow;
    }

    public BankiKlasa getSelection (int id){
        return listaBankow.get(id);
    }
}
