package laskin;

import java.util.HashMap;
import java.util.Map;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Tapahtumankuuntelija implements EventHandler {

    private HashMap<Button, Komento> komennot;
    private Komento edellinen = null;
    private Sovelluslogiikka sovellus;
    private Button undo;
    
    public Tapahtumankuuntelija(TextField tuloskentta, TextField syotekentta, Button plus, Button miinus, Button nollaa, Button undo) {
      this.sovellus = new Sovelluslogiikka();
      this.komennot = new HashMap<>();
      this.komennot.put(plus, new Summa(tuloskentta, syotekentta, sovellus) );
      this.komennot.put(miinus, new Erotus(tuloskentta, syotekentta,sovellus));
      this.komennot.put(nollaa, new Nollaa(tuloskentta, syotekentta,sovellus));
      this.komennot.put(undo, new Peru(tuloskentta, syotekentta,sovellus));
    }
    
    @Override
     public void handle(Event event) {
         Komento komento = komennot.get((Button)event.getTarget());
         komento.suorita();
         edellinen = komento;
     }
}
