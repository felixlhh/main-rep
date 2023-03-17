import java.util.ArrayList;

public class Karakterliste
{
    int[] array;
    ArrayList<Integer> arrlist;

    public Karakterliste()
    {
        arrlist = new ArrayList <>();
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(6);
        arrlist.add(6);
        
        array = new int[] {3, 4, 4, 5, 6, 6, 6};
    }
    
   public float snitt () {
    float a = 0;
    float gjsnitt;
       
    for (int i = 0; i < array.length; i++) 
    
        { 
            a += array[i]; 
        }
    //System.out.printf("Ditt karaktersnitt er %.2f ", gjsnitt);
    gjsnitt = a / array.length;
    return gjsnitt;
    
    }
    
    public int lesKarakter (int index) {
        if (index < array.length && index >= 0) 
        {
            return array[index]; 
        }
        return -1;
    }
    
   
   
    
}
