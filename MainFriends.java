package Thread.com;
import java.lang.reflect.Array;

class Friendship{
	synchronized public void classroom(String friendsName ) { //synchronized
		String[] strArray = new String[] {"Sushil", "Prachi", "Isha", "Shiva", "Peter", 
				                          "Parker", "Tony", "Stark", "Captain", "Thor"};
	        for (String s:strArray) {  
	        System.out.println(s);  
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class MyThreads extends Thread{
	Friendship frd;
	String friendsName; 
	//@override 
		public void run() {
			frd.classroom(friendsName);
			
		}
		MyThreads (Friendship frd, String friendsName){
			this.frd=frd;
			this.friendsName=friendsName;
		}
}






public class MainFriends extends Thread{
	public static void main(String args[]) {
		Friendship frd= new Friendship();
		MyThreads mt= new MyThreads(frd , " ");
		System.out.println("My Friends List is ...... ");
		
		mt.start();	
		
	}
	
	}