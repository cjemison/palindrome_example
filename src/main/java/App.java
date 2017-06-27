/**
 * Created by cjemison on 6/27/17.
 */
public class App {

  public static void main(String[] args) {
    final App app = new App();
    System.out.println("Palindrome: " + app.validPalindrone("madam"));
  }

  public boolean validPalindrone(final String value) {
    final String chars = noSpaces(value);
    int bucket = chars.length() - 1;

    for (int i = 0; i < chars.length(); i++) {
      if (chars.charAt(i) != chars.charAt(bucket)) {
        return false;
      }
      bucket--;
    }
    return true;
  }

  private String noSpaces(final String value) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < value.length(); i++) {
      if (Character.isLetter(value.charAt(i))) {
        stringBuilder.append(value.charAt(i));
      }
    }
    return stringBuilder.toString();
  }
}
