/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.grisdip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author Griss
 */
public class TestA {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getConsecutiveNumbers(8,"ANNA BAKES 80 CAKES 647 IN THE NOON, 989216011 CI,VIC level");
    }
    
    public static void getConsecutiveNumbers(int nVal, String strVal){
       
        List<String> numValues = new ArrayList<String>(); 
        List<String> strValues = new ArrayList<String>(); 
        for (String value : strVal.split(" ")) {
            if(NumberUtils.isDigits(value)){
                numValues.add(value);
            } else {
                strValues.add(value.replace(",", ""));
            }   
        }
        
        Set<String> numbers = getGreatestNumber(nVal,numValues);
        printResult(numbers);
        Set<String> palindromeWord = palindromes(strValues);
        printResult(palindromeWord);
        
     }
    
    private static Set<String> getGreatestNumber(int val, List<String> sValues) {
        
        Set<String> consecutives = new HashSet<String>();
        String max = "";
         for (String num : sValues) {
            int numeric = 0;
            String nchar = "";
            for(int i=0; i< num.length();i++) {
                nchar = nchar + String.valueOf(num.charAt(i));
                numeric = Integer.valueOf(nchar);
                if(numeric % val == 0 ) {
                  max = nchar;
                }
            }
            consecutives.add(max);
        }
        return consecutives;
    }
    
    private static Set<String> palindromes(List<String> strValues) {
        String stringPal = "";
        Set<String> palindromeWords = new HashSet<String>();
        for (String strValue : strValues) {
            stringPal = strValue;
                if (stringPal.equals(new StringBuilder(stringPal).reverse().toString())) {
                        palindromeWords.add(stringPal);
                }
        }
        
        return palindromeWords;
    }
    private static void printResult(Set<String> strPrints){
        for (String str : strPrints) {
            System.out.println(str.toUpperCase());
        }
    }
    
}
