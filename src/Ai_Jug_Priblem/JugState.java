package Ai_Jug_Priblem;

import java.util.Objects;

public class JugState {
    private final int jug1;
    private final int jug2;

    public JugState(int jug1, int jug2) {
        this.jug1 = jug1;
        this.jug2 = jug2;
    }

    public int getJug1() {
        return jug1;
    }

    public int getJug2() {
        return jug2;
    }

    public JugState fillJug1() {
        return new JugState(4, jug2);
    }

    public JugState fillJug2() {
        return new JugState(jug1, 3);
    }

    public JugState emptyJug1() {
        return new JugState(0, jug2);
    }

    public JugState emptyJug2() {
        return new JugState(jug1, 0);
    }

    public JugState pourJug1toJug2() {
        int jug1toJug2 = Math.min(jug1, 3 - jug2);
        return new JugState(jug1 - jug1toJug2, jug2 + jug1toJug2);
    }

    public JugState pourJug2toJug1() {
        int jug2toJug1 = Math.min(jug2, 4 - jug1);
        return new JugState(jug1 + jug2toJug1, jug2 - jug2toJug1);
    }

    @Override
    public String toString() {
        return "(" + jug1 + ", " + jug2 + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof JugState other)) {
            return false;
        }
        return jug1 == other.jug1 && jug2 == other.jug2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jug1, jug2);
    }
}
