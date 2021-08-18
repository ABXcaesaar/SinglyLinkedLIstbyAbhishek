package UDEMY_LINKED_LIST;
import java.util.Scanner;
public class main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList s1 = new SinglyLinkedList();

		while(true)
		{
			System.out.println("-----------MENU----------");
			System.out.println("0 : Exit");
			System.out.println("1 : Create");
			System.out.println("2 : Display");
			System.out.println("3 : Insert Begining");
			System.out.println("4 : Insert End");
			System.out.println("5 : Insert at any location (0-n)");
			System.out.println("6 : Count no of Nodes");
			System.out.println("7 : Delete first node");
			System.out.println("8 : Delete last node");
			System.out.println("9 : Delete any node");
			System.out.println("10: Search a node ");
			System.out.println("11: Reverse Linked list ");
			System.out.println("12 Sort the linked list");
			System.out.println("13 Delete complete list");
			System.out.println("-------------------------");
			System.out.println("select option ");
			int op = sc.nextInt();
			switch(op) 
			{
			case 0: System.out.println("THANKYOU");return;
			case 1: s1.create();break;
			case 2: s1.display();
			        System.out.println("HEAD = "+s1.start.info+" TAIL = "+s1.tail.info);break;
			case 3: s1.insertBeg();break;
			case 4: s1.insertEnd();break;
			case 5: System.out.println("Enter location");
			        int loc  = sc.nextInt();
				    s1.insertMiddle(loc);break;
			case 6: System.out.println(s1.size);break;	 
			case 7: s1.deleteBeg();break;
			case 8: s1.deleteEnd();break;
			case 9: System.out.println("Enter location 0-n");
			        int l = sc.nextInt();
				    s1.delLoc(l);break;
			case 10: System.out.println("Enter value to search");
			         int value = sc.nextInt();
				    s1.search(value);break;
			case 11:s1.reverse();break;	  
			case 12:s1.sort();break;
			case 13:s1.deleteComplete();break;
			default : System.out.println("Please select within menu");		
			}
		}		
	}
}
