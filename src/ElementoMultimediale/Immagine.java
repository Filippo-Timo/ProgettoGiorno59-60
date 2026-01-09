package ElementoMultimediale;

import interfaces.Luminosita;
import interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show, Luminosita {

    private int luminosita;

    public Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void alzaLuminosita() {
        System.out.println("Ciaoooo");
    }

    @Override
    public void abbassaLuminosita() {

    }

    @Override
    public void show() {

    }
}
