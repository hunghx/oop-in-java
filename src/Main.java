import ra.model.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1;
        person1 = new Person(1.8,80);
        Person person2 = new Person(1.9,90);
        Person person3 = new Person();
        person2.setHeight(1.5);
//        System.out.println("Giá trị các thuộc tính cua person3 : height -"+ person3.getHeight()+" _ weight - "+person3.getWeight());
//        System.out.println("Giá trị các thuộc tính cua person2 : height -"+ person2.getHeight()+" _ weight - "+person2.getWeight());

//         nhập vào dữ liệu
//          person3.inputData(sc);
//          person3.displayData();
//        person2.inputData(sc);


//        Shape shape = new Shape();
//        shape.setColor("Red");
//        shape.setCount(10);
//        System.out.println("count :" +shape.getCount());


//        Circle circle = new Circle(3.5,10,2.5);
//        System.out.println(circle);

        PersonCrud p1 = new PersonCrud();
        p1.getPersonList().add(person2);
        PersonCrud p2 = new PersonCrud();
        System.out.println(p1.getPersonList());
        System.out.println(p2.getPersonList());

//         PersonCrud.personList = new ArrayList<>();
//         PersonCrud.personList.add(person2);

//         Person person = new Person(100); // câp phat vùng nhớ
//         int result  = Calculator.sum(1,2,3);
//         System.out.println("result " + result);
    }
}