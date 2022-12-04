import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int n1: arr1){
            s1.push(n1);
        }
        for (int n2: arr2){
            s2.push(n2);
        }

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        System.out.println(sameParityPattern(s1, s2));

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

    }
    public static boolean sameParityPattern(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        } else {
            Stack<Integer> s3 = new Stack<>();
            boolean same = true;
            while (same && !s1.isEmpty()) {
                int num1 = s1.pop();
                int num2 = s2.pop();
                if ((num1 % 2) != (num2 % 2)) {
                    same = false;
                }
                s3.push(num1);
                s3.push(num2);
            }
            while (!s3.isEmpty()) {

                s2.push(s3.pop());
                s1.push(s3.pop());
            }
            return same;
        }
    }
}