package org.example.tree_data_structure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Vector;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NaryTreeNode<T> {
    private T data;
    private Vector<NaryTreeNode<T>> children;

    public NaryTreeNode(T data) {
        this();
        this.data = data;
    }
}
