public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minsToAdd = Integer.parseInt(args[1]);
        int totalmin = hours*60 + minutes + minsToAdd;
        int totalHours = totalmin/60;
        int newHours = totalHours % 24;
        int newMin = totalmin - (totalHours*60);
        if (newHours < 10 && newMin < 10){System.out.println("0" + newHours + ":" + "0" + newMin);}
        else if (newHours < 10){System.out.println("0" + newHours + ":" + newMin);}
        else if (newMin < 10){System.out.println(newHours + ":" + "0" + newMin);}
        else{ System.out.println(newHours + ":" + newMin);}
    }
}
