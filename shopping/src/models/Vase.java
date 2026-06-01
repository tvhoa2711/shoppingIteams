package models;

import java.util.Scanner;

public class Vase extends Item {
    private double height;
    private String material;
    private static final Scanner sc = new Scanner(System.in);
    
    public Vase() {
        super();
        this.height = 0.0;
        this.material = "No data";
    }
    
    public Vase(double value, String creator, double height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
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
                System.out.print("Input Height: ");
                double h = Double.parseDouble(sc.nextLine());
                if (h >= 0) {
                    this.height = h;
                    break;
                }
                System.out.println("Height must be non-negative!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        
        System.out.print("Input Material: ");
        this.material = sc.nextLine();
    }
    
    public void outputData() {
        System.out.printf("|%-15.2f|%-15s|%-15.2f|%-15s|\n", 
                           getValue(), getCreator(), height, material);
    }
}
