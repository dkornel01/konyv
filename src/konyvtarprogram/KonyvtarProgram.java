package konyvtarprogram;

public class KonyvtarProgram
{
    private final Konyvtar konyvtar;
    
    public static void main(String[] args)
    {
        new KonyvtarProgram().run();
    }
    
    private KonyvtarProgram()
    {
        konyvtar = new Konyvtar(5);
    }
    
    private void run()
    {
        // itt fel kell vinni egy pár terméket
        konyvtar.termekekKiir();
        konyvtar.kolcsonozhetoketKiir();
    }
}
