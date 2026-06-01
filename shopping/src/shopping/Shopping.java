package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Painting;
import models.Statue;
import models.Vase;
import menu.Menu;

public class Shopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vase> vaseList = new ArrayList<>();
        List<Statue> statueList = new ArrayList<>();
        List<Painting> paintList = new ArrayList<>();
        
        int A1, B1, C1, D1;
        try {
            do {
                Menu.mainMenu();
                System.out.print("Choose your option (0-3): ");
                A1 = Integer.parseInt(sc.nextLine());
                switch (A1) {
                    case 1:
                        do {
                            Menu.vaseMenu();
                            System.out.print("Choose Vase option (0-2): ");
                            B1 = Integer.parseInt(sc.nextLine());
                            switch (B1) {
                                case 1:
                                    Vase newVase = new Vase();
                                    newVase.inputData();
                                    vaseList.add(newVase);
                                    System.out.println("Vase added successfully!");
                                    break;
                                case 2:
                                    System.out.println("\n--- VASE LIST ---");
                                    System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n", "Value", "Creator", "Height", "Material");
                                    for (Vase v : vaseList) {
                                        v.outputData();
                                    }
                                    System.out.println();
                                    break;
                            }
                        } while (B1 != 0);
                        break;
                    case 2:
                        do {
                            Menu.statueMenu();
                            System.out.print("Choose Statue option (0-2): ");
                            C1 = Integer.parseInt(sc.nextLine());
                            switch (C1) {
                                case 1:
                                    Statue newStatue = new Statue();
                                    newStatue.inputData();
                                    statueList.add(newStatue);
                                    System.out.println("Statue added successfully!");
                                    break;
                                case 2:
                                    System.out.println("\n--- STATUE LIST ---");
                                    System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n", "Value", "Creator", "Weight", "Color");
                                    for (Statue s : statueList) {
                                        s.outputData();
                                    }
                                    System.out.println();
                                    break;
                            }
                        } while (C1 != 0);
                        break;
                    case 3:
                        do {
                            Menu.paintingMenu();
                            System.out.print("Choose Painting option (0-2): ");
                            D1 = Integer.parseInt(sc.nextLine());
                            switch (D1) {
                                case 1:
                                    Painting newPaint = new Painting();
                                    newPaint.inputData();
                                    paintList.add(newPaint);
                                    System.out.println("Painting added successfully!");
                                    break;
                                case 2:
                                    System.out.println("\n--- PAINTING LIST ---");
                                    System.out.printf("|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|\n", 
                                            "Value", "Creator", "Height", "Width", "Watercolor", "Framed");
                                    for (Painting p : paintList) {
                                        p.outputData();
                                    }
                                    System.out.println();
                                    break;
                            }
                        } while (D1 != 0);
                        break;
                }
            } while (A1 != 0);
        } catch (NumberFormatException e) {
            System.out.println("Invalid menu choice! Please run the program again.");
        } finally {
            sc.close(); // Đóng Scanner sạch sẽ để tránh Resource Leak
        }
    } 
}
