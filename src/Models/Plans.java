package Models;

public class Plans {
    private  int  plan_id;
    private  String plan_name;
    private String description;
    private float price;
    private int duration_months;

    public Plans() {
    }

     public Plans(int plan_id, String plan_name, String description, float price, int duration_months) {
        this.plan_id = plan_id;
        this.plan_name = plan_name;
        this.description = description;
        this.price = price;
        this.duration_months = duration_months;
    }

     public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

     public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

     public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

     public int getDuration_months() {
        return duration_months;
    }

    public void setDuration_months(int duration_months) {
        this.duration_months = duration_months;
    }
}
