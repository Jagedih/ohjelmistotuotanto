package laskin;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Summa extends Komento {

    TextField syotekentta;
    TextField tuloskentta;
    Sovelluslogiikka sovellus;
    
    public Summa(TextField tuloskentta,TextField syotekentta, Sovelluslogiikka sovellus) {
      this.syotekentta = syotekentta;
      this.tuloskentta = tuloskentta;
      this.sovellus = sovellus;
    }
    
    @Override
    public void suorita() {
      this.sovellus.plus(Integer.parseInt(syotekentta.getText()));
      this.tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }
}
