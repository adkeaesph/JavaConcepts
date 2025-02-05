package org.example.tree_data_structure;

import java.util.Vector;

/*
 *                1
 *               /     \   \
 *              2      3   6
 *             / \     \    \ \ \
 *            8   5     11  24 15 18
 *                          /
 *                         21
 *
 *                 1
 *                / \
 *               2   3
 *              /   / \
 *             9    4  5
 *                      \
 *                       8
 */
public class Resources {

    public NaryTreeNode<Integer> getNaryTreeHead() {
        NaryTreeNode<Integer> root = new NaryTreeNode<>(1);

        root.setChildren(new Vector<>());
        root.getChildren().add(new NaryTreeNode<>(2));
        root.getChildren().add(new NaryTreeNode<>(3));
        root.getChildren().add(new NaryTreeNode<>(6));

        for(int i=0; i<3; i++) {
            NaryTreeNode<Integer> node = root.getChildren().get(i);
            node.setChildren(new Vector<>());
            if(i==0) {
                node.getChildren().add(new NaryTreeNode<>(8));
                node.getChildren().add(new NaryTreeNode<>(5));
            } else if(i==1) {
                node.getChildren().add(new NaryTreeNode<>(11));
            } else {
                NaryTreeNode<Integer> anotherNode = new NaryTreeNode<>(24);
                anotherNode.setChildren(new Vector<>());
                anotherNode.getChildren().add(new NaryTreeNode<>(21));

                node.getChildren().add(anotherNode);
                node.getChildren().add(new NaryTreeNode<>(15));
                node.getChildren().add(new NaryTreeNode<>(18));
            }
        }
        return root;
    }

    public BinaryTreeNode<Integer> getBinaryTreeHead() {

        return new BinaryTreeNode<>(1,
                new BinaryTreeNode<>(2,
                        new BinaryTreeNode<>(9),
                        null),
                new BinaryTreeNode<>(3,
                        new BinaryTreeNode<>(4),
                        new BinaryTreeNode<>(5,
                                null,
                                new BinaryTreeNode<>(8))));
    }
}
