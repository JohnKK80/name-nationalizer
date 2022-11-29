package model;

import java.util.concurrent.ThreadLocalRandom;

class IrishNameNationalizer implements INameNationalizer{

    private final String[] prefixs;
    private final String firstName;

    {
        prefixs = new String[]{"O'", "Mac", "Mc", "Kil"};
    }

    protected IrishNameNationalizer(String fistName){
        this.firstName = fistName;
    }

    @Override
    public String nationalizeName(String name) {
        if(name == null){
            throw new NullPointerException("Irish name cannot be null");
        }
        int randNum = ThreadLocalRandom.current().nextInt(this.prefixs.length);
        return firstName + " " + prefixs[randNum] + name;
    }
}
