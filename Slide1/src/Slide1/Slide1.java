package Slide1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Slide1 {
	public static void main(String[] args) {
        System.out.println("33 PS48509 Phạm Minh Triết");
//       Xe xe = new Xe();
//        xe.setHangXe("Toyota");
//        xe.setNamSanXuat(2026);
//        System.out.println(xe.toString());
        
//        Xe xe2 = new Xe("Honda",2000);
//        System.out.println(xe2.toString());
//        MayTinh mayTinh = new MayTinh();
//        System.out.println(mayTinh.tinhTong(3,5));
//        System.out.println(mayTinh.tinhTong(3.5 , 5) );
//        System.out.println(mayTinh.tinhTong(3, 5 ,6));
        
        ArrayList<Animal> listAnimal = new ArrayList<Animal>();
        listAnimal.add(new Dog("Phúc",90));
        listAnimal.add(new Cat("Hiếu",18));
        for(Animal a : listAnimal) {
                a.eat();
                a.sleep();
                a.sound();
                
    }
    }
}
