// Julian Matthews & Christopher Florance
// APCS
// 2/25/2022
//Calculator Class
import java.util.Arrays;
public class Calculator {
    private long numOfTimesSimulationIsRan;
    private final double matchPercentage;
    public Calculator (int y) {
        switch (y) {
            case 1 -> this.numOfTimesSimulationIsRan = 1000000;
            case 2 -> this.numOfTimesSimulationIsRan = 5000000;
            case 3 -> this.numOfTimesSimulationIsRan = 10000000;
        }
        this.matchPercentage = simulateLiturgyMatch();
    }
     private double simulateLiturgyMatch () {
        double matchNum = 0;
        for (int i = 0; i < numOfTimesSimulationIsRan; i++) {
            Liturgy liturgy = new Liturgy();
            int [] liturgyArr = liturgy.liturgyArr;
            int [] randIntArr = new int [liturgyArr.length];
            for (int z = 0; z < randIntArr.length; z++) {
                randIntArr[z] = (int) Math.floor((Math.random() * 10));
            }
            Arrays.sort(liturgyArr);
            Arrays.sort(randIntArr);
            if (Arrays.equals(liturgyArr,randIntArr)) {
                System.out.println("Matching liturgy:      " + Arrays.toString(liturgyArr));
                System.out.println("Matching random array: " + Arrays.toString(randIntArr));
                matchNum++;
            }
        }
        double percentageMatch = (matchNum/numOfTimesSimulationIsRan) * 100;
        return percentageMatch;
    }
    public double getNum () {
        return matchPercentage;
    }

    public double produceAccuracy () {
        double sumOfTenPercentages = 0;
        double avgOfTenPercentages;
        double percentError;
        for (int j = 0; j < 10; j++) {
            double matchNum = 0;
            for (int i = 0; i < numOfTimesSimulationIsRan; i++) {
                Liturgy liturgy = new Liturgy();
                int [] liturgyArr = liturgy.liturgyArr;
                int [] randIntArr = new int [liturgyArr.length];
                for (int z = 0; z < randIntArr.length; z++) {
                    randIntArr[z] = (int) Math.floor((Math.random() * 10));
                }
                Arrays.sort(liturgyArr);
                Arrays.sort(randIntArr);
                if (Arrays.equals(liturgyArr,randIntArr)) {
                    matchNum++;
                }
            }
            double percentageMatch = (matchNum/numOfTimesSimulationIsRan) * 100;
            sumOfTenPercentages = sumOfTenPercentages + percentageMatch;
        }
        avgOfTenPercentages = sumOfTenPercentages/10;
        percentError = (((avgOfTenPercentages-matchPercentage)/avgOfTenPercentages) * 100);
        if (percentError < 0) {
            percentError = -1 * percentError;}
        return percentError;
    }
}
