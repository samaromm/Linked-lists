
public class LinkedList {
	//different linked list methods
	   private ListNode front;
		 public LinkedList(){
		        front=null;
		    }
		 public LinkedList(ListNode front){
		        this.front=front;
		    }
		    
		  public void add(int data){
		        if(front==null)
		            front = new ListNode(data);
		        else{
		            ListNode current = front;
		            while(current.next!=null)
		                current=current.next;
		         current.next = new ListNode(data);
		        }
		             
		    }
		  public void add(int index, int data){
		        if(index==0)
		            front = new ListNode(data, front);
		        else{
		            ListNode current = front;
		            for(int i =0; i<index; i++)
		                current=current.next;
		         current.next = new ListNode(data, current.next);
		        }
		             
		    }
		  public void addSorted(int num){
		        if(front==null)
		            front = new ListNode(num);
		        else{
		            ListNode current = front;
		            while(current.next!=null && current.next.data<num){
		                current = current.next;
		            }
		            current.next= new ListNode(num, current.next);
		        }}
		  public boolean contains(int data){
		        ListNode current = front;
		        while(current!=null){
		            if(current.data==data)
		                return true;
		            current=current.next;
		        }
		        return false;
		    }
		    
		    public void print(){
		        ListNode current = front;
		        while(current!=null){
		            System.out.print(current.data+" ");
		            current=current.next;
		        }
		    }
}
