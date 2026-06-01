package models;

public class Item {
    protected double value;
    protected String creator;
    
    public Item() {
        this.value = 0.0;
        this.creator = "No data";
    }
    
    public Item(double value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    
    public double getValue() {
        return value;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
}
