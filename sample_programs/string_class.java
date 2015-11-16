class string_class{
  public static void main(String[] args) {
    String testString = "My name is Suryadeep Pal";

    //Prints the string itself
    System.out.println("Initialized String: " + testString);

    //Prints the length of the string
    System.out.println("Length : " + testString.length());

    //Concatinates two string
    testString = testString.concat(" And I'm an idiot.");
    System.out.println("String after concatination : " + testString);

    //Character at a particular index
    System.out.println("Character at index 3 : " + testString.charAt(3));

    String testString2 = "My name is Suryadeep Pal And I'm not an idiot.";
    System.out.println("String 2 : " + testString2);
    System.out.println("Comparing two strings : " + testString.compareTo(testString2));
    System.out.println("Comparing two strings : " + String.valueOf(testString.equals(testString2)));

  }
}
