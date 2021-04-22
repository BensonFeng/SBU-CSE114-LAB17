import java.util.ArrayList;
import java.util.Scanner;
public class space {
    public static void main(String[] args) {

        System.out.print("Enter string: ");
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> list;
        String x= input.nextLine();
        System.out.println("putting space on a word");
        list = toCharacterArray(x);
        System.out.println(list);

    }

    public static ArrayList<Character> toCharacterArray(String s) 
    {
       ArrayList<Character> list = new ArrayList<>();       
       for (int i = 0; i<s.length(); i++) {
    	   list.add(s.charAt(i));
       }
       
       return list;


    }

}