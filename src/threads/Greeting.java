package threads;

public class Greeting {
	public static void main(String[] args) {
		printThingsAsRequestedByAidan(50);
	
	}
	static void printThingsAsRequestedByAidan(int i){
		if(i<=0) {
			
		}else {
			new Thread(()-> {
				System.out.println("hello from thread <" + i + ">");
				printThingsAsRequestedByAidan(i-1);
			}).start();
//			System.out.println(i-1);
//			printThingsAsRequestedByAidan(i-1);
		}
	}
}
