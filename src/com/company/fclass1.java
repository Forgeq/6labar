package com.company;

public class fclass1 {      // Частный модификатор принадлежит только тому классу, где он был объявлен.

    private void method() {
        System.out.println("Класс с методом main()");
    }

    public static void main(String[] args) {
        new fclass1().method();
        new fclass2().method();
        new fclass3().method();
    }
}

class fclass3 extends fclass1 {
    protected void method(){
        System.out.println("Разширение класса fclass1");
    }
}

class fclass2 extends fclass3 {
    public void method() {
        System.out.println("Разширение класса fclass3");
    }
}