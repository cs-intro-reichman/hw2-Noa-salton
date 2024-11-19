// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
        String mode = args[1];
        for (int i = 1; i <= n; i++) {
            if (mode.equals("v")) {
                int seed = i;
                int steps = 0;
				String sequence = "";
				if(i==1){
					seed = 4;
					steps = 1;
					sequence = "1 ";
				}	
                while (seed != 1) {
					String strTOprint = sequence + seed + " ";
                    if (seed % 2 == 0) {
                        seed /= 2;
                    } else {
                        seed = 3 * seed + 1;  
                    }
                    steps++;
					sequence = strTOprint;
                }
                System.out.println(sequence + "1" + " (" + (steps + 1) + ")");
            }
        }
        if (mode.equals("c")) {
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        }
}
}
