package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean thisUserLike;
    private int canLike;
    private int canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isThisUserLike() {
        return thisUserLike;
    }

    public void setThisUserLike(boolean thisUserLike) {
        this.thisUserLike = thisUserLike;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
