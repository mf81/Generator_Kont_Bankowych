package eu.maciejfijalkowski.Generator_Kont_Bankowych.models.services;

import eu.maciejfijalkowski.Generator_Kont_Bankowych.models.ADM;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value="session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class ADMZbior {
    private List<ADM> admy;

    public ADMZbior() {
        admy = new ArrayList<ADM>();
        admy.add(new ADM("1","Centrum"));
        admy.add(new ADM("2","Miasto"));
        admy.add(new ADM("3","Zasanie"));
    }

    public List<ADM> getAdmy() {
        return admy;
    }

    public void setAdmy(List<ADM> admy) {
        this.admy = admy;
    }
}
