# Java Object Oriented Programming

## Interface
  - To define the behaviour
  - To define API
  - To regulate the third party implementation

## Abstract Class
  - Cant be instantiated
  - Usually use an adapter between Interface and Concrete Class to have some Common Interactions

## Inheritance - IS-A Relationship
  ```java
  public class Animal{}
  public class Mammal extends Animal{}
  public class Reptile extends Animal{}
  public class Dog extends Mammal{}
  ```

## Composition - HAS-A Relationship
  ```java
  public class Car {
    private Engine engine;
  }
  public class Engine {}
  ```

## Method Overriding
  -  Under the inheritence senario
  -  Overriding the method to have different behavior for difference sub class
  ```java

  interface AnimalCommonBehavior {
    void sound();
  }

  class Animal implements AnimalCommonBehavior {
    String name;

    public void sound() {
      System.out.println("Arah arah ...");
    }
  }

  class Dog extends Animal {

    public void sound() {
      System.out.println("Bow-wow ...");
    }

  }

  class Sheep extends Animal {

    public void sound() {
      System.out.println("Meo meo ...");
    }

  }

  ```

## Method Overloading
  - In the same class
  - Overloading happened need to have same method name, different method input params
  ```java

  public class FileUtility {

    public void readFile(String filename) {
        // ...
    }

    public void readFile(File file) {
      // ...
    }

    public void readFile(File file, UserAccessRights rights) {
      // ...
    }
  }

  ```

## Polymorphism
  - it's all about runtime
  - runtime behavior

## Encapsulation
  - encapsulate all the logics inside
  - open api to the public
  ```java

  class BakeryService {

      public Bread bake(Style style) {

        // 1. do xxx
        // 2. do xxx
        // 3. do xxx

        return bread;
      }
  }

  ```