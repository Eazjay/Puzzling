import java.util.ArrayList;
import java.util.Collections;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzling = new PuzzleJava();

        int[] x = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> greaterThan = puzzling.puzzlingArray(x);
        System.out.println(greaterThan);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        ArrayList<String> output = puzzling.puzzlingString(names);
        System.out.println(output);

        String arr = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        ArrayList<Character> arrList = new ArrayList<Character>();
        for(int i = 0; i < arr.length(); i++){
        arrList.add(arr.charAt(i));
        }
        puzzling.puzzlingLetters(arrList);

        puzzling.generateRandom();

        puzzling.sortedRandom();

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randStr = puzzling.randString(str, 5);
        System.out.println(randStr.toLowerCase());

        System.out.println(puzzling.randStringsArray());
    }
}