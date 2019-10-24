
/**
 * Persona
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 03/10/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        Persona p, p1, p2;
        Famiglia f;
        
        p = new Persona(17, "Cristian Signoretti", "Maschio", "Macellaio");
        p1 = new Persona(2, "Nuriel Crescentini", "Maschio", "Pensionato");
        p2 = new Persona(17, "Leonardo Cannarella", "Maschio", "Programmatore");
        f = new Famiglia(p, p1, p2, "Signoretti");
        
        System.out.println(p.chiSei());
        System.out.println(p1.chiSei());
        System.out.println(f.toString());
    }
}
