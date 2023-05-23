
/**
 * Aggiungi qui una descrizione della classe Furgoni
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Furgoni extends Veicolo implements Cloneable{
    private double capacita;

    public Furgoni(){
        super(); 
        capacita = 0.0;
    }
    
    public Furgoni (String targa, String modello, double tariffa, double capacita){
        super (targa, modello, tariffa); 
        this.capacita = capacita; 
    }
    
    public Furgoni (Furgoni f){
        super(f); 
        this.capacita = f.getCapacita(); 
    }
    
    public void setCapacita (double capacita){
        this.capacita = capacita; 
    }
    
    public double getCapacita (){
        return capacita; 
    }
    
    public String toString(){
        return (super.toString()+", capacità: "+getCapacita()); 
    }
    
    public Furgoni clone()throws CloneNotSupportedException{
        return (Furgoni) super.clone(); 
    }

}
