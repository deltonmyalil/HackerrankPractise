package binary_search_tree_height;
//https://www.hackerrank.com/challenges/30-binary-search-trees/forum

import java.util.Scanner;

public class Solution {

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static int getHeight(Node root) {
		int heightLeft = 0;
		int heightRight = 0;
		if(root.left!=null)
			heightLeft = getHeight(root.left) + 1;
		if(root.right!=null)
			heightRight = getHeight(root.right) + 1;
		return Math.max(heightLeft,heightRight);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfNodes = scanner.nextInt();
		Node root = null;
		while (numberOfNodes-- > 0) {
			int data = scanner.nextInt();
			root = insert(root, data);
		}
		System.out.println(getHeight(root));
	}
}

//Next level order traversal
