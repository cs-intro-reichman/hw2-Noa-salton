public  class  TestRandom {
	public static void main(String[]  args) {
		int loopLen = Integer.parseInt(args[0]);
	    int counterAbove = 0;
		int counterBelow = 0;
		for (int i=0; i<= loopLen; i++){
			double rand = Math.random();
			if (rand >= 0.5){
				counterAbove ++;
			} else{
				counterBelow ++;
			}
		}
		System.out.println("> 0.5: " + counterBelow);
		System.out.println("<= 0.5: " + counterAbove);
		System.out.println("Ratio: " + (double)counterBelow/counterAbove);
	}
}
