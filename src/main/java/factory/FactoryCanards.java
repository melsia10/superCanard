package factory;

import API.Canard;
import cancanement.*;
import typeCanard.CanardEnPlastique;
import typeCanard.Colvert;
import typeCanard.Leurre;
import typeCanard.Mandarin;
import vol.NePasVoler;
import vol.VolerAvecDesAiles;

public class FactoryCanards {
    VolerAvecDesAiles envol = new VolerAvecDesAiles();
    NePasVoler neVolePas = new NePasVoler();
    Cancan cancan = new Cancan();
    Coincoin coincoin = new Coincoin();
    Begaiement begaiement = new Begaiement();
    Begaiement begaiementDouble = new Begaiement();
    CanardMuet muet = new CanardMuet();
    DoubleCri doubleCri = new DoubleCri();

    public Canard createColvert(){
        Canard colvert = new Colvert();
        colvert.setComportementVol(envol);
        colvert.setComportementCancan(cancan);
        return colvert;
    }
    public Canard createCanardEnPlastique(){
        Canard canardEnPlastique = new CanardEnPlastique();
        canardEnPlastique.setComportementVol(neVolePas);
        canardEnPlastique.setComportementCancan(coincoin);
        return canardEnPlastique;
    }
    public Canard createLeurre(){
        Canard leurre = new Leurre();
        leurre.setComportementVol(neVolePas);
        leurre.setComportementCancan(muet);
        return leurre;
    }
    public Canard createMandarin(){
        Canard mandarin = new Mandarin();
        mandarin.setComportementVol(envol);
        begaiement.setComportementCancan(cancan);
        begaiementDouble.setComportementCancan(begaiement);
        mandarin.setComportementCancan(begaiementDouble);
        return mandarin;
    }
    public Canard createMandarindoubleCriard(){
        Canard doubleCriard = new Mandarin();
        doubleCriard.setComportementVol(envol);
        doubleCri.setComportementCancan1(cancan);
        doubleCri.setComportementCancan2(coincoin);
        doubleCriard.setComportementCancan(doubleCri);

        return doubleCriard;
    }



}
