
/**
 * Persona - Creazione e identità di persone
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 03/10/2019)
 */
public class Persona
{
    private int eta;
    private String nome;
    private String sesso;
    private String professione;
    
    public Persona(int eta, String nome, String sesso, String professione)
    {
        setEta(eta);
        setNome(nome);
        setSesso(sesso);
        setProfessione(professione);
    }
    
    private void setEta(int e)
    {
        eta=e;
    }
    
    private void setNome(String n)
    {
        nome=n;
    }
    
    private void setSesso(String s)
    {
        sesso=s;
    }
    
    private void setProfessione(String p)
    {
        professione=p;
    }
    
    public int getEta()
    {
        return eta;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getSesso()
    {
        return sesso;
    }
    
    public String getProfessione()
    {
        return professione;
    }
    
    public String chiSei()
    {
        return "Sono una persona di nome: " + getNome() + ", di sesso: " + getSesso() + ", di età: " + getEta() +
        ", di professione: " + getProfessione();
    }
}
