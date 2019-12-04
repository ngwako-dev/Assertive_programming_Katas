import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Press 1 to convert Letters to Morse");
        System.out.println("Press 2 to convert Morse to Letters");
        int choice = scan.nextByte();
        invoker(choice);
    }
    private static void invoker(int choice){
        switch (choice){
                  case 1:


                  letters2Morse();
//
                  break;
            case 2:

                morse2letters();

                break;
            default:
                System.out.println("Please enter a valid entry");
                break;
        }





    }
    private static void letters2Morse(){

        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', '0', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z',' '};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","/"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your inputs");
        String userInput=keyboard.nextLine().toLowerCase();
        assert userInput.length() == userInput.split(" ").length: "pass";

        char[] chars = userInput.toCharArray();

        StringBuilder str = new StringBuilder(" ");

        for (char aChar : chars) {
            for (int index = 0; index < letter.length; index++) {

                if (letter[index] == aChar) {

                    str.append(morse[index]).append(" ");
                }
            }
        }
        System.out.println(str);



    }
    private static void  morse2letters(){
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your inputs");
        String userInput= keyboard.nextLine();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> morse2letters = new ArrayList<>();
        String[] input = userInput.split(" ");
        //char[] uInput = userInput.toCharArray();

//        assert.split(" ").length == userInput.length(): "pass";


        for(char i = 65; i < 91; i++){
            letters.add(i);
            if(i == 90){
                char b = 32;
                letters.add(b);
            }
        }
        for(String a : input){
            for(int c = 0; c<morse.length; c++) {
                if(morse[c].equals(a)){
                    morse2letters.add(letters.get(c));
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character i : morse2letters) {
            str.append(i);
        }
        System.out.println(str.toString());
    }

}



