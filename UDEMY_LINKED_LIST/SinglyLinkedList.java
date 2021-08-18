package UDEMY_LINKED_LIST;
import java.util.Scanner;
public class SinglyLinkedList {
	Scanner sc = new Scanner(System.in);
	node start ,n1,tail;
	int size = 0;
	void create() {
		 n1 = new node();
		System.out.println("Enter node value");
		n1.info = sc.nextInt();
		n1.link = null;
		start = n1;
		tail = n1;
		node q = n1;
		size = 1;
		System.out.println("DO u want new node y/n");
		char op = sc.next().charAt(0);
		while(op!='n')
		{
		node n1 = new node();
		System.out.println("Enter node value of new node ");
			n1.info = sc.nextInt();
			n1.link = null;
			while(q.link != null)
			{
				q = q.link;
			}
			q.link = n1;
			tail = n1;
			size++;
			System.out.println("DO u want new node y/n");
			op = sc.next().charAt(0);
		} 
		}
	void display()
	{
		node q = start;
		System.out.println("The linked list is :-");
		while(q!= null)
		{
			System.out.print(q.info+" ");
			q = q.link;
		}
		System.out.println();
	}
	void insertBeg()
	{
		node n1 = new node();
		System.out.println("Enter node value");
		n1.info = sc.nextInt();
		n1.link = null;		
		n1.link = start;	
		start = n1;
		size++;
	}
	void insertEnd() 
	{ 
		if (start == null) {
			insertBeg();
		}else {
		node n1 = new node();
		System.out.println("Enter node value");
		n1.info = sc.nextInt();
		n1.link = null;	
		
		tail.link  = n1;
		tail = n1;
		size++;
		}
	}
	void insertMiddle(int loc)
	{
		if (loc == 0) {
			insertBeg();
		}else 
			if (loc >= count()) {
				insertEnd() ;
			} else
		{
		node n1 = new node();
		System.out.println("Enter node value");
		n1.info = sc.nextInt();
		n1.link = null;			
		int l = 0;
		node q = start;
		while(l<loc-1)
		{
			q = q.link;
			l++;
		}
		n1.link = q.link;
		q.link = n1;
		size++;
		}
	}
	int count()
	{
		int c = 0;
		node q = start;
		while(q!=null)
		{
			q = q.link;
			c++;
		}
		return c;
	}
	void deleteBeg()
	{
		if (start == null) {
			System.out.println("Linked list is empty");
		}else
		{
		start = start.link;
		size--;
		}
	}
	void deleteEnd()
	{
		if (start == null) {
			System.out.println("Linked list is empty");
		}else if (size == 1 ) {
			deleteBeg();
		}else
		{
			node p = start;
			node q = null ;
			while(p.link!=null) {
				q=p;
				p=p.link;
			}
			q.link=null; 
			tail = q;
			size--;
		}
	}
	void delLoc(int loc)
	{
		if (loc >= size) {
			System.out.println("Not in range");
		}else 
		if (loc == 0) {
			deleteBeg();
		}else
		if (loc == size-1) {
			deleteEnd();
		}else
		{
			node p = start;
			node q = null;
			int c = 0;
			while(c!=loc)
			{
				c++;
				p = p.link;
				q = p;
			}
			q.link = p.link;
			size--;
		}	
	}
	void search(int value)
	{
		int l = 0;
		node q = start;
		try {
		while(value != q.info)
		{
			q= q.link;
			l++;
		}
		System.out.println("Element is at location "+l);
		}
		catch(Exception e)
		{
			System.out.println("value not present");
		}
	}
	void reverse()
	{
		node p = null;
		node c = start;
		node n = null;
		tail = start;
		while(c!=null)
		{
			n = c.link;
			c.link = p;
			p = c;
			c = n;
		}
		start = p;
	}
	void sort()
	{
		node p,q;
		for (p = start; p.link!=null; p=p.link) {
			for (q = start; q.link!=null; q=q.link) {
				if (q.info > q.link.info) {
					int t = q.info;
					q.info = q.link.info;
					q.link.info = t;
				}
			}
		}
	}
	void deleteComplete()
	{
		start = null;
		tail = null;
	}
}





















