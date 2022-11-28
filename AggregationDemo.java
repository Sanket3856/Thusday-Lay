package oopsconcept;


interface LibraryUser{
	public void registerAccount();
	public void requestBook();
}

class KidUser implements LibraryUser{
	int age;
	String booktype;
	
	public int setage( int age) {
		this.age = age;
		return age;
	}
    public String setbooktype(String booktype) {
    	this.booktype = booktype;
    	return booktype;
    	
    }
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(this.age<12) {
			System.out.println("You registered Successfully registered under Kids account");
		}
		else {
			System.out.println("Sorry, age should be less than 12  to register as kid...!");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(this.booktype.equalsIgnoreCase("kids")) {
			System.out.println("Book issued successfully ... Please return book in 10 days :)");
		}
		else {
			System.out.println("OOps you are not allowed take Kids book only");
		}
		
	}
	
}

class AdultUser implements LibraryUser{
	int age;
	String booktype;
	
	public int setage(int age) {
		this.age=age;
		return age;
		
	}
    public String setbooktype(String booktype) {
    	this.booktype=booktype;
    	return booktype;
    }
	
	public void registerAccount() {
		
		if(this.age>12) {
			System.out.println("You registered Successfully registered under Adults account");
		}
		else {
			System.out.println("Sorry your age should be greater than 12 to register under the Adults account..!");
		}
		
	}
	public void requestBook() {
		if(this.booktype.equalsIgnoreCase("fiction")) {
			System.out.println("Book issued successfully ... Please return book in 10 days :)");
		}
		else {
			System.out.println("OOps you are allowed to take only adults books");
		}
		
	}
		
	}
	


public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUser kid = new KidUser();
		kid.setage(10);
		kid.registerAccount();
		kid.setbooktype("kids");
		kid.requestBook();
		kid.setage(23);
		kid.registerAccount();
		kid.setbooktype("fiction");
		kid.requestBook();
		AdultUser adult = new AdultUser();
		adult.setage(23);
		adult.registerAccount();
		adult.setbooktype("fiction");
		adult.requestBook();
		adult.setage(5);
		adult.registerAccount();
		adult.setbooktype("kids");
		adult.requestBook();
	}

}

