public class Timer {
    private ClockHand seconds;
    private ClockHand milliSeconds;

    public Timer() {
        this.milliSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.milliSeconds.advance();

        if (this.milliSeconds.value() == 0) {
            seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + milliSeconds;
    }
}
