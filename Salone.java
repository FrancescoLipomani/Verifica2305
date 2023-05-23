import java.util.*; 
class SalonePieno extends Exception{
        
}
class NoleggioEsistente extends Exception{
        
}
class NoleggioInesistente extends Exception{
    
}
public class Salone implements Costanti{
    HashMap <String, Noleggio> noleggi; 

    public Salone(){
        noleggi = new HashMap <String, Noleggio> (MAXL);
    }
    
    public void aggiungiNoleggio(Noleggio n) throws CloneNotSupportedException, SalonePieno, NoleggioEsistente {
        if (noleggi.size() >= MAXL)
            throw new SalonePieno(); 
        if (noleggi.containsKey(n.getTarga()))
            throw new NoleggioEsistente();
        noleggi.put(n.getTarga(), n.clone());
    }
    
    public void rimuoviNoleggio (String targa) throws NoleggioInesistente{
        if (noleggi.isEmpty() || !noleggi.containsKey(targa))
            throw new NoleggioInesistente(); 
        noleggi.remove(targa);
    }
    
    public Veicolo cercaNoleggio (String targa) throws CloneNotSupportedException, NoleggioInesistente{
        if (noleggi.isEmpty() || !noleggi.containsKey(targa))
            throw new NoleggioInesistente(); 
        return noleggi.get(targa).clone(); 
    }
    
    public String elenco(){
        String s = ""; 
        for (Noleggio n : noleggi.values()){
            s += n.toString()+"\n"; 
        }
        return s;
    }
    
    public int tot (String targa){
        int prezzo = 0; 
        for (Noleggio n : noleggi.values()){
            if (noleggi.containsKey(targa))
                prezzo += n.getCosto();
        }
        return prezzo; 
    }
}
