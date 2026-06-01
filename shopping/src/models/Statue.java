package models;

import java.util.Scanner;

public class Statue extends Item {
    private double weight;
    private String color;
    private static final Scanner sc = new Scanner(System.in);
    
    public Statue() {
        super();
        this.weight = 0.0;
        this.color = "No data";
    }
    
    public Statue(double value, String creator, double weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void inputData() {
        while (true) {
            try {
                System.out.print("Input Value: ");
                double val = Double.parseDouble(sc.nextLine());
                if (val >= 0) {
                    setValue(val);
                    break;
                }
                System.out.println("Value must be non-negative!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        
        System.out.print("Input Creator: ");
        setCreator(sc.nextLine());
        
        while (true) {
            try {
                System.out.print("Input Weight: ");
                double w = Double.parseDouble(sc.nextLine());
                if (w >= 0) {
                    this.weight = w;
                    break;
                }
                System.out.println("Weight must be non-negative!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        
        System.out.print("Input Color: ");
        this.color = sc.nextLine();
    }
    
    public void outputData() {
        System.out.printf("|%-15.2f|%-15s|%-15.2f|%-15s|\n", 
                           getValue(), getCreator(), weight, color);
    }
}
