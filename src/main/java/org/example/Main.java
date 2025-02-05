package org.example;

public class Main {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.output();

    }
}

class MainMaster {
    public void output() {
        System.out.println("Main function");
    }
}

class Sub extends MainMaster {
    public void output() {
//        super.output();
        System.out.println("Sub class function");
    }
}
