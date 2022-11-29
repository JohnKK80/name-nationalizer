package model;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class IDutchNationalizer implements INameNationalizer{

    private final List<String> prefixes;
    private final String firstName;

    {
        String[] nameArr = new String[]{"Van ", "Von ","De "};
        prefixes = Arrays.asList(nameArr);
    }

    protected IDutchNationalizer(String firstName){
        this.firstName = firstName;
    }

    @Override
    public String nationalizeName(String name) {
        if(name == null){
            System.out.println("Dutch names cannot be null");
        }
        return this.firstName + " " + prefixes.get(ThreadLocalRandom.current().nextInt(prefixes.size())) + name;
    }
}
