package ra.model;

import java.util.Scanner;

public class Shape extends IOData{
    private double chuVi,dienTich;
    // contructor

    public Shape() {
    }

    public Shape(double chuVi, double dienTich) {
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập chu vi");
        this.chuVi = sc.nextDouble();
        System.out.println("Nhập diện tích");
        this.dienTich = sc.nextDouble();

    }

    @Override
    public void displayData() {
        System.out.println("Chu vi là :"+chuVi+ " - Diện tích là :"+dienTich);
    }

}
