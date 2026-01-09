package ElementoMultimediale;

import interfaces.Play;
import interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {

    public RegistrazioneAudio(String titolo) {
        super(titolo);
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
