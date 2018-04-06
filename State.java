
public class State {

    public int[] coor;
    public int dir;
    public State next;

    public State(int x, int y, int dir) {
        coor = new int[2];
        coor[0] = x;
        coor[1] = y;
        this.dir = dir;
        this.next = null;
    }
}
