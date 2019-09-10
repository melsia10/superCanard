package cancanement;

import API.ComportementCancan;

public class Begaiement implements ComportementCancan {

    ComportementCancan criDeBase;

    @Override
    public void cancan() {
        if(criDeBase != null){
        System.out.println("Je bégaie");
        criDeBase.cancan();
        criDeBase.cancan();
        }
    }
    public void setComportementCancan(ComportementCancan comportementCancan){
        this.criDeBase = comportementCancan;
    }
}
