public class Clienti extends Veicolo
{
    private String codiceFiscale; 
    private String nome; 
    private String cognome;
    
    public Clienti(){
        super(); 
        this.codiceFiscale = ""; 
        this.nome = ""; 
        this.cognome = ""; 
    }
    
    public Clienti (String targa, String modello, double tariffa, String codiceFiscale, String nome, String cognome){
        super (targa, modello, tariffa); 
        setCodiceFiscale (codiceFiscale); 
        setNome (nome); 
        setCognome (cognome);
    }
    
    public Clienti (Clienti c){
        super(c); 
        this.codiceFiscale = getCodiceFiscale(); 
        this.nome = getNome(); 
        this.cognome = getCognome(); 
    }
    
    public void setCodiceFiscale (String codiceFiscale){
        this.codiceFiscale = codiceFiscale; 
    }
    
    public void setNome (String nome){
        this.nome = nome; 
    }
    
    public void setCognome (String cognome){
        this.cognome = cognome; 
    }
    
    public String getCodiceFiscale (){
        return codiceFiscale; 
    }
    
    public String getNome(){
        return nome; 
    }
    
    public String getCognome(){
        return cognome; 
    }
    
    public String toString(){
        return ("Nome: "+getNome()+", cognome: "+getCognome()+", codice fiscale: "+getCodiceFiscale()+super.toString()); 
    }
}
