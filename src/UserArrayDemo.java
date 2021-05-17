
public class UserArrayDemo {
	public static void main(String[] args) {
		User user;//reference of user class, default value is null
		user = new User("user1", "password1");//now this is an object of User class
		
		//User user1, user2, user3; declared 3 user refrence each with null value as default
		User[] users = new User[3];
		users[0] = new User("user123", "password123");
		users[1] = new User("user1243", "password1243");
		users[2] = new User("user1234", "password1234");
		
		for (User user4:  users) {
			System.out.println(user4);
		}
	}
}
