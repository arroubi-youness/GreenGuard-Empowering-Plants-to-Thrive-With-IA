package Models;

public class plants {
    private  int plant_id;
    private  int user_id;
    private String plant_name;
    private int species_id;
    private String last_watered_date;
    private String last_fertilizing_date;
    private byte[] image;
    public plants() {
    }

     public plants(int plant_id, int user_id, String plant_name, int species_id, String last_watered_date, String last_fertilizing_date,byte[] image) {
        this.plant_id = plant_id;
        this.user_id = user_id;
        this.plant_name = plant_name;
        this.species_id = species_id;
        this.last_watered_date = last_watered_date;
        this.last_fertilizing_date = last_fertilizing_date;
        this.image=image;
    }

     public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

     public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

     public String getPlant_name() {
        return plant_name;
    }

    public void setPlant_name(String plant_name) {
        this.plant_name = plant_name;
    }

     public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

     public String getLast_watered_date() {
        return last_watered_date;
    }

    public void setLast_watered_date(String last_watered_date) {
        this.last_watered_date = last_watered_date;
    }

     public String getLast_fertilizing_date() {
        return last_fertilizing_date;
    }

    public void setLast_fertilizing_date(String last_fertilizing_date) {
        this.last_fertilizing_date = last_fertilizing_date;
    }
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}

