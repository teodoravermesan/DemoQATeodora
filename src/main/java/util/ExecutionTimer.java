package util;

public class ExecutionTimer {
    private long start;
    private long end;

    public void start() {
        start = System.currentTimeMillis();
    }

    public void end() {
        end = System.currentTimeMillis();
    }

    public long duration() {
        end();
        return end - start;
    }

    public String toString() {
        return "  ++++ " + duration() + "ms ";
    }
}
