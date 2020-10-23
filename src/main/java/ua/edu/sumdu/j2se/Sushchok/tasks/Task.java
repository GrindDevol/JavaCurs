package ua.edu.sumdu.j2se.Sushchok.tasks; //my package

public class Task {
    private String title;
    private boolean active;
    private int time, startTime, endTime, interval;

    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }
    public Task (String title, int start, int end, int interval) {
        this.title = title;
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return  title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    static int getRepeatInterval() {
        if(interval == 0) {
            return 0;
        } else {
            return interval;
        }
    }
    static void setTime(int start, int end, int interval) {
        if(isRepeated()) {
            interval = 5;
        }
        time = end - start;
    }
    static boolean isRepeated() {
        if(getRepeatInterval() != 0) {
            return true;
        } else {
            return false;
        }
    }
}
