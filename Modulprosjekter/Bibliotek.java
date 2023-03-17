import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class Bibliotek {
    
    private ArrayList<String> bøker;
    private HashSet<String> bokliste; 
    
    public Bibliotek() {
        bøker = new ArrayList<>();
        bokliste = new HashSet();
        bøker.add("bok1");
        bøker.add("bok1");
        bøker.add("bok2");
        bøker.add("bok2");
    }
    
    public int getBøker () {
        return bøker.size();
    }
       
    public void nyBok (String navn) {
        bøker.add(navn);
    }
    
    public void fjernBok (int index) {
        String navn = bøker.get(index);
        System.out.println(("Boken, "+navn+" er fjernet fra biblioteket"));
        bøker.remove(index);
        for (int i = 0; i>bøker.size(); i++) {
            String bok = bøker.get(i);
            System.out.println(bok);
        }
    }
    
    public String hentBok (int index) {
        if (index >= 0 && index < bøker.size()) {
            String navn = bøker.get(index);
            return navn;
        } else return null;
    }
    
    public void foreachPrint () {
        for (String element : bøker) {
           System.out.println(element); 
        }
    }
    
    /*public void iteratePrint () {
    Iterator<String> iterator = bøker.iterator();
    int max = 3;
      while(bøker.size() > max) {
        
        iterator.next();
        iterator.remove();
      
        }
    System.out.println(bøker);    
    }*/
    
    public void oppdaterListe () {
        bokliste.addAll(bøker);
        
        for (String bok : bokliste) {
            System.out.println (bok);
        }
    }
}



    


        
        
        
    


    
    
