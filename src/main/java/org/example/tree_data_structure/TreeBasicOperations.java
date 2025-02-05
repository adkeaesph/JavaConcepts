package org.example.tree_data_structure;

public class TreeBasicOperations {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> lchild = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rchild = new BinaryTreeNode<>(3);
        root.setLeftChild(lchild);
        root.setRightChild(rchild);



    }
}
