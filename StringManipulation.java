import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a) Enter a string: ");
        String input = scanner.nextLine();
        String str1 = new String(input);
        System.out.println("   String created using 'new': " + str1);


        int length = str1.length();
        System.out.println("b) Length of the string: " + length);


        System.out.print("c) Enter another string to concatenate: ");
        String str2 = scanner.nextLine();
        String concatenated = str1.concat(str2);
        System.out.println("   After concatenation: " + concatenated);


        System.out.print("d) Enter an index to extract character (0 to " + (str1.length() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < str1.length()) {
            char ch = str1.charAt(index);
            System.out.println("   Character at index " + index + ": " + ch);
        } else {
            System.out.println("   Invalid index.");
        }

        System.out.print("e) Enter a string to compare with '" + str1 + "': ");
        String str3 = scanner.nextLine();
        boolean isEqual = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("   Equals: " + isEqual);
        System.out.println("   Equals (Ignore Case): " + isEqualIgnoreCase);


        System.out.print("f) Enter a substring to search in concatenated string: ");
        String substring = scanner.nextLine();
        boolean contains = concatenated.contains(substring);
        int subIndex = concatenated.indexOf(substring);
        System.out.println("   Contains '" + substring + "': " + contains);
        System.out.println("   Index of '" + substring + "': " + subIndex);

        String replaced = concatenated.replace(substring, "Java");
        String upper = concatenated.toUpperCase();
        String lower = concatenated.toLowerCase();
        System.out.println("g) After replacing '" + substring + "' with 'Java': " + replaced);
        System.out.println("   Uppercase: " + upper);
        System.out.println("   Lowercase: " + lower);


        System.out.print("h) Enter a number to convert to string: ");
        int num = scanner.nextInt();
        String numStr = String.valueOf(num);
        System.out.println("   Converted number to string: " + numStr);

        scanner.close();
    }
}
