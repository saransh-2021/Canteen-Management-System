public class QueueLl{
	Node front;
	Node rear;
	int size=0;
	
	void enqueue(Customer cust){
		Node n = new Node();
		//n.setData(cname,oid,money);
		n.setCust(cust);
		
		if (front==null){
			front=n;
			rear=n;
		}
		else{
			rear.setNext(n);
			rear=n;
		}
		size++;
	}
	
	void dequeue(){
		if (front==null){
			System.out.println("Underflow");
		}
		else{
			front=front.getNext();
			size--;
		}
	}
	
	void display(){
		//might need to edit
		if (front==null){
			System.out.println("Empty Queue");
		}
		else{
			Node t = front;
			System.out.println("Queue :");
			while(t.getNext()!=null){
				t.getCust().getAll();
				t=t.getNext();
			}
			t.getCust().getAll();
			System.out.println();
		}
	}

	int size(){
		return size;
	}

	Customer peek(){
		return front.getCust();
		//System.out.println(" Rear is "+rear.getCustName().getOrderId());
	}

	boolean peekCustStatus(){
		return front.getCust().getOrder_Status();
	}
}