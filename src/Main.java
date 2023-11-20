// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static int[] userInput(int n, Scanner s){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void sortArr(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n > 0) {
            int[] arr = userInput(n,s);
            System.out.println("Ans: ");
            sortArr(arr);
            for(int x : arr){
                System.out.println(x);
            }
        }else{
            System.out.println("n must be greater than 0");
        }
    }
}