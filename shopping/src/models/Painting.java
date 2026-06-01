package models;

import java.util.Scanner;

public class Painting extends Item {
    private double height;
    private double width;
    private boolean isWatercolor;
    private boolean isFramed;
    private static final Scanner sc = new Scanner(System.in);
    
    public Painting() {
        super();
        this.height = 0.0;
        this.width = 0.0;
        this.isWatercolor = false;
        this.isFramed = false;
    }
    
    public Painting(double value, String creator, 
                    double height, double width, 
                    boolean isWatercolor, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolor = isWatercolor;
        this.isFramed = isFramed;
    }

    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isIsWatercolor() {
        return isWatercolor;
    }
    
    public void setIsWatercolor(boolean isWatercolor) {
        this.isWatercolor = isWatercolor;
    }

    public boolean isIsFramed() {
        return isFramed;
    }
    
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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
        
        while (true) {
            try {
                System.out.print("Input Width: ");
                double w = Double.parseDouble(sc.nextLine());
                if (w >= 0) {
                    this.width = w;
                    break;
                }
                System.out.println("Width must be non-negative!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        
        while (true) {
            System.out.print("Input Watercolor (true/false): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                this.isWatercolor = Boolean.parseBoolean(input);
                break;
            }
            System.out.println("Please input only 'true' or 'false'.");
        }
        
        while (true) {
            System.out.print("Input Framed (true/false): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                this.isFramed = Boolean.parseBoolean(input);
                break;
            }
            System.out.println("Please input only 'true' or 'false'.");
        }
    }
    
    public void outputData() {
        System.out.printf("|%-15.2f|%-15s|%-15.2f|%-15.2f|%-15b|%-15b|\n", 
                           getValue(), getCreator(), height, width,
                           isWatercolor, isFramed);
    }
}
