import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInAString {

    static void duplicateCharCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for(char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicate characters in a string "+inputString);
        for(char ch : charInString)
        {
            if(charCountMap.get(ch)>2)
            {
                System.out.println("Character "+ch+" is reapeted :"+charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args)
    {
        duplicateCharCount("javajava");
    }

}

