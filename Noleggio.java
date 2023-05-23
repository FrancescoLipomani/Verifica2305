import java.time.*;

/**
 * Aggiungi qui una descrizione della classe Noleggio
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Noleggio extends Clienti implements Cloneable{
    private int ID; 
    private LocalDate data; 
    private int nGiorni; 
    //private double costo; //il costo possiamo non metterlo e facciamo getTariffa()*getNGiorni()? certo e per estender a due classi non va bene la virgola ?
    
    public Noleggio(){
        super(); 
        this.ID = 0; 
        this.data = LocalDate.of(2020, Month.JANUARY, 1);
        this.nGiorni = 0;        
    }
    
    public Noleggio (String targa, String modello, double tariffa, String codiceFiscale, String nome, String cognome, LocalDate data, int nGiorni){
        super (targa, modello, tariffa, codiceFiscale, nome, cognome);
        this.ID = 0; 
        this.data = data;
        this.nGiorni = nGiorni; 
    }
    
    public void setData (LocalDate data){
        this.data = data; 
    }
    
    public void setNGiorni (int nGiorni){
        this.nGiorni = nGiorni; 
    }
    
    public LocalDate getData(){
        return data; 
    }
    
    public int getNGiorni (){
        return nGiorni; 
    }
    
    public int getID (){
        return ID++; 
    }
    
    public double getCosto(){
        return (super.getTariffa()*getNGiorni()); 
    }
    
    public String toString(){
        return (getID()+" "+super.getTarga()+" "+super.getCodiceFiscale()+" "+getData()+" "+getNGiorni()+" "+getCosto()); 
    }
    
    public Noleggio clone() throws CloneNotSupportedException {
        return (Noleggio) super.clone(); 
    }
}
