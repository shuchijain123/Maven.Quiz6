package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {

        String str = "";
        return str = String.valueOf(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {


        String str = "";

        for (Character c : chars)
            str += c.toString();

        return str;

    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {


        string = string.replaceAll("[AEIOUaeiou]", "");
        return string;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
  String newString ="";
        String[] words = charactersToRemove.split("");



        for (int i = 0; i < words.length; i++) {

       newString  = string.replaceAll(words[i],"");
       string=newString;

        }
        return string;
    }
}

