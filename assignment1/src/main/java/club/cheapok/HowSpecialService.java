package club.cheapok;

import org.apache.commons.math3.distribution.NormalDistribution;

/*
Assume the distribution of the grades follows a Normal Distribution with mean: 9.76 and STD: 4.42
 make a function that takes as an input your grade and prints on the screen:
 the PROBABILITY you’re better than a random colleague.
*/

public class HowSpecialService {
    public static void main(String[] args) {
        System.out.println( howSpecialAmI( 20   ) * 100 +" %"  );
    }

    /*
     * what is a normal distribution: http://mathworld.wolfram.com/NormalDistribution.html
     * classes you want to use:
     * http://commons.apache.org/proper/commons-math/javadocs/api-3.5/org/apache/commons/math3/distribution/NormalDistribution.html
     * concepts you need to grasp: cummulative distribution
     */

    private static double howSpecialAmI(double yourGrade) {

        return  new NormalDistribution(9.77, 4.42).cumulativeProbability(yourGrade);
    }

}
