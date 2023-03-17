import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;

/**

The Terninger class simulates rolling multiple dice and stores the results in a HashMap.

@author Felix Leon Hammond
*/
    public class Terninger {

    /**

    The random number generator used to simulate dice rolls.
    */
    private Random r;
    /**
    

    The number of dice being rolled.
    */
    private int antall;
    /**

    The HashMap that stores the results of each dice roll.
    */
    private HashMap<String, String> tabell;
    /**

    Constructs a Terninger object with a specified number of dice.
    @param antall the number of dice being rolled
    */
        public Terninger(int antall) {
        this.antall = antall;
        r = new Random();
        tabell = new HashMap<String, String>();
    }

    /**

    Simulates rolling multiple dice and returns a string representing the results.
    @return a string representing the results of the dice roll
    */
        public String terningKast() {
        int[] resultatArr = new int[antall];
        String resu = null;
            for (int i = 0; i < resultatArr.length; i++) {
            resultatArr[i] = r.nextInt(6)+1;
                if (resu == null) {
                resu = resultatArr[i] + " ";
                } else {
                resu += resultatArr[i] + " ";
            }
        }   
        return resu;
        }
    /**

    Simulates rolling multiple dice a specified number of times and stores the results in a HashMap.
    @param antallKast the number of times to roll the dice
    */
    public void terningSimulator(int antallKast) {
    String kast = "Kast";
    for (int i = 0; i < antallKast; i++) {
        tabell.put((kast + (i + 1)), terningKast());
       }
    }
    /**

    Prints the contents of the HashMap storing the results of the dice rolls.
    */
    public void visTabell() {
    System.out.println(tabell);
    }
    /**

    Clears the HashMap storing the results of the dice rolls.
    */
    public void tømTabell() {
    tabell.clear();
    }
}
    