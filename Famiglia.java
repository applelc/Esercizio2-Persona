
/**
 * Famiglia
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 24/10/2019)
 */
public class Famiglia
{
    private Persona padre;
    private Persona madre;
    private Persona prole;
    private String cognome;
    
    public Famiglia(Persona padre, Persona madre, Persona prole, String cognome)
    {
        setPadre(padre);
        setMadre(madre);
        setProle(prole);
        setCognome(cognome);
    }
    
    private void setPadre(Persona p)
    {
        padre=p;
    }
    
    private void setMadre(Persona p)
    {
        madre=p;
    }
    
    private void setProle(Persona p)
    {
        prole=p;
    }
    
    private void setCognome(String c)
    {
        cognome=c;
    }
    
    private String getCognome()
    {
        return cognome;
    }
    
    public String toString()
    {
        return "Padre: " + padre.toString() + "\nMadre: " + madre.toString() + "\nProle: " + prole.toString() + "\nCognome: " + getCognome();
    }
}
