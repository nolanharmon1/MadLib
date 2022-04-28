import java.util.Scanner;

public class MadLib{
    public static void main(String[] args){
        //Getting the code ready to listen for keyboard input.
        Scanner keyboardInput = new Scanner(System.in);
        String finalTemplate = "";
        
        /**
         * I want to change "I" in the sentence below.
         * I can use substring to get a new string and replace word by word.
         *  */  
        String sentence0 = "And so with my spirits high I boldly ventured off where no meerkat had dared to go before. I put my past behind me Ha! and never looked back. As I began my journey, I practiced lots of new dance moves in preparation for my arrival. I eventually became very tired from my practice and decided to lay under a large palm tree.";

        /**
         * Sentence after I:
         * Make sure you include the whitespace in the substring
         *  */ 
        String sentenceString = sentence0.substring(0, 23);
        String sentenceString1 = sentence0.substring(27, 30);
        //print statement to ask user for specific input
        System.out.print("Please enter a frequency ");
        String myInput = keyboardInput.nextLine();

        String sentenceString2 = sentence0.substring(0, 31);
        String sentenceString3 = sentence0.substring(36, 59);
        System.out.println("Please enter an adjective ");
        String myInput1 = keyboardInput.nextLine();

        String sentenceString4 = sentence0.substring(0, 43);
        String sentenceString5 = sentence0.substring(66, 80);
        System.out.println("Please enter an animal type ");
        String myInput2 = keyboardInput.nextLine();

        String sentenceString6 = sentence0.substring(0, 80);
        String sentenceString7 = sentence0.substring(82, 100);
        System.out.println("Please enter a verb ");
        String myInput3 = keyboardInput.nextLine();

        String sentenceString8 = sentence0.substring(0, 100);
        String sentenceString9 = sentence0.substring(104, 129);
        System.out.println("Please enter a body part ");
        String myInput4 = keyboardInput.nextLine();

        String sentenceString10 = sentence0.substring(0, 129);
        String sentenceString11 = sentence0.substring(135, 167);
        System.out.println("Please enter a verb ");
        String myInput5 = keyboardInput.nextLine();

        String sentenceString12 = sentence0.substring(0, 167);
        String sentenceString13 = sentence0.substring(176, 185);
        System.out.println("Please enter a verb ");
        String myInput6 = keyboardInput.nextLine();

        String sentenceString14 = sentence0.substring(0, 185);
        String sentenceString15 = sentence0.substring(188, 195);
        System.out.println("Please enter an adjective ");
        String myInput7 = keyboardInput.nextLine();

        String sentenceString16 = sentence0.substring(0, 195);
        String sentenceString17 = sentence0.substring(200, 223);
        System.out.println("Please enter a plural noun ");
        String myInput8 = keyboardInput.nextLine();

        String sentenceString18 = sentence0.substring(0, 223);
        String sentenceString19 = sentence0.substring(230, 245);
        System.out.println("Please enter a noun ");
        String myInput9 = keyboardInput.nextLine();

        String sentenceString20 = sentence0.substring(0, 245);
        String sentenceString21 = sentence0.substring(251, 257);
        System.out.println("Please enter a verb ");
        String myInput10 = keyboardInput.nextLine();

        String sentenceString22 = sentence0.substring(0, 245);
        String sentenceString23 = sentence0.substring(262, 271);
        System.out.println("Please enter a feeling ");
        String myInput11 = keyboardInput.nextLine();

        String sentenceString24 = sentence0.substring(0, 271);
        String sentenceString25 = sentence0.substring(279, 295);
        System.out.println("Please enter a noun ");
        String myInput12 = keyboardInput.nextLine();

        String sentenceString26 = sentence0.substring(0, 295);
        String sentenceString27 = sentence0.substring(298, 307);
        System.out.println("Please enter a verb ");
        String myInput13 = keyboardInput.nextLine();

        String sentenceString28 = sentence0.substring(0, 307);
        String sentenceString29 = sentence0.substring(312, 313);
        System.out.println("Please enter an adjective ");
        String myInput14 = keyboardInput.nextLine();

        String sentenceString30 = sentence0.substring(0, 313);
        String sentenceString31 = sentence0.substring(317, 323);
        System.out.println("Please enter a noun ");
        String myInput15 = keyboardInput.nextLine();

        //Asking/Storing keyboard input
        //String myInput = keyboardInput.nextLine();
       
        String firstReplacement;
        /**
         * Concatenating my keyboard input and the rest of my sentence +
         * Concatenating it all into my finalTemplate Variable that I will output
         * at the end to show my altered quote
         */


        finalTemplate += sentenceString + myInput + sentenceString1 + myInput1 + sentenceString3 + myInput2 + sentenceString5 + myInput3 + sentenceString7 + myInput4 + sentenceString9 + myInput5 + sentenceString11 + myInput6 + sentenceString13 + myInput7 + sentenceString15 + myInput8 + sentenceString17 + myInput9 + sentenceString19 + myInput10 + sentenceString21 + myInput11 + sentenceString23 + myInput12 + sentenceString25 + myInput13 + sentenceString27 + myInput14 + sentenceString29 + myInput15 + sentenceString31
        ;

        //Outputting my altered quote
        System.out.print(finalTemplate);
        keyboardInput.close();
    }

}