package Ai_Jug_Priblem;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private JugState state;
    private Node parent;

    public Node(JugState state, Node parent) {
        this.state = state;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "{Jug 1: " + state.getJug1() + " , Jug 2: " + state.getJug2() +" }";
    }


    public JugState getState() {
        return state;
    }

    public Node getParent() {
        return parent;
    }

    public List<Node> getChildren() {
        /**
         * Note that , this in this case is the object  calling this function.
         */
        List<Node> children = new ArrayList<>();
        children.add(new Node(state.fillJug1(), this));
        children.add(new Node(state.fillJug2(), this));
        children.add(new Node(state.emptyJug1(), this));
        children.add(new Node(state.emptyJug2(), this));
        children.add(new Node(state.pourJug1toJug2(), this));
        children.add(new Node(state.pourJug2toJug1(), this));
        return children;
    }
}