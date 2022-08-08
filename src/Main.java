import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> chinh = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so size: ");

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int code = (int) Math.floor((Math.random()*10 )+1);
            arr[i] = code;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            chinh.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = chinh.pop();
        }
        System.out.println(Arrays.toString(arr));

    }
}
