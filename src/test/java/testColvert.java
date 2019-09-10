import API.Canard;
import API.ComportementCancan;
import API.ComportementVol;
import cancanement.Cancan;
import org.junit.jupiter.api.Test;
import typeCanard.Colvert;
import vol.VolerAvecDesAiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testColvert {
    Canard colvert = new Colvert();

    @Test
    public void volColvert(){
        ComportementVol comportementVol = new VolerAvecDesAiles();
        this.colvert.afficher();
        this.colvert.setComportementVol(comportementVol);
        this.colvert.effectuerVol();
    }
    @Test
    public void cancanColvert(){
        ComportementCancan comportementCancan = new Cancan();
        this.colvert.setComportementCancan(comportementCancan);
        this.colvert.effectuerCancan();
    }

}
