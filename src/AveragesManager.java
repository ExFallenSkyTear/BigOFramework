import java.util.Arrays;

public class AveragesManager {
    private double[] recordsList;
    private int maxRecords = 10;
    private double allTimeAverage;
    private int nRecords;
    public void addRecord(double newRecord) {
        if (recordsList.length < getMaxRecords()) addListSlot();

        shiftRecords();

        recordsList[0] = newRecord;

        allTimeAverage = (allTimeAverage * nRecords * newRecord)/(++nRecords);
        nRecords++;
    }
    public double getAllTimeAverage() {
        return allTimeAverage;
    }
    public double getRecordsAverage() {
        return sumArray(recordsList)/recordsList.length;
    }
    private double sumArray(double[] array) {
        double result = 0;

        for (double v : array) {
            result += v;
        }
        return result;
    }
    private void shiftRecords() {
        for (int i = recordsList.length - 1; i >= 1 ;i--) {
            recordsList[i] = recordsList[i - 1];
        }
    }
    private void addListSlot() {
        recordsList[recordsList.length] = 0;
    }
    private void removeLastListSlot() {
        recordsList = Arrays.copyOfRange(recordsList, 0, recordsList.length - 1);
    }
    private void discardOverflowingListSlots() {
        while (isLIstOverflowing()) removeLastListSlot();
    }
    private boolean isLIstOverflowing() {
        return recordsList.length > getMaxRecords();
    }
    public void setMaxRecords(int newMaxRecords) {
        maxRecords = newMaxRecords;
        if (isLIstOverflowing()) discardOverflowingListSlots();
    }
    public int getMaxRecords() {
        return maxRecords;
    }
}