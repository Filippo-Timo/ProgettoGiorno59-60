package ElementoMultimediale;

import interfaces.Luminosita;
import interfaces.Play;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Play, Luminosita, Volume {

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaLuminosita() {

    }

    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
