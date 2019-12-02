package laskin;

import javafx.scene.control.TextField;
public class Nollaa extends Komento {

    TextField syotekentta;
    TextField tuloskentta;
    Sovelluslogiikka sovellus;
    
    public Nollaa(TextField tuloskentta,TextField syotekentta, Sovelluslogiikka sovellus){
      this.sovellus = sovellus;
      this.syotekentta = syotekentta;
      this.tuloskentta = tuloskentta;
    }
    @Override
    public void suorita(){
        this.sovellus.nollaa();
        this.tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }
}
