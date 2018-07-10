package Linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList = 0;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub

		++this.sizeOfList;

		if (root == null) {
			this.root = new Node<>(data);
		} else {
			insertDataAtBeginning(data);
		}
	}

	// O(1)
	private void insertDataAtBeginning(T data) {
		// TODO Auto-generated method stub
		Node<T> nextNode = new Node<>(data);
		nextNode.setNextNode(root);
		this.root = nextNode;
	}

	// O(n)
	private void insertDataAtEnd(T data, Node<T> node) {
		if (node.getNextNode() != null) {
			insertDataAtEnd(data, node.getNextNode());
		} else {
			Node<T> nextNode = new Node<>(data);
			node.setNextNode(nextNode);
		}
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub

		if (this.root == null)
			return;

		--this.sizeOfList;

		if (this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
		} else {
			remove(data, root, root.getNextNode());
		}
	}

	private void remove(T dataToremove, Node<T> previousNode, Node<T> actualNode) {
		// TODO Auto-generated method stub
		while (actualNode != null) {
			if (actualNode.getData().compareTo(dataToremove) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();

		}
	}

	@Override
	public void travelList() {
		// TODO Auto-generated method stub
		if(this.root == null) return;
		
		Node<T> actualNode = this.root;
		
		while(actualNode != null){
			System.out.print(actualNode+ " -> ");
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.sizeOfList;
	}

}
