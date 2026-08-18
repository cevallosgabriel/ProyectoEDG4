package com.mycompany.proyectoestructuradatos;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<E>{
    private E data;
    private TreeNode<E> parent;
    private List<TreeNode<E>> children; 
    private int utility; 
    private int movement;
    private int depth;
    private boolean maximizing;

    private TreeNode(E data,int movement,  int depth, boolean maximizing){
        this.data = data;
        this.parent = parent;
        this.children = new ArrayList<>();
        this.movement = movement;
        this.depth = depth;
        this.maximizing = maximizing;
    }
}