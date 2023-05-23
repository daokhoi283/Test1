package test1;
import java.util.Scanner;
public class Test1 {
    public static void PrintEven1(){
        for(int i = 2; i <= 10; i++){
            if(i % 2 == 0){
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");
    }
    public static void PrintEven2(){
        int i = 2;
        while(i <= 10){
            if(i % 2 == 0){
                System.out.print(" " + i);
            }
            i++;
        }
        System.out.print("\n");
    }
    public static void EnterArray(int [] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }
    public static void SortArray(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                if(a[j] < a[i]){
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        PrintArray(a);
    }
    public static void PrintArray(int[] a){
        System.out.print("Array after sorted: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.print("\n");
    }
    public static void FindMax(int[] a){
        int max = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max value in array: " + max);
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {            
        System.out.println("1. Use for loop displays the even numbers from 2 to 10");
        System.out.println("2. Use for loop displays the even numbers from 2 to 10");
        System.out.println("3. Enter array");
        System.out.print("Please enter choice: ");
        choice = sc.nextInt();
        switch(choice){
            case 1: 
                PrintEven1();
                break;
            case 2:
                PrintEven2();
                break;
            case 3:
                int n;
                System.out.print("Enter numbers of elements: ");
                n = sc.nextInt();
                int[] a = new int[n];
                EnterArray(a);
                SortArray(a);
                FindMax(a);
                break;
        }
        } while (choice < 4 && choice > 0);
    }    
}
