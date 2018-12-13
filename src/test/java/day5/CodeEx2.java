package day5;

import org.testng.annotations.Test;

import java.util.SortedSet;
import java.util.TreeSet;

public class CodeEx2 {

    //input string "welcometojava" // if param is 3 then it's "wel", "elc", "lco"
    //parameter - length of substring
    //print out first and last substring from ordered list



    @Test
    public void test001() {
        //receive the input value
        //split the input string using parameter
        //store substrings in ordered list/set
        //print out fist and last members of list

        SortedSet<String> set = new TreeSet<String>();

        String input = "welcometojava";
        int subStringLength = 3;


        for(int i = 0; i <= input.length() - subStringLength; i++){
            int beginIndex = i;
            int endIndex = i + subStringLength;

            String subString = input.substring(beginIndex, endIndex);
            set.add(subString);
        }

        System.out.println(set.first());
        System.out.println(set.last());
    }
}
