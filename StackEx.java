import java.util.* ;

public class StackEx {
	public static void main(String[] args){
      Stack names = new Stack();
      names.push("Shashi");
      names.push("Kajal");

      System.out.println("Top of the stack : "+ names.peek());
      names.pop();
      System.out.println("Top of the stack : "+ names.peek());
	}
}