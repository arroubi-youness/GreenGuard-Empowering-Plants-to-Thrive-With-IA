package Models;

public class Care_History {
    private int care_id;
    private int plant_id;
    private String   action_type;
    private String action_date;
    private String amount;


    public Care_History() {

    }

     public Care_History(int care_id, int plant_id, String action_type, String action_date, String amount) {
        this.care_id = care_id;
        this.plant_id = plant_id;
        this.action_type = action_type;
        this.action_date = action_date;
        this.amount = amount;
    }

     public int getCare_id() {
        return care_id;
    }

    public void setCare_id(int care_id) {
        this.care_id = care_id;
    }

     public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

     public String getAction_type() {
        return action_type;
    }

    public void setAction_type(String action_type) {
        this.action_type = action_type;
    }

     public String getAction_date() {
        return action_date;
    }

    public void setAction_date(String action_date) {
        this.action_date = action_date;
    }

     public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
