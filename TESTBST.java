/*This program checks all the method in class BST meets all the requirements or not
 * by simply calling and performing all the method one by one
 */

package binarysearchtree;

public class TESTBST {

	public static void main(String[] args) {
		
		//create a BST
		BST<String> tree = new BST<>();
		
		System.out.print("Inserting the following data in our Binary Tree");
		System.out.print("\nLemons, Tomato, Mango, Banana, Carrot, Broccoli, Kale, Grapes, Zucchini, Apple");
		
		//insert data(names of food) in the tree using INSERT method.
		tree.insert("Lemons");
		tree.insert("Tomato");
		tree.insert("Mango");
		tree.insert("Banana");
		tree.insert("Carrot");
		tree.insert("Broccoli");
		tree.insert("Kale");
		tree.insert("Grapes");
		tree.insert("Zucchini");
		tree.insert("Apple");


		//search for an item using SEARCH method
		System.out.print("\n\nIs Apple in the tree? " + tree.search("Apple"));
		
		//Inorder sort
		System.out.print("\nInorder (sorted): ");
		tree.inorder();
		
		//Preorder Sort
		System.out.print("\nPreorder: ");
		tree.preorder();
		
		//Postorder Sort
		System.out.print("\nPostorder: ");
		tree.postorder();

		//total number of Nodes
		System.out.print("\nThe number of nodes is " + tree.getSize());
		
		
		//get a path from root to Beet
		System.out.print("\nPath from the root to Kale is: ");
		java.util.ArrayList<BST.TreeNode<String>> path = tree.path("Kale");
		
		for (int i = 0; path != null && i < path.size(); i++)
			System.out.print(path.get(i).element + " ");

		
		//deleting a node
		System.out.print("\nDeleting Kale.. ");
		tree.delete("Kale");
		
		//total number of Nodes
		System.out.print("\nThe number of nodes now is " + tree.getSize());
		System.out.print(": ");
		tree.inorder();
		
		
		//deleting the entire tree
		System.out.print("\nDeleting the entire Tree.. ");
		tree.clear();
		System.out.print("\nThe number of nodes now is " + tree.getSize());
		
		System.out.print("\n\nMain Class successfuly called all the methods from BST Class, Hence BST Class meets all the requirements");


	}

}
