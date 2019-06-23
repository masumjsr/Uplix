package ar.codeslu.plax.lists;

/**
 * Created by mostafa on 28/10/18.
 */

public class myD {
    private String name, nameL, statue, avatar, phone, lastOn, id;
    private boolean onstatue;
    private long time, timeC;

    public myD() {
    }

    public myD(String id, String ava, String name, String phone, boolean online) {
        this.nameL = name;
        this.phone = phone;
        this.id = id;
        this.avatar = ava;
        onstatue = online;


    }

    public myD(String name, String nameL, String statue, String avatar, String phone, String lastOn, String id, boolean onstatue, long time, long timeC) {
        this.name = name;
        this.nameL = nameL;
        this.statue = statue;
        this.avatar = avatar;
        this.phone = phone;
        this.lastOn = lastOn;
        this.id = id;
        onstatue = onstatue;
        this.time = time;
        this.timeC = timeC;
    }

    public myD(String id, String ava, String phone) {
        this.phone = phone;
        this.id = id;
        this.avatar = ava;

    }

    public myD(String name, String nameL, String statue, String avatar, String phone, String lastOn, String id, boolean onstatue, long time) {
        this.name = name;
        this.nameL = nameL;
        this.statue = statue;
        this.avatar = avatar;
        this.phone = phone;
        this.lastOn = lastOn;
        this.id = id;
        onstatue = onstatue;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastOn() {
        return lastOn;
    }

    public void setLastOn(String lastOn) {
        this.lastOn = lastOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOnstatue() {
        return onstatue;
    }

    public void setOnstatue(boolean onstatue) {
        onstatue = onstatue;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimeC() {
        return timeC;
    }

    public void setTimeC(long timeC) {
        this.timeC = timeC;
    }

}