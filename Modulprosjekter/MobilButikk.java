public class MobilButikk {
    int pris;
    int lagerstatus;
    int salgsinntekter;
    
    public MobilButikk (int mobilpris) {
        pris = mobilpris;
        lagerstatus = 15;
        salgsinntekter = 0;
        
    }
    public void salg (int antallMobiler) {
        if (lagerstatus <= 0 || lagerstatus < antallMobiler) {
            System.out.println("Ikke nok mobiler på lageret!");
        } else {
            int totalpris = antallMobiler * pris;
            lagerstatus = lagerstatus - antallMobiler;
            salgsinntekter = salgsinntekter + totalpris;
            System.out.println("Gratulerer! Du har solgt "+antallMobiler+" mobil(er) for "+totalpris+" kr!");
        }
    }
    public int sjekkLagerstatus () {
        return lagerstatus;
    }
    public int sjekkSalgsinntekter () {
        return salgsinntekter;
    }
    public void lagerPåfyll (int varer) {
        lagerstatus = lagerstatus + varer;
    }
}