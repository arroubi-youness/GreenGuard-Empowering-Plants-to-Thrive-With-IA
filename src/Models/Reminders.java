package Models;

public class Reminders {
    private int reminder_id;
    private int  plant_id;
    private String reminder_type;
    private String reminder_date;
    private String description;

    public Reminders() {
    }

     public Reminders(int reminder_id,int plant_id, String reminder_type, String reminder_date, String description) {
        this.reminder_id=reminder_id;
        this.plant_id = plant_id;
        this.reminder_type = reminder_type;
        this.reminder_date = reminder_date;
        this.description = description;
    }
    public int getReminder_id() {
        return reminder_id;
    }

    public void setReminder_id(int reminder_id) {
        this.reminder_id = reminder_id;
    }

     public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

     public String getReminder_type() {
        return reminder_type;
    }

    public void setReminder_type(String reminder_type) {
        this.reminder_type = reminder_type;
    }

     public String getReminder_date() {
        return reminder_date;
    }

    public void setReminder_date(String reminder_date) {
        this.reminder_date = reminder_date;
    }

     public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

