
public class BinarySearchTree {

	/**
	 * @param args //Delete node is yet to be completely implemented
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bstobj=new BST();
		bstobj.AddNode(10);
		bstobj.AddNode(20);
		bstobj.AddNode(30);
		bstobj.AddNode(5);
		bstobj.InorderTraversal(bstobj.root);
		bstobj.Maximum(bstobj.root);
		System.out.println("The predecesso of"+ bstobj.root.left.key+"is ");
		bstobj.predecessor(bstobj.root, bstobj.root.right);
		bstobj.deletenode(bstobj.root, 20);
		bstobj.InorderTraversal(bstobj.root);
	}

}

//Implementation of binary search trees
class node{
	int key=0;
	node left=null;
	node right=null;
	node parent=null;
}
class BST{
	boolean elementadded=false;
	node root=null;
	void AddNode(int val){
		node newnode=new node();
		newnode.key=val;
		node temp=this.root;
		if(temp==null){
			root=newnode;
		}
		else  {   //Recurse on left subtree
			InsertNode(temp ,newnode);
		}
		
		
	}
	void InsertNode(node start,node toadd){
	//	while(start.left !=null && start.right != null) {
		  if(start.key> toadd.key) { //recurse on left
			if(start.left==null){
				start.left=toadd;
				toadd.parent=start;
				return;
			}
			InsertNode(start.left,toadd);
			}
		else{
			if(start.right==null){
				start.right=toadd;
				toadd.parent=start;
				return;
			}
			InsertNode(start.right,toadd);
			}

		
		}//close insert node
     void InorderTraversal(node temp){
    	 if(temp.left!=null){
    		 InorderTraversal(temp.left);
    	 }
    	 System.out.println(temp.key);
    	 if(temp.right!=null){
    		InorderTraversal(temp.right);
    	 }
    	 
     }
     
    node Maximum(node temp){
    	if(temp.right!=null)
    		Maximum(temp.right);
    	else
    		System.out.println("The maximum is "+temp.key);
    		return temp;
    }
   
    int Minimum(node temp){
    	if(temp.left!=null)
    		Minimum(temp.left);
    	else
    		System.out.println("The maximum is "+temp.key);
    		return temp.key;
    }
    
    void predecessor(node temp,node elem){
    	
    	 if(temp.key==elem.key){
    		 //check if it has left subtree and return the rightmost element of right subtree
    		 if(elem.left!=null){
    			 System.out.println(Maximum(elem.left).key);
    			 
    		 }
    		 else{
    			 backtrack(elem.parent,elem.key);
    			 
    		 }
    			 
    	 }
    	 else if(temp.key>elem.key){  		 
    		 predecessor(temp.left,elem);
    		 
    	 }
    	 else{
    		 predecessor(temp.right,elem);
    	 }
     }

    void backtrack(node temp,int val){
    	if(temp.key<val)
    		System.out.println("The predecessor is "+temp.key);
    		//return temp;
    	else if(temp.parent!=null)
    		backtrack(temp.parent,val);
    	else
    		System.out.println("No predecessor found");
    		//return null;
    
    }
 
    void deletenode(node temp,int val){

    	if(temp.key==val){
    		//Check if it does not have any child node case 1
    		if(temp.left==null && temp.right==null){
    			if(temp.parent.left==temp)
    				temp.parent.left=null;
    			else
    				temp.parent.right=null;
    		}
    		//Check if it has one child node
    		else if(temp.left==null || temp.right==null){
    			if(temp.left!=null)
    			{
    				if(temp.parent.left==temp)
        				temp.parent.left=temp.left;
        			else
        				temp.parent.right=temp.left;
    				
    			}
    			else{
    				if(temp.parent.left==temp)
        				temp.parent.left=temp.right;
        			else
        				temp.parent.right=temp.right;
    			}
    		}
    		//Check if it has two child nodes
    		else{
    			predecessor(this.root,temp);
    		}
    		
    	}
    	else if(temp.key>val){
    		if(temp.left!=null)
    			deletenode(temp.left,val);
    		else
    			System.out.println("Element not found");
    	}
    	else{
    		if(temp.right!=null)
    			deletenode(temp.right,val);
    		else
    			System.out.println("Element not found");
    	}
    		
    }
}//Close class
