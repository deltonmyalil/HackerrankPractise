package binary_search_tree_height;
//https://www.hackerrank.com/challenges/30-binary-search-trees/forum

public class Node {
	int data;
	Node left, right;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}