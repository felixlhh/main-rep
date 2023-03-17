public class Kjøkken
{
    public boolean rent;
    public Komfyr k;
    public OppvaskMaskin m;
        
    public Kjøkken() {
    rent = true;
    k = new Komfyr();
    m = new OppvaskMaskin();
    }
    
    public void lagMat() {
        rent = false;
        k.startKomfyr();
        }
    
    public void ryddKjøkken() {
        m.startOppvask();
        rent = true;        
    }
    
    public Boolean erDetRent () {
        Boolean ren = (rent) ? true : false; 
        return ren;
    }
    
    /* public void erDetRent () {
        if (rent = true) {
            System.out.println("Kjøkkenet er rent!"); }
            else {System.out.println("På tide å rydde!");
                  ryddKjøkken();
            
        }
    } */   
}
       