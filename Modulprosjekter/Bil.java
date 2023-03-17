public class Bil{
    
    private double bensin;
    private double km;

    
    public Bil () {
        bensin = 0;
        km = 0;
    }
    
    public void kjørBil (int distanse) {
        
        for (int i = 0; i <= distanse; i++) {
             if (bensin <= 0) {
                distanse = 0;
                System.out.println("Du har gått tom for bensin!!");
                }
            else {
            bensin -= 0.5;
            System.out.println("Vrrooom");
            }
        }
        km += distanse;
    }
    
    public double fyllBensin (double liter) {
        return bensin += liter;
    }
    public double sjekkBensin () {
        return bensin;
    }
    public double sjekkKm () {
        return km;
    }
}