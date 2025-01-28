public class Time {

    private int hour;
    private int minute;
    private int second;

    // parameterized constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getter methods
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // setter methods
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // other methods

    // go forward by 1 second
    public Time nextSecond() {
        if (++this.second == 60) {
            this.second = 0;
            if (++this.minute == 60) {
                this.minute = 0;
                if (++this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }
    
    // go backward by 1 second
    public Time previousSecond() {
        if (--this.second == -1) {
            this.second = 59;
            if (--this.minute == -1) {
                this.minute = 59;
                if (--this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    // toString() method
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
