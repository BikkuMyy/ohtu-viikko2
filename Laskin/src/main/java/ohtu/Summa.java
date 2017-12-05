
package ohtu;

import javax.swing.JTextField;


public class Summa implements Komento {

    private Sovelluslogiikka logiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int edellinen;
    
    public Summa(Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta){
        this.logiikka = logiikka;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
        this.edellinen = logiikka.tulos();
    }
    
    @Override
    public void suorita() {
        edellinen = logiikka.tulos();
        logiikka.plus(Integer.parseInt(syotekentta.getText()));
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
