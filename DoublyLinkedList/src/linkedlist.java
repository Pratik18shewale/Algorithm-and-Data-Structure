
public class linkedlist {
	
	private Node head;
	
	public linkedlist() {
		head = null;
	}
	
	public boolean insertByValue(int data) {
		
		Node newnode= new Node(data);
		
		if(head == null) {
			head = newnode;
			return true;
		}
		Node last = head;
		while(last.getNext() != null) {
			
			last = last.getNext();
		}//while
		
		last.setNext(newnode);
		newnode.setPrev(last);
		return true;
	}//insert
	
	public void display() {
		
		if(head == null)
			return;
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			
			temp= temp.getNext();
		}
		System.out.println();
	}//display
	
	public boolean insertByPosition(int data, int position) {
		
		if (position <= 0 || (head == null && position > 1)) {
			return false;
		}
		
		Node newnode = new Node(data);
		
		if(position == 1) {
			
			if(head != null){
				newnode.setNext(head);
				head.setPrev(newnode);
				
			}
			head =newnode;
			return true;
		}
		
		Node prev = head;
		for(int i = 1; i<position-1; i++) {
			prev = prev.getNext();
			if(prev == null) {
				return false;
			}//
		}
		Node next = prev.getNext();
        if(next !=null) {
        	newnode.setNext(next);
        	next.setPrev(newnode);
        }
        prev.setNext(newnode);
        newnode.setPrev(prev);
        return true;
			
	}//end
	
	public boolean deleteByValue(int data) {
		if(head == null)
		{
			return false;
			}
		if(data == head.getData()) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
			}//if
			
			Node del = head;
			while(del.getData() != data) {
				
			del = del.getNext();
			if(del == null) {
				return false;
			}}
			
			Node prev = del.getPrev();
			Node next = del.getNext();
			prev.setNext(next);
			if(next != null) {
				next.setPrev(prev);
			}
			
		return true;
		
	}//deletebyvalue
	
	public boolean deleteByPosistion(int position) {
		
		if(position <=0 || head == null) {return false;}
		
		if(position == 1) {
			head = head.getNext();
			if(head != null) {
				head.setPrev(null);
			}
			return true;
		}
		
		Node del= head;
		for(int i = 1; i < position; i++) {
			del = del.getNext();
			if(del == null) {
				return false;
			}
		}
		
		Node prev = del.getPrev();
		Node next = del.getNext();
		prev.setNext(next);
		if(next != null) {
			next.setPrev(prev);
		}
		return true;
	}//deelteby posistion
	
	
}
