package entity;


public class Section {
    private String name;//name of the section
    private String class_days;
    private String class_time_slot;    
    
    public Section() {
        
    }

    public Section(String name) {
        this.name = name;
    }

    
    public Section(String name, String class_days, String class_time_slot) {
        this.name = name;
        this.class_days = class_days;
        this.class_time_slot = class_time_slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_days() {
        return class_days;
    }

    public void setClass_days(String class_days) {
        this.class_days = class_days;
    }

    public String getClass_time_slot() {
        return class_time_slot;
    }

    public void setClass_time_slot(String class_time_slot) {
        this.class_time_slot = class_time_slot;
    }       
}
