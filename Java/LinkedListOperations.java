
import java.util.Scanner;

public class LinkedListOperations{
	private static Scanner scr;
	public static void main(String[] args){
		LinkedList Lst=new LinkedList();
		scr = new Scanner(System.in);
		boolean execute=true;
		while(execute){
			System.out.println("Select your choice:\n 1.EnQue\n 2.Display\n 3.DeQue First Element\n 4.DeQue Last Element\n 5.DeQue Element At Position\n 6.EnQue at the First\n 7.EnQue Element At Position\n 8.ReverseLinkedList\n 9.Find Middle Element\n 10.DisplayFromEnd(Recursive)\n 11.Find Length of list(Even or Odd)\n 12.Reverse the list in pairs\n 13.Exit");
			int inputChoice=scr.nextInt();
			switch(inputChoice){
				case 1:	System.out.println("Enter the number to EnQue");
						int data=scr.nextInt();
						Lst.Enque(data);
						break;
				case 2: Lst.displayQ();
						break;
				case 3:	try{	
							System.out.println("Dequed data is:"+Lst.DeQueFirstNode());
						}
						catch(Exception e){
							e.printStackTrace();
						}
						break;
				case 4:	try{	
							System.out.println("Dequed data is:"+Lst.DeQueLastNode());
						}
						catch(Exception e){
							e.printStackTrace();
						}
						break;
				case 5:	System.out.println("Enter the position to DeQue");
						int position=scr.nextInt();
						System.out.println("Dequed data is:"+Lst.DeQueElementAtPostion(position));
						break;	
				case 6: System.out.println("Enter the number to EnQue at the first Position");
						data=scr.nextInt();
						Lst.EnqueAtFirst(data);
						break;
				case 7: System.out.println("Enter the Positon:");
						position=scr.nextInt();
						System.out.println("Enter the number to EnQue:");
						data=scr.nextInt();
						Lst.EnqueAtPosition(position,data);
						break;		
				case 8: Lst.reverseLinkedList();
						break;
				case 9: System.out.println("The middle element is "+Lst.findMiddleElement());
						break;
			   case 10: Lst.DisplayFromEndRecusive();
						break;
			   case 11: Lst.FindLengthOfList();
						break;
			   case 12: Lst.ReverseListInPairs();
				   		break;		
			   case 13: execute=false;
			}
		}
	}
}