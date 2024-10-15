package imd.models;

import java.util.Date;

public class Event {
    private String description;
    private Date date;

    public void Schedule(String nome, Date dt) {
        this.description = nome;
        this.date = dt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
