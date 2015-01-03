import java.util.ArrayList;


public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList obj= new LinkList();
		obj.AddNode(10);
		obj.AddNode(20);
		obj.AddNode(30);
		//obj.printnode();
		obj.DeleteNode(20);
		obj.printnode();
	}



}

//adding and deleting node in a singly linkedlist
class LinkList{
	int data;
	LinkList nxt=null;
	void printnode(){
		LinkList d=this;
		while(d.nxt!=null){
			System.out.println(d.nxt.data);
			d=d.nxt;
		}
	}
void AddNode(int var){
	LinkList newnode=new LinkList();
	newnode.data=var;
	if(this.nxt==null){
		this.nxt=newnode;
	return;
}
	else {
		LinkList d=this;
		while(d.nxt!=null){
		d=d.nxt;
	}
		d.nxt=newnode;
	}
}

void DeleteNode(int var){
if (this.data==var){
	this.nxt=this.nxt.nxt;
	}
else{
	LinkList d=this;
	while(d.nxt!=null){
		if(d.nxt.data==var){
		d.nxt=d.nxt.nxt;
		return;
		}
	d=d.nxt;
	}
}
}
}
