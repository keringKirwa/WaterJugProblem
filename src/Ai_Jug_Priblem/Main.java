package Ai_Jug_Priblem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JugProblem problem = new JugProblem(2);
        List<Node> solutions= problem.solveDFS();
         for (Node n : solutions){
             problem.printSolution(n);
         }

    }
}
