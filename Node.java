public class Node{
	Node next;
	Customer cust;
	
	Node(){
		cust=null;
		next=null;
	}
	
	Customer getCust(){
		return cust;
	}
	
	Node getNext(){
		return next;
	}
	
	void setCust(Customer cname){
		cust=cname;
	}
	
	void setNext(Node n){
		next=n;
	}
}