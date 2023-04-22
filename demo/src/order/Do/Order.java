package order.Do;

import java.util.Date;

public class Order extends  Train{
    private String sfz;
    private String id;
    private float money;
    private Date creatOrdertime;

    public Order(String id, String name, Date startTime, Date endTime, String[] arr, int seatNum, String sfz, String id1, float money, Date creatOrdertime) {
        super(id, name, startTime, endTime, arr, seatNum);
        this.sfz = sfz;
        this.id = id1;
        this.money = money;
        this.creatOrdertime = creatOrdertime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sfz='" + sfz + '\'' +
                ", id='" + id + '\'' +
                ", money=" + money +
                ", creatOrdertime=" + creatOrdertime +
                '}';
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Date getCreatOrdertime() {
        return creatOrdertime;
    }

    public void setCreatOrdertime(Date creatOrdertime) {
        this.creatOrdertime = creatOrdertime;
    }

    public Order(String id, String name, Date startTime, Date endTime, String[] arr, int seatNum) {
        super(id, name, startTime, endTime, arr, seatNum);
    }
}
