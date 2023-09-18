package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  public static void main(){
    HelloWorld w=new HelloWorld();
    w.sayHello();
    w.notCovered();
  }
}
