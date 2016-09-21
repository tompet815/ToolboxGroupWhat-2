package DTO;

import java.sql.Date;
import java.sql.Time;

public class ReservationDetail extends ReservationIdentifer {

    private Date date;
    private Time time;
    private String ferryName;

    public ReservationDetail(long id, Date date, Time time, String ferryName) {
        super(id);
        this.date = date;
        this.time = time;
        this.ferryName = ferryName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }

}
