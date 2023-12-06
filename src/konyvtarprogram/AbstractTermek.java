package konyvtarprogram;

public abstract class AbstractTermek
{
    String cime;
    int hosszPercben;

    public AbstractTermek(String cime, int hosszPercben) {
        this.cime = cime;
        this.hosszPercben = hosszPercben;
    }

    public String getCime() {
        return cime;
    }

    public int getHosszPercben() {
        return hosszPercben;
    }
    
    @Override
    public String toString() {
        return "AbstractTermek{" + "cime=" + cime + ", hosszPercben=" + hosszPercben + '}';
    }
    
}

