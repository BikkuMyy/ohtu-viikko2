
package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento{
    
    private Sovelluslogiikka logiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int edellinen;

    public Nollaa(Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.logiikka = logiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = logiikka.tulos();
    }

    @Override
    public void suorita() {
        this.edellinen = logiikka.tulos();
        logiikka.nollaa();
        syotekentta.setText("");
        tuloskentta.setText(logiikka.tulos()+"");
    }

    @Override
    public void peru() {
        
        syotekentta.setText("");
        tuloskentta.setText(edellinen+"");
    }
    
}
