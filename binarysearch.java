import java.util.Scanner;

class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to search.");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sorted array in ascending order.");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to search.");
        int key = sc.nextInt();
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key)
                first = mid + 1;
            else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else
                last = mid - 1;
            mid = (first + last) / 2;
        }
        if (first > last)
            System.out.println("Element is not found!");
        sc.close();
    }
}
