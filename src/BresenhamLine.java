public class BresenhamLine {

    public void printLine(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (x1 != x2 || y1 != y2) {
            System.out.println("(" + x1 + ", " + y1 + ")");
            int e2 = err * 2;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
        System.out.println("(" + x1 + ", " + y1 + ")");
    }

    public static void main(String[] args) {
        BresenhamLine bresenhamLine = new BresenhamLine();
        bresenhamLine.printLine(0, 0, 4, 6);
    }
}
