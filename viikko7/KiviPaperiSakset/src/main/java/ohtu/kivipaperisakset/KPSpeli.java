
package ohtu.kivipaperisakset;
public abstract class KPSpeli {
    
    public static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    protected abstract void pelaa();
    
}
