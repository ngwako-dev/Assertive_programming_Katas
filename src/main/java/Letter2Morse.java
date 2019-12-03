import java.util.Scanner;

public class Letter2Morse {

    public static void letter2Morse(){

        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', '0', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z',' '};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","/"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your inputs");
        String userInput=keyboard.nextLine().toLowerCase();

        char[] chars = userInput.toCharArray();

        StringBuilder str = new StringBuilder(" ");

        for(int i=0;i<chars.length;i++){
            for(int index=0;index < letter.length;index++){

                if(letter[index]==chars[i]){

                    str.append(morse[index]).append(" ");
                }
            }
        }
        System.out.println(str);
    }



}
