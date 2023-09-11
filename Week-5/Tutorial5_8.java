 import java.util.HashMap;

public class Tutorial5_8{
    public static void main(String[] args){
        String input = "Hello World";
        HashMap<Character, Integer> characterCount = countCharacters(input);

        System.out.println("Character counts: ");
        for (char c : characterCount.keySet()) {
            int count = characterCount.get(c);
            System.out.println("'" + c + "' " + count);
        }
    }

    public static HashMap<Character, Integer> countCharacters(String text){
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char c : text.toCharArray()){
            if (Character.isWhitespace(c)){
                continue;
            }

            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }
        return characterCount;
    }
}