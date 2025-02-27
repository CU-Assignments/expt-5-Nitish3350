import java.util.*;

public class AutoboxingUnboxingSum {
    
    public static List<Integer> parseStringToIntegerList(String[] numbers) {
        List<Integer> intList = new ArrayList<>();
        for (String num : numbers) {
            intList.add(Integer.parseInt(num));
        }
        return intList;
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] numberStrings = input.split(" ");
        List<Integer> numbers = parseStringToIntegerList(numberStrings);
        
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
