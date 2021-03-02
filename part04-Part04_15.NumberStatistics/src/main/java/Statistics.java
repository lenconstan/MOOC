
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count > 0) {
            return (this.sum / (double)this.count);
        } else {
            return 0;
        }

    }
}
