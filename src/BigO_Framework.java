public class BigO_Framework {
    private final StopWatch internalStopWatch = new StopWatch();
    private final AveragesManager internalAveragesManager = new AveragesManager();
    public StopWatch stopWatch() {
        return internalStopWatch;
    }
    public double StopWatch_Stop() {
        double newRecord = stopWatch().stop();
        internalAveragesManager.addRecord(newRecord);

        return newRecord;
    }
}
