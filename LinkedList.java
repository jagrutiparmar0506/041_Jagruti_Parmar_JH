class LinkedList{
		static Node head;
		static class Node{
			int data;
			Node next;
			
			Node(int d){
				data=d;
				next=null;
			}	
		}
		LinkedList(){
				head=null;
			}
		
		Node reverseList(Node node){
			//Node node=new Node(node);
			Node prev=null;
			Node temp=node;
			Node next=null;
			while(temp!=null){
				next=temp.next;
				temp.next=prev;
				prev=temp;
				temp=next;
			}
			node=prev;
			return node;
		}
		void displayList(Node node){
			while(node!=null){
			System.out.print(node.data+"");
			node=node.next;
			}
		}

		public static void main(String[] args){
			LinkedList list=new LinkedList();
			list.head=new Node(1);
			list.head.next=new Node(2);
			list.head.next.next=new Node(3);
			//list.head.next.next.next=new Node(2);
			//list.head.next.next.next.next=new Node(3);
			//list.head.next.next.next.next.next=new Node(4);
			//list.head.next.next.next.next.next.next=new Node(5);
			
			System.out.print("Given Linked List: ");
			list.displayList(head);
			head=list.reverseList(head);
			System.out.println(" ");
			System.out.print("Reverse List: ");
		list.displayList(head);
		}
}
		
	

			

		
		
		
		
		
		
		
		