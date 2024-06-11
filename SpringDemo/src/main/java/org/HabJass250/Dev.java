package org.HabJass250;

public class Dev {
    private computer comp;
    private  int age;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev constructor 1");
    }

    public computer getComp() {
        return comp;
    }

    public void setComp(computer comp) {
        this.comp = comp;
    }
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public    void Build(){

        System.out.println("Let us Build an App Project");
    }
}
