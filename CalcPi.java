// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms = Integer.parseInt(args[0]);
        double approxPi = 0.0;
        for (int i = 0; i < numOfTerms; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                approxPi += term;
            } else {
                approxPi -= term;
            }
        }
        approxPi *= 4;
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + approxPi);
	}
}
