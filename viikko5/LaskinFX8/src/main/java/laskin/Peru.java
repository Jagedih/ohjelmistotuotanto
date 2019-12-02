package laskin;

import javafx.scene.control.TextField;
public class Peru extends Komento {

    TextField syotekentta;
    TextField tuloskentta;
    Sovelluslogiikka sovellus;
    
    public Peru(TextField tuloskentta,TextField syotekentta, Sovelluslogiikka sovellus){
      this.sovellus = sovellus;
      this.syotekentta = syotekentta;
      this.tuloskentta = tuloskentta;
    }
    @Override
    public void suorita(){
        this.sovellus.edellinen();
        this.tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }
}
