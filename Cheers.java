// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String nameToCheer = args[0];
            int timesToCheer = Integer.parseInt(args[1]);
            String anLetters = "AEFHILMNORSX";
            for (int i=0; i<nameToCheer.length(); i++){
                String pre = "a ";
                if(anLetters.indexOf(Character.toUpperCase(nameToCheer.charAt(i))) != -1){
                        pre = "an";
                }
                System.out.println("Give me " + pre + " " + Character.toUpperCase(nameToCheer.charAt(i)) + ": " + Character.toUpperCase(nameToCheer.charAt(i)) + "!");
        }
        System.out.println("What does that spell?");
        for (int j=0; j<timesToCheer; j++){System.out.println(nameToCheer.toUpperCase() + "!!!");}


        }
}
