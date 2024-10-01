package dev.lpa;

public class Main {
    public static void main(String[] args) {
        CrimeRecord crimeRecord = new CrimeRecord();

        //crimeRecord.addCriminal(new Criminal("james",CrimeType.SUICIDE));
        crimeRecord.addCriminal(new Criminal("game",CrimeType.BLACKMAIL));
        crimeRecord.addCriminal(new Criminal("game",CrimeType.MURDER));
        crimeRecord.addCriminal(new Criminal("done",CrimeType.BLACKMAIL));
        crimeRecord.addCriminal(new Criminal("Dingus",CrimeType.OTHER));
        crimeRecord.addCriminal(new Criminal("done",CrimeType.BLACKMAIL));
        crimeRecord.addCriminal(new Criminal("done",CrimeType.DRINKANDDRIVE));
        System.out.println("-------------------");
        crimeRecord.showCriminal();
        System.out.println("-------------------");
        crimeRecord.showCriminal();
        crimeRecord.timeSkip(9);
        crimeRecord.removeCriminal("james");
        crimeRecord.removeCriminal("dingus");
        crimeRecord.timeSkip(1000);
        crimeRecord.removeCriminal("game");
        System.out.println("-------------------");
        crimeRecord.showCriminal();
    }
}
