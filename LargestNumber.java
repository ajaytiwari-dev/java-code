package Java;
import java.util.List;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        
        // Adding 20 numbers to the list
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        
        int largest = Integer.MIN_VALUE; // Initializing largest as the smallest possible integer value
        
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("The largest number in the list is: " + largest);
    }
}
