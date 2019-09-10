package API;

public abstract class Canard {

    ComportementCancan comportementCancan;
    ComportementVol comportementVol;

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void nager() {
    }

    public abstract void afficher();

    public void effectuerCancan() {
        comportementCancan.cancan();
    }

    public void effectuerVol() {
        comportementVol.voler();
    }

}
