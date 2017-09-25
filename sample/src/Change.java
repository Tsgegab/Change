
import javax.swing.JOptionPane;
public class Change{
    public static void main(String[] args){
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNEY = 1;
        String input = JOptionPane.showInputDialog(" Enter amount in 1,5,10 dollar bills");
        int amount = Integer.parseInt(input)*100;
        JOptionPane.showInputDialog(null," The change in Quarter is : " + amount/QUARTER);
    }
}
