package Throw;

//We use throw keyword to create user defined exception not for inbuild exceptions.
//Usually we create unchecked exceptions here. We have to use try catch to handle it.

class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg) {
		super(msg);
	}
}

//voting project
public class Throw1 {

	public static void main(String[] args) {
		int age = 15;

		try {
			if (age < 18) {
				throw new YoungerAgeException("You are under age for vote!..");
				// we cant write after throw statement. Compile error will come
			} else {
				System.out.println("Vote Successfull!..");
			}
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
