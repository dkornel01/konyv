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
        konyvtar.felvesz(new CD("asd", 128));
        konyvtar.felvesz(new CD("fgh", 120));
        konyvtar.felvesz(new DVD("qwe", 118));
        konyvtar.felvesz(new DVD("rtz", 135));
        konyvtar.felvesz(new DVD("xyz", 140));
        konyvtar.termekekKiir();
        konyvtar.kolcsonozhetoketKiir();
    }
}
