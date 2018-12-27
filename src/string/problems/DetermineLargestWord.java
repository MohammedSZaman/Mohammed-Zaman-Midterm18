package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
       // System.out.println(wordNLength.keySet().iterator().next()+""+wordNLength.entrySet().stream().findFirst().get().getValue());
       int max=0;
       String maxWord="";
       for(Map.Entry<Integer, String>wordLength: wordNLength.entrySet()){
           if(max<wordLength.getKey()){
               max  =wordLength.getKey();
               maxWord=wordLength.getValue();
           }
       }
        System.out.println(maxWord);
        System.out.println(max);

    }

    public static Map<Integer, String> findTheLargestWord(String givenSentence){
        Map<Integer, String> map = new HashMap<>();
        String st = "";
        String [] splittedword = givenSentence.split(" ");
        for(int i = 0; +i < splittedword.length; i++)
        {
//            if (splittedword[i].length()>st.length()){
//            st = splittedword[i];
       // }
        map.put(splittedword[i].length(), splittedword[i]);
}       return map;
    }
}
