package chatroom;

public class Mediator {
	   public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Welcome to Epam!");
	      john.sendMessage("pravallika!");
	   }
	}