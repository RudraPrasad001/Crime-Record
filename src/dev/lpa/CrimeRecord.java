package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class CrimeRecord
{
    List<Criminal> criminalList = new ArrayList<>();

    public void showCriminal()
    {
        for( var c :  criminalList)
        {
            if(c.getYears()<=0)
            {
                System.out.printf("%s should be out of the prison %.2f years ago",c.getName(),c.getYears()*-1);
                return;
            }
            if(c instanceof DoubleCriminal)
            {
                System.out.printf("%s should be in prison for %.2f years due to the crimes (%s , %s) \n",c.getName(),c.getYears(),c.getCrimeType(), c.getSecondCrime());
            }
            else {
            System.out.printf("%s should be in prison for %.2f years due to the crime (%s) \n",c.getName(),c.getYears(),c.getCrimeType());}
        }
    }

    public void addCriminal(Criminal criminal)
    {
        for(Criminal c : criminalList)
        {
            if(c.getName().equalsIgnoreCase(criminal.getName()) && c.getCrimeType().equals(criminal.getCrimeType()) )
            {
                System.out.println("The criminal "+ criminal.getName()+" is already listed in the files");
                return;
            }
            else  if(c.getName().equalsIgnoreCase(criminal.getName()))
            {
                System.out.println("The criminal "+ criminal.getName()+" has already committed "+
                        c.getCrimeType()+"\n now they committed "+criminal.getCrimeType());
                CrimeType first = c.getCrimeType();
                criminalList.remove(c);
                criminalList.add(new DoubleCriminal(criminal.getName(),first,criminal.getCrimeType()));
                return;
            }
        }
            criminalList.add(criminal);
            System.out.println("The criminal "+criminal.getName()+" has been successfully added for the crime "+criminal.getCrimeType());
    }
    public void removeCriminal(String name)
    {
        for(Criminal c : criminalList)
        {
            if(c.getName().equalsIgnoreCase(name))
            {
                if(c.getYears()<=0)
                {
                    criminalList.remove(c);
                    System.out.printf("The criminal %s has been successfully removed from the records\n",c.getName());
                    return;
                }
                System.out.printf("The criminal %s has not been removed from the records because his sentence of %f years has not been completed yet\n",c.getName(),c.getYears());return;
            }
        }
        System.out.printf("The criminal %s has not been removed from the records because he is not a criminal\n",name);
    }
    public void timeSkip(int years)
    {
        for(Criminal c : criminalList)
        {
            c.setYears(c.getYears()-years);
        }
    }
}
