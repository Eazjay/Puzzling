import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public ArrayList<Integer> puzzlingArray(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                myArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        return myArray;
    }

    public ArrayList<String> puzzlingString(ArrayList<String> arr) {
        ArrayList<String> myString = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            if (arr.get(i).length() > 5) {
                myString.add(arr.get(i));
            }
        }
        return myString;
    }

    public void puzzlingLetters(ArrayList<Character> arr) {
        Collections.shuffle(arr);
        System.out.println("Last letter in the array: " + arr.get(arr.size()-1));
        System.out.println("First letter in the array: " + arr.get(0));
        String vowel = "i a e o u";
        if (vowel.indexOf(arr.get(0)) != -1) {
            System.out.println("The first letter is a vowel.");
        }
    }

    public void generateRandom() {
        ArrayList<Integer> randNum = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            randNum.add(r.nextInt(46) + 55);
        }
        System.out.println(randNum);
    }

    public void sortedRandom() {
        ArrayList<Integer> randNum = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            randNum.add(r.nextInt(46) + 55);
        }
        Collections.sort(randNum);
        int[] arr = new int[10];
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 0; i < 10; i++) {
            arr[i] = randNum.get(i);
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (i == 0) {
                minVal = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min Value is " + minVal);
        System.out.println("Max Value is " + maxVal);
    }

    public String randString(String stringChar, int length) {
        // int leftLimit = 97;
        // int rightLimit = 122;
        // int stringLength = 5;
        // Random random = new Random();
        // StringBuilder randNum = new StringBuilder(stringLength);
        // for (int i = 0; i < stringLength; i++) {
        // int randomInt = leftLimit + (int) (random.nextFloat() * (rightLimit -
        // leftLimit + 1));
        // randNum.append((char) randomInt);
        // }
        // String generatedString = randNum.toString();
        // System.out.println(generatedString);
        
        // PLEASE IGNORE THE CODE ABOVE. IT WORKS BUT TOO MUCH, SO I PREFER THE ONE BELOW. THANKS.

        StringBuilder stringObj = new StringBuilder();
        Random randString = new Random();
        for (int i = 0; i < length; i++) {
            stringObj.append(stringChar.charAt(randString.nextInt(stringChar.length())));
        }
        return stringObj.toString();
    }

    public ArrayList<String> randStringsArray() {
        ArrayList<String> stringsArr = new ArrayList<String>();
        Random rand = new Random();
        String alphaB = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 10; i++) {
            String temp = "";
            for (int j = 0; j < 5; j++) {
                temp += alphaB.charAt(rand.nextInt(26));
            }
            stringsArr.add(temp);
        }
        return stringsArr;
    }
}