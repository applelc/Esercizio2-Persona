
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
        Persona p, p1;
        p = new Persona(17, "Cristian Signoretti", "Maschio", "Macellaio");
        p1 = new Persona(2, "Nuriel Crescentini", "Maschio", "Pensionato");
        
        System.out.println(p.chiSei());
        System.out.println(p1.chiSei());
    }
}
