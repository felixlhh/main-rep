import java.util.ArrayList;
import java.util.Iterator;

public class Bokhylle {
    
    public ArrayList<String> bøker;
    
    public Bokhylle() {
        bøker = new ArrayList<>();
        bøker.add("bok1");
        bøker.add("bok2");
        bøker.add("bok3");
        bøker.add("bok4");
        bøker.add("bok5");
    }
    
    public int getBøker () {
        return bøker.size();
    }
    
    public void nyBok (String navn) {
        bøker.add(navn);
    }
    
    public void fjernBok (int index) {
        if (index>=0 && index < bøker.size()) 
        {
        bøker.remove(index);
        }
    }
    
    public String hentBok (int index) {
        if (index>=0 && index < bøker.size()) {
            String navn = bøker.get(index);
            return navn;
        } else return null;
    }
    
    public void iterate () {
        Iterator<String> i = bøker.iterator();
        int max = 3;
        
        while (bøker.size() > max) {
            i.next();
            i.remove();
        }
    }
    
    public void foreach () {
        for (String bok : bøker) {
            System.out.println(bok);
        }
    }

    
       
   
    
  
    
    
    
    
   
        
        
        
    
        
    
    
      public void printBøker () {
       for (int i = 0; i < bøker.size(); i++) {
           System.out.println(bøker.get(i));
       }
    }
        
}



    


        
        
        
    


    
    
