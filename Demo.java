

import java.lang.String;
public class Demo{
    public static void main(String[] args){
        int lastNamelength;String first = "Tsegab";
        Character letter; String lastName = "Gebregziabher";
        String last = new String(lastName);
        Character ch1 = last.charAt(0);
        last = last.concat("Tsegab");
        boolean a = last.equals("Gebregziabher");
        boolean d = last.equals("gebregziabher");
        int indexof = last.indexOf("br");
        int lastIndexof = last.lastIndexOf("r");
        int length = last.length();
        String toLowerCase = last.toLowerCase();
        String toUpperCase = last.toUpperCase();
        String replace = last.replace("Gebregziabher", "Tsegab");
        String substring = last.substring(4);
        String substring_1 = last.substring (4,10);
        String trim = last = " Gebregziabher " ;
        first = last.trim();
        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("first equal to last:" + first.equals(last));
        System.out.println("first equals last :" + first.equalsIgnoreCase(last));
        System.out.println(last);
        System.out.println("Index of A in lastr :" + last.indexOf('A'));
        System.out.println("lastIndex of A in last :" + last.lastIndexOf('A'));
        System.out.println("length of last :" + last.length());
        System.out.println(last.toLowerCase());
        System.out.println(last.toUpperCase());
        System.out.println("String after replacing all 'Gebregziabher' with 'Tsegab' :");
        System.out.println(last.replace("Gebregziabher", "Tsegab"));
        System.out.println("Substring starting from index 4 : ");
        System.out.println(last.substring(4));
        System.out.println("Substring starting from index 4 and ending at 10 : ");
        System.out.println(last.substring(4,10));
        System.out.println(" String before trim :" + last);
        System.out.print("String after trim: "+ last.trim());
    }
}

