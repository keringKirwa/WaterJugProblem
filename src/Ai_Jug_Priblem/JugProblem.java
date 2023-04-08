package Ai_Jug_Priblem;

import java.util.*;

public class JugProblem {
    private int goal;
    private Node root;

    /**
     * Note that in this problem , the root is not null at all .initially the root has state (0,0)
     * @param goal
     */

    public JugProblem(int goal) {
        this.goal = goal;
        this.root = new Node(new JugState(0, 0), null);
    }

    public List<Node> solveDFS() {
        Stack<Node> stack = new Stack<>();
        /**
         * The reason for using HashSet here is to avoid duplicates .
         */
        Set<JugState> visited = new HashSet<>();
        List<Node> solutions = new ArrayList<>();
        stack.push(root);
        System.out.println("The root node has  : " + root.getState());

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.getState().getJug1() == goal || node.getState().getJug2() == goal) {
                solutions.add(node);
            }
            /**
             * Adds the state of the parent node : this is part of the constraints in problem formulation.
             */
            visited.add(node.getState());

            for (Node child : node.getChildren()) {
                if (!visited.contains(child.getState())) {
                    stack.push(child);
                }
            }
        }

        return solutions;
    }

    public List<Node> solveBFS() {
        Queue<Node> queue = new LinkedList<>();
        List<Node> solutions = new ArrayList<>();
        Set<JugState> visited = new HashSet<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.getState().getJug1() == goal || node.getState().getJug2() == goal) {
                solutions.add(node);
            }
            visited.add(node.getState());

            for (Node child : node.getChildren()) {
                if (!visited.contains(child.getState())) {
                    queue.add(child);
                }
            }

        }

        return solutions;

    }

    public ArrayList<Node> traceBFS() {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> nodeArrayList= new ArrayList<>();
        Set<JugState> visited = new HashSet<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            nodeArrayList.add(node);
            visited.add(node.getState());

            for (Node child : node.getChildren()) {
                if (!visited.contains(child.getState())) {
                    queue.add(child);
                }
            }

        }
        return nodeArrayList;


    }

    public void  printSolution(Node node) {
        List<Node> path = new ArrayList<>();
        while (node != null) {
            path.add(node);
            node = node.getParent();
        }
        Collections.reverse(path);
        for (Node n : path) {
            System.out.print(n.getState() + " -> ");
        }
        System.out.println("GOAL");
    }

}
