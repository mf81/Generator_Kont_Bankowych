package eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.TypKonta;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value="session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class TypKontaZbior {
    private List<TypKonta> typKonta;

    public TypKontaZbior() {
        typKonta = new ArrayList<TypKonta>();
        typKonta.add(new TypKonta("000","Obydwa"));
        typKonta.add(new TypKonta("001","Eksploatacja"));
        typKonta.add(new TypKonta("002","Remontowe"));
    }

    public List<TypKonta> getTypKonta() {
        return typKonta;
    }

    public void setTypKonta(List<TypKonta> typKonta) {
        this.typKonta = typKonta;
    }
}
