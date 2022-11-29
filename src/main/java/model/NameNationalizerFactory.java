package model;

import java.util.concurrent.ThreadLocalRandom;

public class NameNationalizerFactory {

    private final String[] firstNames;
    private final String firstName;

    {
        firstNames = new String[]{"John", "Liam", "Michelle", "Johanne", "Ruud", "Marco"};
        firstName = firstNames[ThreadLocalRandom.current().nextInt(firstNames.length)];
    }

    public INameNationalizer getNameNationaizer(Nation nation){
        INameNationalizer iNameNationalizer;
        switch (nation){
            case HOLLAND: iNameNationalizer = new IDutchNationalizer(firstName);
            break;
            case IRELAND: iNameNationalizer = new IrishNameNationalizer(firstName);
            break;
            default:iNameNationalizer = new IrishNameNationalizer("Paddy");
        }
        return iNameNationalizer;
    }

}
