import API.Canard;
import factory.FactoryCanards;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        FactoryCanards factoryCanards = new FactoryCanards();
        Canard canardEnPlastique = factoryCanards.createCanardEnPlastique();
        Canard colvert = factoryCanards.createColvert();
        Canard leurre = factoryCanards.createLeurre();
        Canard mandarin = factoryCanards.createMandarin();
        Canard mandarinDoubleCriard = factoryCanards.createMandarindoubleCriard();

        ArrayList<Canard> listCanards = new ArrayList<>();
        listCanards.add(canardEnPlastique);
        listCanards.add(colvert);
        listCanards.add(leurre);
        listCanards.add(mandarin);
        listCanards.add(mandarinDoubleCriard);

        pan(listCanards);
    }
    private static void pan(ArrayList<Canard> listCanards) {
            listCanards.forEach(canard -> {
                canard.afficher();
                canard.effectuerCancan();
                canard.effectuerVol();});
        }
    }

