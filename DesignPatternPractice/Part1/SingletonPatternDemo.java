public class SingletonPatternDemo{
	public static void main(String args[]){

		SingleObject single = SingleObject.getInstance();
		single.showMessage();
		
	}
}
