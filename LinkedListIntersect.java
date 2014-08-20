
public class LinkedListIntersect {
	class LLIntersect{
		int data;
		LLIntersect next;
	} 
	private LLIntersect head1,head2,intersect;
	public void createLLIntersect(){
		//------------------------------------
		 intersect=new LLIntersect();
		intersect.data=3;
		LLIntersect temp=new LLIntersect();
		temp.data=7;
		intersect.next=temp;
		LLIntersect temp1=new LLIntersect();
		temp1.data=8;
		temp.next=temp1;
		//---------------------------------------
		head1=new LLIntersect();
		head1.data=1;
		LLIntersect head1t1=new LLIntersect();
		head1t1.data=2;
		head1.next=head1t1;
		LLIntersect head1t2=new LLIntersect();
		head1t2.data=4;
		head1t1.next=head1t2;
		LLIntersect head1t3=new LLIntersect();
		head1t3.data=9;
		head1t2.next=head1t3;
		head1t3.next=intersect;
		//------------------------------------------
		head2=new LLIntersect();
		head2.data=6;
		LLIntersect head2t1=new LLIntersect();
		head2t1.data=5;
		head2.next=head2t1;
		head2t1.next=intersect;
		//-------------------------------------------
	}
	public void displayLL1(){
		if(head1!=null){
			LLIntersect temp=head1;
			System.out.println("==+~:Linked List 1:~+==");
			while(temp.next!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
				System.out.println(temp.data);
		}
		else{	
				System.out.println("LinkedList 1 is Empty");
			}
	 }
	public void displayLL2(){
		if(head1!=null){
			LLIntersect temp=head2;
			System.out.println("==+~:Linked List 2:~+==");
			while(temp.next!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
				System.out.println(temp.data);
		}
		else{	
				System.out.println("LinkedList 2 is Empty");
			}
	 }
	void FindIntersectingNode(){
		LLIntersect list1=head1,list2=head2;
		int L1 = 0,L2 = 0,diff;
		
		while(list1!=null){
			L1++;
			list1=list1.next;
		}
		while(list2!=null){
			L2++;
			list2=list2.next;
		}
		System.out.println(L1+"--"+L2);
		diff=L1-L2;
		if(L1<L2){
			list1=head2;
			list2=head1;
			diff=L2-L1;
		}//else{list1=head1;list2=head2;}
		for(int i=0;i<diff;i++){
			list1=list1.next;
			while(list1!=null&&list2!=null){
				if(list1 == list2){
					 System.out.println(list1.data);
					 break;
				}
				list1=list1.next;
				list2=list2.next;
			}
		}
	}
	public static void main(String... args){
		LinkedListIntersect LLI=new LinkedListIntersect();
		
		LLI.createLLIntersect();
	//	LLI.displayLL1();
	//	LLI.displayLL2();
		LLI.FindIntersectingNode();
	}
}
