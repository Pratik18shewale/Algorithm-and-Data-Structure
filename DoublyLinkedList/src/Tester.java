
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linkedlist ll = new linkedlist();
		 
		ll.insertByValue(10);
		ll.insertByValue(20);
		ll.insertByValue(30);
		ll.insertByValue(40);
		
		ll.display();
		ll.insertByPosition(50,5);
		ll.insertByPosition(60, 6);
		ll.display();
		
		ll.deleteByValue(10);
		ll.display();
		ll.deleteByValue(60);
		ll.display();
		
		ll.deleteByPosistion(1);
		ll.display();

		ll.deleteByPosistion(3);
		ll.display();
	}

}
