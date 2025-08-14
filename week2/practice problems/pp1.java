//Task: Create a program that demonstrates common String methods for text analysis and manipulation.
public class pp1 {
public static void main(String[] args) {
    String text = " practice problem 1 of week 2 ";
    System.out.println("Original: '" + text + "'");
    System.out.println("Length: " + text.length());
    String trimmedString = text.trim();
    System.out.println("Trimmed String:"+trimmedString);
    System.out.println("New length:" + trimmedString.length());
}
}

