package com.adrianangara.Trees;

import javafx.geometry.Pos;

public abstract class AbstractTree<E> implements Tree<E>{
    public boolean isInternal(Position<E> p) {
        return true;
    }

    public boolean isExternal(Position<E> p) {
        return true;
    }

    public boolean isRoot(Position<E> p) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

}
