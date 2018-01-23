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
        listaBankow.add(new BankiKlasa("1","PKO"));
        listaBankow.add(new BankiKlasa("2","Pocztowy"));
        listaBankow.add(new BankiKlasa("3","Nord"));
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
