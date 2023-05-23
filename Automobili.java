public class Automobili extends Veicolo implements Cloneable{
    private int nPosti;

    public Automobili(){
        super(); 
        nPosti = 0;
    }
    
    public Automobili (String targa, String modello, double tariffa, int nPosti){
        super (targa, modello, tariffa); 
        this.nPosti = nPosti; 
    }
    
    public Automobili (Automobili f){
        super(f); 
        this.nPosti = f.getNPosti(); 
    }
    
    public void getNPosti (int nPosti){
        this.nPosti = nPosti; 
    }
    
    public int getNPosti (){
        return nPosti; 
    }
    
    public String toString(){
        return (super.toString()+", capacità: "+getNPosti()); 
    }
    
    public Automobili clone()throws CloneNotSupportedException{
        return (Automobili) super.clone(); 
    }

}
