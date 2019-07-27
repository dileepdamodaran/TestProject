
public class Node {
	private Node left;
	private Node right;
	int data;
	

	
	public Node(int data){
		this.data=data;
	}
	/**
	 * Set Left node
	 * @param left
	 */
	public void setLeft(Node left) {
		this.left = left;
	}
	/**
	 * get left node
	 * @return
	 */
	public Node getLeftNode() {
		return this.left;
	}
	/**
	 * Method to insert data into node
	 * @param value
	 */
	public void insert(int value) {
		if(value <=data ) {
			if(left == null ) {
			left = new Node(value);
			}else {
				left.insert(value);	
			}
			
		}
		else {
			if(right == null ) {
			right = new Node(value);
			}else {
				right.insert(value);	
			}
			
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains (int value) {
		if(value == data) {
			return true;
		}
		else if(value <data) {
			if (left == null){
				return false;
			}else {
				left.contains(value);
			}
		}else {
			if(right == null) {
				return false;
			}else {
				right.contains(value); 
			}
		}
		return false;
	}
}
