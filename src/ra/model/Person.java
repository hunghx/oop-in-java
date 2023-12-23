package ra.model;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements IODataInterface {


    // có 2  thành phần trong lớp
    // thứ nhất : thuộc tính - Property
    // biến instance
    private double height ;
    private double weight ;

    // thứ hai : phương thức - method
    public void move(){
        System.out.println("moving .....");
    }

    // phương thúc khởi tạo : constructors
    public Person(){

    }
    public Person(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(String name){

    }
    public Person(int age){

    }
    public Person(int age,int name){

    }

    // tạo getter / setter


     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     @Override
     public void inputData(Scanner sc) {
         System.out.println(" Hãy nhập chiều cao của đối tượng");
         this.height = sc.nextDouble();
         System.out.println(" Hãy nhập cân nặng của đối tượng");
         this.weight = sc.nextDouble();
     }

     @Override
     public void displayData() {
         System.out.println("Person value : height -"+ height +" _ weight - "+weight);
     }

 }