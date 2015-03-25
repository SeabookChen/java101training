# Java Collections

## Collections Overview Class Diagram
![Collection Class Diagram][collection-class-diagram]

  - [More Java Collections Class Diagram](http://www.karambelkar.info/2012/06/java-collections-uml-class-diagrams.html)

## List
  - [List Class Diagram](http://static.karambelkar.info/static/java_collections/Java-Collections_API-List-ImageMap.html)
  - An ordered collection (also known as a sequence)
  - Allow duplicate elements
  - **ArrayList**
    - The most common used one of collections in Java
    - Similar to Array, but more advanced feature
    - auto increase the capacity
    - etc

## Generics
  - How to use generics
  ```java
  List<String> strings = new ArrayList<String>();
  List<Car> cars = new ArrayList<Car>();
  ```

## Set
  - [Set Class Diagram](http://static.karambelkar.info/static/java_collections/Java-Collections_API-Set-ImageMap.html)
  - Not Sequence guranteed
  - A collection that contains no duplicate elements
  - **HashSet**
    - use hash algorithm to determine where the elements to be hold
    - hashcode and equals


## Map
 - [Map Class Diagram](http://static.karambelkar.info/static/java_collections/Java-Collections_Map-API-ImageMap.html)
 - Key -> Value Pair
 - It's very common and very useful collections you will find.
### HashMap
  - Hash Implementation

## Others
  - Stack
  - Queue
  - LinkedList
  - LinkedHashSet
  - TreeSet

## Iteration
  - Iterator
  - How to iterate the collections

## Comparation
  - How to sort a collection
  - Comparator and comparable


## Tips, tricks, continue reading
  - Quickly create a list with values;
  ```java

    // This is slow
    List<String> names = new ArrayList<>();
    names.add("seabook");
    names.add("Wann");
    names.add("Rach");

    // This is good
    List<String> names = Arrays.asList("Seabook", "wann", "Rach");
  ```
  - Collections
  - CollectionUtils
  - [google collections guava](https://github.com/google/guava)
  - Others


[collection-class-diagram]: http://static.karambelkar.info/static/java_collections/Java-Collections_API-Collection.png
[map-class-diagram]: http://static.karambelkar.info/static/java_collections/Java-Collections_Map-API.png