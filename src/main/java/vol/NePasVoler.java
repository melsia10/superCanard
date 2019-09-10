package vol;

import API.ComportementVol;

public class NePasVoler implements ComportementVol {
    public void voler() {
        System.out.println("Je ne peux pas voler");
    }
}
