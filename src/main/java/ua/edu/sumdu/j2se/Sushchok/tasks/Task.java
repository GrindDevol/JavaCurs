package ua.edu.sumdu.j2se.Sushchok.tasks; //my package

public class Task {
    private String title;
    private boolean active;
    private int time;
    private int startTime;
    private int endTime;
    private int interval;
    private boolean repeated;

    public Task() {
    }
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
        this.interval = 0;
        this.repeated = false;
        this.active = false;
    }
    public Task (String title, int start, int end, int interval) {
        this.title = title;
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
        this.repeated = true;
        this.active = false;
    }
    public int getTime() {
        if(isRepeated()) {
            return startTime;
        }
        else{
            return time;
        }
    }

    public void setTime(int time) {
        this.time = time;
        this.repeated = false;
        this.interval = 0;
    }

    public int getStartTime() {
        if(isRepeated()) {
         return   startTime;
        }
        else {
            return time;
        }
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        if (isRepeated()) {
            return endTime;
        }
        else {
            return time;
        }
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
    public int  getRepeatInterval() {
        if(interval == 0) {
            return 0;
        } else {
            return interval;
        }
    }
    public void setTime(int start, int end, int interval) {
        if(!isRepeated()) {
            this.repeated = true;
        }
        this.startTime = start;
        this.endTime = end;
        this.interval = interval;
    }
    public boolean isRepeated() {
        return repeated;
    }
    public int nextTimeAfter(int current)
    {
        if(active) {
            if(isRepeated()) {
                    if (current < startTime){
                        return startTime;
                    }
                    else {
                        int temp = startTime;
                        while (temp <= current) {
                            temp += interval;
                        }
                        if(temp<endTime) {
                            return temp;
                        }
                    }
            }
            else if(current<time) {
                return time;
            }
        }
        return -1;
    }
}