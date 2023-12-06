
package konyvtarprogram;


public class DVD extends AbstractTermek implements Kolcsonozheto{
    
    public DVD(String cime, int hosszPercben) {
        super(cime, hosszPercben);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getHosszPercben() {
        return super.getHosszPercben(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCime() {
        return super.getCime(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
