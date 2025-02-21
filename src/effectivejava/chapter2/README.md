Summary of Key Takeaways

| Item | Key Concept                                                             | 
|---|-------------------------------------------------------------------------|
| 1 | Use static factory methods instead of constructors when possible.       |
| 2 | Use the Builder Pattern for complex object creation.                    |
| 3 | Singletons should be implemented using private constructors or Enums.   |
| 4 | Use a private constructor for utility classes.                          |
| 5 | Use Dependency Injection (DI) for better flexibility.                   |
| 6 | Avoid unnecessary object creation (prefer object reuse).                |
| 7 | Nullify obsolete references to prevent memory leaks.                    |
| 8 | Avoid finalizers and cleaners (use explicit close methods).             |
| 9 | Use try-with-resources instead of try-finally for resource management.  |

📌 **Creating and Destroying Objects**

* 🏗️ **Item 1: Static Factory Methods**
  * ✅ Better naming
  * ✅ Can return cached objects
  * ✅ Can return subtypes
  * ❌ Cannot be subclassed
  * 📝 Example: Boolean.valueOf(true)

* 🏗️ **Item 2: Builder Pattern**
  * ❌ Telescoping constructors are bad
  * ❌ JavaBeans pattern is mutable
  * ✅ Builder pattern is the best choice
  * 📝 Example: NutritionFacts.Builder

* 🔒 **Item 3: Singleton Patterns**
  * ✅ Private static final instance
  * ✅ Lazy initialization with synchronized
  * ✅ Best approach: Enum Singleton
  * 📝 Example: Singleton.INSTANCE

* 🚫 **Item 4: Noninstantiability**
  * ✅ Private constructor for utility classes
  * ✅ Prevents instantiation
  * 📝 Example: UtilityClass with AssertionError

* 🔄 **Item 5: Dependency Injection**
  * ❌ Hard-coded dependencies = Bad
  * ✅ Constructor injection = Good
  * ✅ More testable and flexible
  * 📝 Example: Passing DatabaseConnection via constructor

* ♻️ **Item 6: Avoid Unnecessary Objects**
  * ❌ `new String("hello")` (bad)
  * ✅ `String s = "hello";` (good)
  * ✅ Use cached objects
  * 📝 Example: Integer.valueOf(10)

* 🗑️ **Item 7: Eliminate Obsolete References**
  * ✅ Nullify objects after use
  * ✅ Watch for memory leaks in collections
  * 📝 Example: Stack.pop() → `elements[size] = null`

* ❌ **Item 8: Avoid Finalizers & Cleaners**
  * ❌ Unpredictable and slow
  * ✅ Use `AutoCloseable`
  * 📝 Example: `try-with-resources`

* 📂 **Item 9: Prefer Try-With-Resources**
  * ❌ `try-finally` is error-prone
  * ✅ `try-with-resources` is better
  * 📝 Example: `try (FileInputStream fis = new FileInputStream("file.txt"))`