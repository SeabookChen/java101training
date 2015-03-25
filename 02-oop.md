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

## Method Overloading
  - In the same class
  - Overloading happened need to have same method name, different method input params

## Polymorphism
  - it's all about runtime
  - runtime behavior

## Encapsulation
  - encapsulate all the logics inside
  - open api to the public