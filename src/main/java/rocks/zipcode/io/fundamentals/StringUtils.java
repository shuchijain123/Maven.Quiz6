package rocks.zipcode.io.fundamentals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string

        Integer[] arr = new Integer[string.length()];


      int len=   string.length();
        String eleman = "";
        int arrayindex = 0;

        // get range of length




          for (int i = 0; i <(int) Math.pow(2,string.length()) ; i++) {



              for (int k = string.length() -1; k >= 0; k--) {

                  String index = ((i >> k) & 1) == 1 ? "1" : "0";

                  if(index == "1"){
                      eleman += string.charAt(arrayindex);




                  }
                  arrayindex++;
              }


          }


          // get power-set of range




        // for every set in power-set

      char [] crr=  upperCaseIndices(eleman,arr).toCharArray();



            // uppercase indices of string using set
        return null;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
   String newString="";

        for (int i = 0; i < indices.length; i++) {


            newString=  string.replace(string.charAt(indices[i]), Character.toUpperCase(string.charAt(indices[i])));
             string= newString;

        }
        return newString;

    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {

        StringBuffer str = new StringBuffer(stringToBeManipulated);
      str.insert(index,valueToBeInserted);

        return str.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuffer str = new StringBuffer(stringToBeManipulated);
       str.setCharAt(index,replacementValue);

        return str.toString();
    }
}