package ba.unsa.etf.rpr;

public class Supermarket {
   private Artikl[] artikli =new Artikl[1000];
   private int br=0;
   public boolean dodajArtikl(Artikl a ){
  if(br<1000){
     artikli[br]=new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
     br=br+1;
     return true;
  }
  return false;
   }
   public Artikl[] getArtikli() {
      return artikli;
   }

   public Artikl izbaciArtiklSaKodom(String kod){
      int x;
      for(int i=0;i<br;i++) {
         if (artikli[i].getKod().equals(kod)) {
            x = i;
            Artikl a = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
            for (int j = x; j < br; j++) {
               artikli[j] = artikli[j + 1];
            }
            artikli[br] = null;
            br = br - 1;
            return a;
         }
      }
return null;
   }
}
