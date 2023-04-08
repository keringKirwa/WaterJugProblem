package Ai_Jug_Priblem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        JugProblem problem = new JugProblem(2);

        List<Node> BFS_Solutions=problem.solveBFS();
        List<Node> DFS_Solutions= problem.solveDFS();

//        System.out.println("BFS SOLUTIONS Are  : :: ");
//        for (Node n : BFS_Solutions){
//            problem.printSolution(n);
//        }
//
//        System.out.println("DFS SOLUTIONS Are ::: ");
//        for (Node n:DFS_Solutions
//             ) {
//            problem.printSolution(n);
//
//        }

        System.out.println("Tracing BFS  ::: ");
        ArrayList<Node> nodeArrayList= problem.traceBFS();
        for (Node n :
                nodeArrayList
             ) {
            System.out.print("("+ n.getState().getJug1() +  ", " + n.getState().getJug2() +  ")" + "->" );

        }





    }
}
