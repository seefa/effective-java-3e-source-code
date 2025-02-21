Item 1: **Consider Static Factory Methods Instead of Constructors**

Key Concepts:

* Instead of using constructors, consider using static factory methods to create instances.
* Benefits of static factory methods:
  * Better naming: Method names describe the instance being returned.
  * Code reuse & caching: They allow singleton instances, cached objects, or object pools.
  * Polymorphism & Interfaces: Can return subtypes without exposing concrete classes.

Example:
```java
public static Boolean valueOf(boolean b) {
    return b ? Boolean.TRUE : Boolean.FALSE;
}
```

This method prevents creating unnecessary Boolean objects.

Drawbacks:

* Not always obvious: Users might expect a new keyword.
* Cannot be subclassed if constructors are private.

Instead of always using constructors (new keyword), static factory methods can be a better choice.

Advantages:

  * Better Naming: Improves code readability (e.g., List.of() instead of new ArrayList<>()).
  * Can Return Cached or Pre-Existing Objects: Avoids unnecessary object creation.
  * Allows Return of Subtypes: Increases flexibility in API design.