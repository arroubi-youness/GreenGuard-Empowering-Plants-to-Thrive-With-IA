package Models;

public class Plant_species {
    private int species_id;
    private String species_name;
    private int watering_frequency;
    private String  sunlight_needs;
    private String temperature_range;
    private String soil_type;
    private String humidity_level;
    private int  fertilizing_frequency;
    private String  fertilizing_types;


    public Plant_species() {
    }

    public Plant_species(int species_id, String species_name, int watering_frequency, String sunlight_needs,
                         String temperature_range, String soil_type, String humidity_level,
                         int fertilizing_frequency, String fertilizing_types) {
        this.species_id = species_id;
        this.species_name = species_name;
        this.watering_frequency = watering_frequency;
        this.sunlight_needs = sunlight_needs;
        this.temperature_range = temperature_range;
        this.soil_type = soil_type;
        this.humidity_level = humidity_level;
        this.fertilizing_frequency = fertilizing_frequency;
        this.fertilizing_types = fertilizing_types;
    }

     public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

     public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

     public int getWatering_frequency() {
        return watering_frequency;
    }

    public void setWatering_frequency(int watering_frequency) {
        this.watering_frequency = watering_frequency;
    }

     public String getSunlight_needs() {
        return sunlight_needs;
    }

    public void setSunlight_needs(String sunlight_needs) {
        this.sunlight_needs = sunlight_needs;
    }

     public String getTemperature_range() {
        return temperature_range;
    }

    public void setTemperature_range(String temperature_range) {
        this.temperature_range = temperature_range;
    }

     public String getSoil_type() {
        return soil_type;
    }

    public void setSoil_type(String soil_type) {
        this.soil_type = soil_type;
    }

     public String getHumidity_level() {
        return humidity_level;
    }

    public void setHumidity_level(String humidity_level) {
        this.humidity_level = humidity_level;
    }

     public int getFertilizing_frequency() {
        return fertilizing_frequency;
    }

    public void setFertilizing_frequency(int fertilizing_frequency) {
        this.fertilizing_frequency = fertilizing_frequency;
    }

     public String getFertilizing_types() {
        return fertilizing_types;
    }

    public void setFertilizing_types(String fertilizing_types) {
        this.fertilizing_types = fertilizing_types;
    }
}

