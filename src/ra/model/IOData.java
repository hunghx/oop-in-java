package ra.model;

import java.util.Scanner;

public abstract class IOData {
    private int count;
    private String color;
    // định nghĩa các phương thức trừu tượng
    public final double PI = 3.14;
    public abstract void inputData(Scanner sc);
    public abstract void displayData();

    // getter setter

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
