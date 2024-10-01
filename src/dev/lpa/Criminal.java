package dev.lpa;

public class Criminal {
    String name;
    CrimeType crimeType;
    double years;
    CrimeType secondCrime;

    public String getName() {
        return name;
    }

    public CrimeType getCrimeType() {
        return crimeType;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public CrimeType getSecondCrime() {
        return secondCrime;
    }

    public Criminal(String name, CrimeType crimeType, CrimeType secondCrime) {
        char first = name.toUpperCase().charAt(0);
        this.name = first +name.substring(1);
        this.crimeType = crimeType;
        this.secondCrime = secondCrime;
        years = switch(crimeType)
        {
            case DRINKANDDRIVE -> 20;
            case MURDER, SUICIDE -> 5;
            case BLACKMAIL -> 100;
            case OTHER -> 4;
        };

        years += switch(secondCrime)
        {
            case DRINKANDDRIVE -> 20;
            case MURDER, SUICIDE -> 5;
            case BLACKMAIL -> 100;
            case OTHER -> 4;
        };

    }


    public Criminal(String name, CrimeType crimeType) {
        char first = name.toUpperCase().charAt(0);
        this.name = first +name.substring(1);
        this.crimeType = crimeType;
        years = switch(crimeType)
        {
            case DRINKANDDRIVE -> 20;
            case MURDER, SUICIDE -> 5;
            case BLACKMAIL -> 100;
            case OTHER -> 4;
        };
    }
}
