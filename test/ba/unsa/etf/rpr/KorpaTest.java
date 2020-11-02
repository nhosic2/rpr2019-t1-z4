package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa =  new Korpa();
        Artikl a= new Artikl("Reket",50,"21" );
        korpa.dodajArtikl(a);
        assertEquals(1,korpa.getBr());
    }
    @Test
    void dodajArtikl_neuspjesno() {
        Korpa korpa =  new Korpa();
       for(int i=0;i<50;i++){
           Artikl artikl= new Artikl("sat",50,"75");
           korpa.dodajArtikl(artikl);
       }
       assertFalse(korpa.dodajArtikl(new Artikl("laptop",70, "32")));
    }
    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa =  new Korpa();
        korpa.dodajArtikl(new Artikl("laptop",70, "32"));
        Artikl a=korpa.izbaciArtiklSaKodom("32");
        assertEquals("32",a.getKod());

    }
    @Test
    void izbaciArtiklSaKodom_neuspjesno() {
        Korpa korpa =  new Korpa();
        korpa.dodajArtikl(new Artikl("laptop",70, "32"));
        Artikl a=korpa.izbaciArtiklSaKodom("36");
        assertEquals(null,a);

    }
    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa =  new Korpa();
        korpa.dodajArtikl(new Artikl("sijalica",50,"44"));
        korpa.dodajArtikl(new Artikl("plafonjera", 45,"89"));
        assertEquals(95,korpa.dajUkupnuCijenuArtikala());
    }
}