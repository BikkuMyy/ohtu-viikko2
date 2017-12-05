
package ohtu;

import javax.swing.JTextField;


public class Erotus implements Komento{
    
    private Sovelluslogiikka logiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int edellinen;

    public Erotus(Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.logiikka = logiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = logiikka.tulos();
    }
    
    @Override
    public void suorita() {
        edellinen = logiikka.tulos();
        logiikka.miinus(Integer.parseInt(syotekentta.getText()));
        syotekentta.setText("");
        tuloskentta.setText(logiikka.tulos()+"");
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        tuloskentta.setText(edellinen+"");
        logiikka.nollaa();
        logiikka.plus(edellinen);
    }
    
}
