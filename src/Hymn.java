//Christopher Florance and Julian Matthews
//APCS
//2022-02-25
//Hymn Class

public class Hymn
{
    public int hymnNumber;
    public final double randomNum = Math.random();
    public final int lowerMin = 57;
    public int lowerMax = 904;
    public int upperMin = 2001;
    public int upperMax = 2284;
    public double distrProb = 0.749557; //Probability of choosing lower range of hymns (847) vs upper range (283).
                                        // If randomNum is greater, than it selects higher range and vice versa


    public Hymn()
    {
        if (randomNum < distrProb){
            this.hymnNumber = (int) ((Math.random() * (lowerMax - lowerMin)) + lowerMin); //Random number in lower range (from StackOverflow)
        }
        else {
            this.hymnNumber = (int) ((Math.random() * (upperMax - upperMin)) + upperMin); //Random number in upper range (from StackOverflow)
        }

    }

}
