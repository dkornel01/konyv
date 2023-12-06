package konyvtarprogram;

import java.util.UUID;

public class Konyvtar
{
    private final AbstractTermek[] termekek;
    
    public Konyvtar(int dbTermek)
    {
        termekek = new AbstractTermek[dbTermek];
    }
    
    public void felvesz(AbstractTermek termek)
    {
        int i = 0;
        while (i < termekek.length && termekek[i] != null)
        {
            i++;
        }
        if (i < termekek.length)
        {
            termekek[i] = termek;
        }
        else
        {
            System.out.println("Tele van a könyvtár!");
        }
    }
    
    public void termekekKiir()
    {
        for (AbstractTermek termek : termekek)
        {
            System.out.println(UUID.randomUUID() + ": " + termek);
        }
    }
    
    public void kolcsonozhetoketKiir()
    {
        for (AbstractTermek termek : termekek)
        {
            if (termek instanceof Kolcsonozheto k)
            {
                System.out.println(UUID.randomUUID() + ": " + k);
            }
        }
    }
}
