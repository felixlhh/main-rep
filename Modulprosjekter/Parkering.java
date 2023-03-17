public class Parkering {
    
    private String[] biler;
    private int kapasitet;

    public Parkering (int kapasitet) {
        this.kapasitet = kapasitet;
        biler = new String[kapasitet];
    }

    public String parker (String regnr) {
            for (int i = 0; i < biler.length; i++) {
                    if (biler[i]==null) {
                    biler[i] = regnr;
                    return "Bilen " +regnr+ " ble parkert på plass "+i ;
                }
            }return "Parkeringsplassen er full";
        
    }
    
    public Boolean kjørUt (String regnr) {
        for (int i = 0; i < biler.length; i++) 
        {
            if (biler[i].equals(regnr) && biler[i] != null) {
                biler[i] = null;
                return true;
            }
        } return false;
    }
    
    public void oversikt () {
        for (int i = 0; i < biler.length; i++) {
            if (biler[i]==null) {
                System.out.println("Plass " +i+ " er ledig");
                System.out.println("---");
            } else {
                System.out.println("Plass "+i+ " er opptatt");
                System.out.println("---");
            }
        }
    }
    
    public void hvorStårBilen (String regnr) {
        for (int i = 0; i < biler.length; i++) {
            if (biler [i] != null && biler[i].equals(regnr)) {
                 System.out.println (regnr+ " er parkert på plass "+i);
            }
        }
    }
    
    public String erPlassenLedig (int plass) {
        String ledig = null;
        if (plass >= 0 && plass < biler.length) {
            ledig = (biler[plass] !=null) ? "plassen er opptatt" : "plassen er ledig";
            return ledig;
        } return ledig;
    }
    
    public int ledigePlasser() {
        int plasser = 0;
        for (int i = 0; i < biler.length; i++) {
            if (biler[i] == null) {
                plasser++;
            }
        } return plasser;
    }
    
}

