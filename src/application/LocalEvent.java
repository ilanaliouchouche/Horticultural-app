package application;

import java.io.Serializable;
import java.time.LocalDate;


public class LocalEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate date;

    private String description;

    public LocalEvent(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }


    
    @Override
    public String toString() {
        return date + " : " + description;
    }

}
