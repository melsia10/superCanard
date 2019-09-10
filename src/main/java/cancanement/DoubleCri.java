package cancanement;

import API.ComportementCancan;

public class DoubleCri implements ComportementCancan{
    ComportementCancan comportementCancan1;
    ComportementCancan comportementCancan2;

    public void setComportementCancan1(ComportementCancan comportementCancan) {
        this.comportementCancan1 = comportementCancan;
    }

    public void setComportementCancan2(ComportementCancan comportementCancan) {
        this.comportementCancan2 = comportementCancan;
    }

    @Override
    public void cancan() {
        comportementCancan1.cancan();
        comportementCancan2.cancan();
    }
}
