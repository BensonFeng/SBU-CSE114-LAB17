//111311006
import java.util.ArrayList;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(input.nextInt());
        System.out.println("Remove duplicates");
        System.out.println("Return unique number");
        removeDuplicate(list);
        System.out.println(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(temp);
    }
}