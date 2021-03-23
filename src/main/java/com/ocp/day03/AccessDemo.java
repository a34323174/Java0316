package com.ocp.day03;

import com.ocp.day03.bar.John;
import com.ocp.day03.bar.Mary;
import com.ocp.day03.foo.Bob;

public class AccessDemo {
    public static void main(String[] args) {
        John john = new John(); //John 本人使用 無須權限
        john.print();
        Mary mary = new Mary();
        mary.print();
        Bob bob = new Bob();
        bob.print();
    }
}