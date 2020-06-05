package linkList;


public class LinkList<T>{
	public ListNode<T> create(T []data) {
		ListNode<T> head=null,node=null;
		for(int i=0;i<data.length;i++) {
			if(head==null) {
				node=new ListNode<T>(data[i]);
				head=node;
				continue;
			}
			node.next=new ListNode<T>(data[i]);
			node=node.next;
		}
		return head;
	}
	
	public void printLinkList(ListNode<T> head) {
		ListNode<T> node=head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
}
