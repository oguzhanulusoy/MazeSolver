
public class Stack {

    private State topState;

    public Stack() {
        topState = null;
    }

    public boolean isEmpty() {
        if (topState == null) {
            return true;
        }
        return false;
    }

    public void push(State n) {
        n.next = topState;
        topState = n;
    }

    public State pop() {
        State t = topState;
        topState = topState.next;
        return t;
    }
}
