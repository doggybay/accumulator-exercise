import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String[] arr2 = {"hello", "johnny", "its", "your", "birthday"};
        String letters = "abcde";
        ArrayList<Character> ltrList1 = new ArrayList<>();
        ltrList1.add('a');
        ltrList1.add('c');
        ltrList1.add('e');

        ArrayList<Character> ltrList2 = new ArrayList<>();
        ltrList2.add('b');
        ltrList2.add('d');
        ltrList2.add('f');

        String[][] arr3 = {{"2014", "Horse"}, {"2015", "Sheep"}};

        ArrayList<Integer> result1 = doubleNum(arr);
        System.out.println("doubleNumbers: " + result1);

        ArrayList<Integer> result2 = multiplyNumbers(arr, 5);
        System.out.println("multiplyNumbers: " + result2);

        String result3 = doubleLetters(letters);
        System.out.println("doubleLetters: " + result3);

        ArrayList<Character> result4 = interleave(ltrList1, ltrList2);
        System.out.println("interLeave: " + result4);

        ArrayList<String> result5 = createRange(5, "hello");
        System.out.println("createRange: " + result5);

        HashMap<String, Integer> result6 = flipArray(arr2);
        System.out.println("flipArray: " + result6);

        HashMap<Integer, String> result7 = arraysToObject(arr3);
        System.out.println("arraysToObject: " + result7);

        String result8 = reverseString(letters);
        System.out.println("reverseString: " + result8);
    }

    public static ArrayList<Integer> doubleNum(int[] numArr){
        ArrayList<Integer> acc = new ArrayList<>();
        for(int i = 0; i < numArr.length; i++){
            acc.add(numArr[i] * 2);
        }
        return acc;
    }

    public static ArrayList<Integer> multiplyNumbers(int[] numArr, int multpl){
        ArrayList<Integer> acc = new ArrayList<>();
        for(int i = 0; i < numArr.length; i++){
            acc.add(numArr[i] * multpl);
        }
        return acc;
    }

    public static String doubleLetters(String str){
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static ArrayList<Character> interleave(ArrayList<Character> list1, ArrayList<Character> list2){
        ArrayList<Character> newList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++){
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        return newList;

    }

    public static ArrayList<String> createRange(int num, String str){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            newList.add(str);
        }

        return newList;
    }

    public static HashMap<String, Integer> flipArray(String[] arr){
        HashMap<String, Integer> obj = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            obj.put(arr[i], i);
        }

        return obj;
    }

    public static HashMap<Integer, String> arraysToObject(String[][] arr){
        HashMap<Integer, String> obj = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            obj.put(Integer.parseInt(arr[i][0]), arr[i][1]);
        }

        return obj;
    }

    public static String reverseString(String str){
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        return newStr;
    }
}
