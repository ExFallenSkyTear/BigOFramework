public class StopWatch {
    private double timeHolder;
    public void start() {
        timeHolder = getEpoch_ms();
    }
    public double stop() {
        return getEpoch_ms() - timeHolder;
    }
    private double getEpoch_ms() {
        return System.currentTimeMillis();
    }
}
