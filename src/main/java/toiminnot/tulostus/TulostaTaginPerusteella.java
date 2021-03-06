/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toiminnot.tulostus;

import Vinkkitietokanta.Vinkki;
import Vinkkitietokanta.VinkkitietokantaRajapinta;
import io.LukijaRajapinta;
import io.TulostusRajapinta;
import java.util.List;
import toiminnot.Listantulostusoperaatio;

/**
 *
 * @author mikkomo
 */
public class TulostaTaginPerusteella extends Listantulostusoperaatio {

    public TulostaTaginPerusteella(LukijaRajapinta lukija, TulostusRajapinta tulostus, VinkkitietokantaRajapinta tk) {
        super(lukija, tulostus, tk);
    }

    @Override
    public void suorita() {
        super.getTulostus().println("Anna tagi");
        super.getTulostus().println("");
        String tagSyote = super.getLukija().nextLine();
        super.tulostaLista(this.haeTagillla(tagSyote));
    }

    private List<Vinkki> haeTagillla(String tag) {
        return super.getTk().haeTagilla(tag);
    }

}
