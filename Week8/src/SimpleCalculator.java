import java.util.Scanner;

public class SimpleCalculator {
	Scanner scan = new Scanner(System.in);
	
	private int result;
	
	public void add(int a, int b) throws OutOfRangeException, AddZeroException{
		if(a + b >= 0 && a + b <= 1000) {
			result = a + b;
		}
		else {
			String msg = "out of range";
			throw new OutOfRangeException(msg);
		}
		if(a == 0 || b == 0) {
			String msg2 = "don't add zero";
			throw new AddZeroException(msg2);
		}
		else {
			result = a + b;
		}
	}
	
	public void subtract(int a, int b) throws OutOfRangeException, SubtractZeroException{
		if(a - b >= 0 && a - b <= 1000) {
			result = a - b;
		}
		else {
			String msg = "out of range";
			throw new OutOfRangeException(msg);
		}
		if(a == 0 || b == 0) {
			String msg2 = "don't subtract zero";
			throw new SubtractZeroException(msg2);
		}
		else {
			result = a - b;
		}
	}
	
	public void print() {
		System.out.println(result);
	}
	
	public void reset() {
		result = 0;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult() {
		result = scan.nextInt();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		String[] tokens = str.split(" ");

		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[2]);
		
		SimpleCalculator c = new SimpleCalculator();
		try {
			if(tokens[1].equals("+")){
				c.add(a, b);
			}
			else if(tokens[1].equals("-")){
				c.subtract(a, b);
			}
			System.out.println(c.result);
		}catch(OutOfRangeException e){
			e.printStackTrace();
		}catch(AddZeroException e2){
			e2.printStackTrace();
		}catch(SubtractZeroException e3){
			e3.printStackTrace();
		}
		
	}

}

class OutOfRangeException extends RuntimeException{
	private String message;
	
	public OutOfRangeException() {
		
	}
	
	public OutOfRangeException(String message) {
		super(message);
	}
}

class AddZeroException extends RuntimeException{
	private String message;
	
	public AddZeroException() {
		
	}
	
	public AddZeroException(String message) {
		super(message);
	}
}

class SubtractZeroException extends RuntimeException{
	private String message;
	
	public SubtractZeroException() {
		
	}
	
	public SubtractZeroException(String message) {
		super(message);
	}
}
