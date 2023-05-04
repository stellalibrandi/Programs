/*creare un albero che parte da 12 e si divide in 5 che si divide in 8*, 12 si divide 
 * anche in 12 che si divide in 2 a sinistra e 3 a destra/
 */


public class Main{
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		Node root = new Node(12);
		Node node5 = new Node(5);
		Node node8 = new Node(8);
		Node node12 = new Node(12);
		Node node7 = new Node(7);
		Node node3 = new Node(3);
		
		root.nextL = node5;
		root.nextR= node12;
		
		node5.nextL=node8;
		node12.nextL=node7;
		node12.nextR=node3;
		root.toStringRec(root,'H');
		
		
	}
}

class Node{
	private int data;
	Node nextL, nextR;
	Node root;
	//private Node head=null; //testa della lista
	
	Node(int x){
		data=x;
		nextL=null;
		nextR=null;
	}
	
	public void stampa() {
		toStringRec(root,'H');
	}
	
	public void toStringRec(Node node, char c) {
		if(node==null) return;
		System.out.print(node.data+" "+c+"  ");
		toStringRec(node.nextL, 'L');
		toStringRec(node.nextR, 'R');
	}
	
	public Node insertNode(int data) {
		Node nuovoNodo=new Node(data);
		/*nuovoNodo.next=head;
		head=nuovoNodo;
		return head;*/
		return nuovoNodo;
	}
}
