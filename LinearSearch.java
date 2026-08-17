import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter "+n+"numbers: ");
        for (int i=0;i<n;i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target=sc.nextInt();
        int position=-1;
        for (int i=0;i<n;i++) {
            if (numbers[i]==target){
                position=i;
            break;
        }
    }
    if (position !=-1) {
        System.out.println("Element found at index "+position);
    }
    sc.close();
    }
}