```TRACCIA PROVA```

Si vuole progettare un’applicazione per gestire il noleggio di Veicoli. I veicoli sono identificati da una Targa e caratterizzati da un Modello e una Tariffa giornaliera.
I veicoli sono suddivisi in furgoni e automobili. Le automobili hanno un numero di posti, i furgoni hanno una capacità di carico espressa in kg.
Per ogni veicolo si hanno molti noleggi, caratterizzati da un ID univoco di tipo intero, una data inizio, un numero giorni, un costo e un cliente.
I clienti sono identificati dal codice fiscale e hanno un nome e cognome.

L’applicazione deve avere le seguenti funzionalità, testale nel main:

Visualizzare i noleggi, con i dati significativi del veicolo e del cliente fornendo la Targa oppure il Codice Fiscale del cliente
Visualizzare una scheda di dettaglio di un noleggio in cui sono riportati anche in modo completo i dati del veicolo e del cliente. Il singolo noleggio è identificato con l’ID.
Inserire un nuovo noleggio verificando che il veicolo non sia impegnato. Il costo del noleggio si calcola moltiplicando la tariffa per il numero di giorni.
Data una targa calcolare il totale in euro dei noleggi
Dato un codice fiscale calcolare il totale in euro dei noleggi
Ricavare il totale in euro dei noleggi raggruppato per auto.

# DESCRIZIONE DEL CODICE 
Bisognare creare la classe Veicolo, passandogli come attributi targa (string), modello (string) e una tariffa giornaliera (double)
I Veicoli sono classi padre si Furgoni e Automobili, nei Furgoni aggiungo la capacità di carico (double) mentre nelle Automobili aggiungiamo il numero di posti (int) 
La classe Veicoli è la classe padre di Cliente hanno come attributi codice fiscale (string), nome (string) e cognome (string)
Poi la classe Cliente è la classe padre di Noleggio per raggruppare tutte le informazioni isieme nel noleggio così poi nella hashmap utilizziamo la classe Noleggio 
per aggiungere o rimuovere i noleggi.
La hashmap l'ho fatta nella classe Salone dove vengono aggiunti, rimossi o ricercati i noleggi passandogli come chiave una stringa, in base alla richiesta del punto.

Nel primo punto vengono aggiunti i noleggi al salone e poi attraverso il metodo elencaNoleggi(), tutti i toString degli autoleggi
Poi faccio una rierca per un singolo noleggio utilizzando come chiave l'ID univoco di tipo intero
Poi aggiungo un noleggio e nel metodo aggiungiNoleggio() lancia un'eccezione in caso il veicolo sia impegnato
Poi un metodo che data una targa (chiave della hashmap) calcola il totale in euro (un for-each) 
Poi un metodo uguale a quello precedente solo che la chiave non è più la targa ma la il codice fiscale del Cliente
Infine un metodo per ricavare il totale in euro dei noleggi raggruppati per auto 


# COMANDI UTILIZZATI PER LA CREAZIONE DI QUESTO REPOSITORY 
cd $HOME/Desktop/Verifica2305
git init
git add README.md
git commit -m "aggiunta README"
git branch -M main
git remote add origin https://github.com/FrancescoLipomani/Verifica2305.git
git push -u origin main
git push https://FrancescoLipomani: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@github.com/FrancescoLipomani/Verifica2305.git
git add .
git commit -m "aggiunta tuttissimo" --> aggiunge tutti i file presenti nella cartella Verifica2305
git branch -M main
git push https://FrancescoLipomani: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@github.com/FrancescoLipomani/Verifica2305.git

![comando1](comando1.png)
![comando2](comando2.png)
![comando3](comando3.png)
![comando4](comando4.png)