import java.util.*;
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		int addition = a + b + c;
		
		System.out.println("Addition : "+addition);
		
		int avg = addition / 3;
		
		System.out.println("Average : "+avg);
    }
}