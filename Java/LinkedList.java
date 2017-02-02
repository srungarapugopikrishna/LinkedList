import java.util.Scanner;


public class LinkedList {
	class LinkedListData{
		int data;
		LinkedListData next;
	}
	private LinkedListData head;
	private Scanner scr;
	public boolean Enque(int data){
		if(head == null){
			head = new LinkedListData();
			head.next = null;
			// EnQued the data
			head.data = data;
		}else{
			LinkedListData temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next = new LinkedListData();
			temp=temp.next;
			// EnQued the data
			temp.data = data;
			temp.next = null;
		}
		return true;
	}
	public boolean EnqueAtFirst(int data) {
		if(head == null){
			head = new LinkedListData();
			head.next = null;
			// EnQued the data
			head.data = data;
		}else{
			LinkedListData temp=new LinkedListData();
			temp.data=data;
			temp.next=head;
			head=temp;
		}
		return true;
	}
	public boolean EnqueAtPosition(int position, int data) {
		if(position==1){
			EnqueAtFirst(data);
		}
		else{
			LinkedListData tempPre,tempCurr=head.next;
			LinkedListData temp=new LinkedListData();
			temp.data=data;tempPre=tempCurr;
			int i=2;
			while(tempCurr.next!=null){
				if(i==position){
					tempPre.next=temp;
					temp.next=tempCurr;
					return true;
				}
				tempPre=tempCurr;
				tempCurr=tempCurr.next;
				i++;
			}
		}
		return true;
	}
	public int DeQueFirstNode() throws Exception{
		if(head!=null){
			LinkedListData temp=head.next;
			int dequedData=head.data;
			head.next=null;
			head=temp;
			return dequedData;
		}
		else{
			throw new Exception("Queue is Empty. Cannot Deque");
		}
	}
	public int DeQueLastNode() throws Exception{
		if(head!=null){
			LinkedListData temp=head;
			LinkedListData tempPre = null;
			while(temp.next!=null){
				tempPre=temp;
 				temp=temp.next;
			}
			int dequedData=temp.data;
			if(tempPre!=null){
				tempPre.next=null;
			}
			else{
				head=null;
			}
			return dequedData;
		}
		else{
			throw new Exception("Queue is Empty. Cannot Deque");
		}
	}
	public int DeQueElementAtPostion(int position) {
		if(head!=null){
			if(position==1){
				try {
					DeQueFirstNode();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else{
				int i=2;
				LinkedListData tempPre = null;
				LinkedListData tempNxt = null;
				LinkedListData temp=head.next;tempPre=head;
				while(temp!=null){
					int dequedData=temp.data;
					System.out.println(temp.data);
					if(i==position){
						tempNxt=temp.next;
						tempPre.next=tempNxt;
						temp=null;
						return dequedData; 
					}
					tempPre=temp;
					temp=temp.next;
					i++;
				}
			}
		}
		else{	
				System.out.println("Q is Empty");
			}
		return -1;
	}
	public void displayQ(){
		if(head!=null){
			LinkedListData temp=head;
			while(temp.next!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
				System.out.println(temp.data);
		}
		else{	
				System.out.println("Q is Empty");
			}
	 }
	public void reverseLinkedList() {
		LinkedListData temp=null,nextNode;
		while(head!=null){
			nextNode=head.next;
			head.next=temp;
			temp=head;
			head=nextNode;
		}
		head=temp;
	}
	public int findMiddleElement() {
		LinkedListData ptr1=head,ptr2=head;
		int i=0;
		while(ptr1.next!=null){
			if(i==0){
			//	System.out.println(ptr1.data);
				ptr1=ptr1.next;
				i=1;
			}
			else if(i==1){
				//System.out.println(ptr1.data);
				ptr1=ptr1.next;
				ptr2=ptr2.next;
				i=0;
			}
		}
		return ptr2.data;
	}
	public void DisplayFromEndRecusive() {
		DisplayFromEndRecusiveSub(head);
	}
	private void DisplayFromEndRecusiveSub(LinkedListData headRecursive) {
		if(headRecursive==null)return;
		DisplayFromEndRecusiveSub(headRecursive.next);
		System.out.println(headRecursive.data);
		
	}
	public void FindLengthOfList() {
		LinkedListData temp=head;
		while(temp!=null&&temp.next!=null){
			temp=temp.next.next;
		}
		if(temp==null){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
			}
	}
	public void ReverseListInPairs() {
		System.out.println("Select The Mode Of Reversing::\n 1.Iterative\n 2.Recursive\n 3.Swaping Only Numbers");
		scr = new Scanner(System.in);
		int input=scr.nextInt();
		if(input==3){
			LinkedListData temp=head;
			while(temp!=null){
				//System.out.println(temp.data+"--"+temp.next.data);
				if(temp.next!=null){
					int temporary=temp.data;
					temp.data=temp.next.data;
					temp.next.data=temporary;
				}
				temp=temp.next.next;
			}
		}else if(input==2){
			LinkedListData temp,temp1,Current=head;
			while(Current!=null&&Current.next!=null){
				temp=Current.next;
				temp1=temp.next;
				temp.next=Current;
				Current.next=temp1;
				if(Current!=null)
				Current=Current.next;
				// displayQ();
			}
		}else{
			
		}
	}
}