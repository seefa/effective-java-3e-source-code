Item 1: **Consider Static Factory Methods Instead of Constructors**

_Key Concepts:_

* Instead of using constructors, consider using static factory methods to create instances.

* **Benefits:**
  * Better naming: Method names describe the instance being returned.
  * Code reuse & caching: They allow singleton instances, cached objects, or object pools.
  * Polymorphism & Interfaces: Can return subtypes without exposing concrete classes.
  * The class of the returned object can vary from call to call as a function of the input parameters.
  * The class of the returned object need not exist when the class containing the method is written.

**Drawbacks:**

* Not always obvious: Users might expect a new keyword.
* Cannot be subclassed if constructors are private.

Example:
```java
public static Boolean valueOf(boolean b) {
    return b ? Boolean.TRUE : Boolean.FALSE;
}
```

Instead of always using constructors (new keyword), static factory methods can be a better choice.

**Advantages:**

  * Better Naming: Improves code readability (e.g., List.of() instead of new ArrayList<>()).
  * Can Return Cached or Pre-Existing Objects: Avoids unnecessary object creation.
  * Allows Return of Subtypes: Increases flexibility in API design.

Footage:

1. this topic isn't the same as Factory Method pattern from Design Patterns(Gamma95)
2. This method prevents creating unnecessary objects from target Class type.
3. EnumSet class has no public constructor only static factories
4. In the OpenJDK implementation, they return an instance of one of two subclasses, depending on the size of the underlying enum type: if it has sixty- four or fewer elements, as most enum types do, the static factories return a RegularEnumSet instance, which is backed by a single long; if the enum type has sixty-five or more elements, the factories return a JumboEnumSet instance, backed by a long array.
5. Flexible static factory methods form the basis of service provider frameworks, like the Java Database Connectivity API (JDBC). A service provider framework is a system in which providers implement a service, and the system makes the implementations available to clients, decoupling the clients from the implementations.
6. Three essential components in a service provider framework:
   * a **service interface**, which represents an implementation
   * a **provider registration** API, which providers use to register implementations 
   * a **service access API**, which clients use to obtain instances of the service
7. In the case of JDBC, Connection plays the part of the service interface
   * DriverManager.registerDriver is the provider registration API
   * DriverManager.getConnection is the service access API
   * Driver is the service provider interface.
8. Since Java 6, the platform includes a general-purpose **service provider** framework, **java.util.ServiceLoader**, so you needn’t, and generally shouldn’t, write your own.
9. 