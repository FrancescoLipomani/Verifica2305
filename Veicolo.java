public abstract class Veicolo implements Cloneable{
    private String targa;
    private String modello;
    private double tariffa; 
    
    public Veicolo (){
        this.targa = ""; 
        this.modello = ""; 
        this.tariffa = 0.0; 
    }
    
    public Veicolo (String targa, String modello, double tariffa){
        setTarga(targa);
        setModello(modello);
        setTariffa(tariffa);
    }
    
    public Veicolo (Veicolo v){
        this.targa = v.getTarga(); 
        this.modello = v.getModello(); 
        this.tariffa = v.getTariffa(); 
    }
    
    public void setTarga (String targa){
        this.targa = targa;
    }
    
    public void setModello (String modello){
        this.modello = modello; 
    }
    
    public void setTariffa (double tariffa){
        this.tariffa = tariffa; 
    }
    
    public String getTarga(){
        return targa; 
    }
    
    public String getModello(){
        return modello; 
    }
    
    public double getTariffa(){
        return tariffa;
    }
    
    public String toString(){
        return ("Targa: "+getTarga()+", modello: "+getModello()+", tariffa: "+getTariffa()); 
    }
    
    public Veicolo clone() throws CloneNotSupportedException {
        return (Veicolo) super.clone();
    }
}
