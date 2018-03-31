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

	public void inorder()
	{
		inorderPrint(root);
	}
	public void inorderPrint(Node root)
	{
		if(root!=null)
		{
			inorderPrint(root.left);
			System.out.print(root.key+" ");
			inorderPrint(root.right);
		}
	}
}
public class DemoBinarySearchTree
{
	public static void main(String[] args) throws Exception
	{

		Scanner in = new Scanner(System.in);
		int x;
		BinarySearchTree br = new BinarySearchTree();
		while(true)
		{
			x = in.nextInt();
			if( x == -1 )
				break;
			br.insert(x);
		}

		br.inorder();
	}
}
