import java.util.*;
import java.io.*;

class BinarySearchTree
{
	class Node
	{
		int key;
		Node left, right;
		public Node(int key)
		{
			this.key = key;
			left = right = null;
		}
	}

	Node root;

	public BinarySearchTree()
	{
		root = null;
	}

	public Node insertKey(Node root,int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		else if(root.key>key)
			root.left = insertKey(root.left,key);
		else if(root.key<key)
			root.right = insertKey(root.right,key);
		return root; 
	}
	public void insert(int key)
	{
		root = insertKey(root,key);
	}
}
public class DemoBinarySearchTree
{
	public static void main(String[] args) throws Exception
	{

		Scanner in = new Scanner(System.in);
		BinarySearchTree br = new BinarySearchTree();
		while(x = in.nextInt()!-1)
		{
			br.insert(x);
		}

		br.inorder();
	}
}
