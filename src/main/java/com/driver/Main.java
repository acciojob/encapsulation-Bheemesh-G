package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
     //   r.name = 10;
     //   System.out.println(r.name);
        // name has private access in com.driver.RWOnly
        r.setter(10);
        r.getter();
    }
  
}