package ba.unsa.etf.rpr;

public class Artikl {
    private final String naziv;
    private final int cijena;
    private final String kod;

    public Artikl(String ime,int cij,String k) {
        naziv=ime;
        cijena = cij;
        kod=k;
    }
    public String getNaziv() {
        return naziv;
    }
    public int getCijena() {
        return cijena;
    }
    public String getKod() {
        return kod;
    }
}
