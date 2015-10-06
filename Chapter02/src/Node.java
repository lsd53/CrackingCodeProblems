
public class Node {
    Node next = null;
    int data;

    public Node(int d){
	data = d;
    }

    public void appendToTail(int d){
	Node end = new Node(d);
	Node n = this;
	while(n.next!=null){
	    n = n.next;
	}

	n.next = end;
    }
    
    public void deleteNode(Node c){
	c.data = c.next.data;
	c.next = c.next.next;
	
	    }

    
    public void removeDup(){
    	Hashtable<Integer, boolean > dupes = new Hashtable<Integer,boolean>();
    	while(n.next!=null){
    		if (dupes.containsKey(n.data)==false){ 
    			n.deleteNode(n);
    		}
    		else {
    			dupes.put(n.data,true);
    		}
    		n=n.next;
    	}

    } 
}
