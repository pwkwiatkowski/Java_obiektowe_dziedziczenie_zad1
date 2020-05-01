package com.company;

public class Main {

    public static void main(String[] args) {
        Podstawowa b1 = new Podstawowa();
        b1.f();
        b1.g();

        System.out.println();

        Pochodna d1 = new Pochodna();
        d1.f();
        d1.g();
        d1.h();

        Podstawowa b2 = new Pochodna();
        b2.f();
        b2.g();
    }
}

class Podstawowa {
    public void f() {
        System.out.println("f w Podstawowa");
    }
    public void  g() {
        System.out.println("g w Podstawowa");
    }
}

class Pochodna extends Podstawowa {
    public void g() {
        System.out.println("g w Pochodna");
    }
    public void h() {
        System.out.println("h w Pochodna");
    }
}