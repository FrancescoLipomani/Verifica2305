import java.time.*;
//struttura = hashmap perchè utilizziamo le chiavi più facile per fare aggiunge e rimuovere senza doverpassare tutta la lista
//struttura = LinkedList o ArrauyList = passano tutta la lista (ArrayList get in tempo costante e LinkedList remuove in tempo costante)
//libri, gestione prodotti = hashmap più  facile la gestione 
//gestione clienti = linked list
public class Test
{
    public static void main (String[] args){
        Noleggio n1 = new Noleggio ("AZ678HJ", "Fiat 500", 5, "LPMFNC05B14L781M", "Francesco", "Lipomani", LocalDate.of(2023, Month.MAY, 05), 3); 
        Noleggio n2 = new Noleggio ("FJ087CZ", "Polo", 15, "HTPDRF89F45E67J", "Fabio", "Neri", LocalDate.of(2023, Month.MAY, 07), 2); 
        Noleggio n3 = new Noleggio ("GT781ER", "Golf", 100, "RSSFPP67B89G123T", "Filippo", "Rossi", LocalDate.of(2023, Month.APRIL, 27), 10); 
    
        Salone s = new Salone();
        try{
            s.aggiungiNoleggio (n1);
            s.aggiungiNoleggio (n2);
            s.aggiungiNoleggio (n3);
        }catch (CloneNotSupportedException|SalonePieno|NoleggioEsistente e){
            System.out.println (e); 
        }
        
        System.out.println (s.elenco()); 
        
        try{
            System.out.println (s.cercaNoleggio("AZ678HJ"));
        }catch (CloneNotSupportedException|NoleggioInesistente e){
            System.out.println (e); 
        }
        
        
        System.out.println (s.tot("FJ087CZ")); 
    }
}
