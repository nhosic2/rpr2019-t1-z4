package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket market=new Supermarket();
        Artikl a= new Artikl("Reket",50,"21" );
        market.dodajArtikl(a);
        assertEquals(1,market.getBr());

    }
    @Test
    void dodajArtikl_neuspjesno() {
        Supermarket market=new Supermarket();
        Artikl a= new Artikl("Reket",50,"21" );
        for(int i=0;i<1000;i++){
            market.dodajArtikl(a);
        }
        assertFalse(market.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket market=new Supermarket();
        Artikl a= new Artikl("Reket",50,"21" );
        market.dodajArtikl(a);
        Artikl x=market.izbaciArtiklSaKodom("21");
        assertEquals("21",x.getKod());
    }
    @Test
    void izbaciArtiklSaKodom_neuspjesno() {
        Supermarket market=new Supermarket();
        Artikl a= new Artikl("Reket",50,"21" );
        market.dodajArtikl(a);
        Artikl x=market.izbaciArtiklSaKodom("27");
        assertNull(x);
    }
}