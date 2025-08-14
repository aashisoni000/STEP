//Task: Create a program that demonstrates common String methods for text analysis and manipulation.
public class pp1 {
public static void main(String[] args) {
    String text = " practice problem 1 of week 2 ";
    System.out.println("Original: '" + text + "'");
    System.out.println("Length: " + text.length());
    String[] words = text.trim().split(" ");
    System.out.println("Split into " + words.length + " words:");
    for (int i = 0; i < words.length; i++) {
        System.out.println(" " + (i+1) + ". " + words[i]);
}


