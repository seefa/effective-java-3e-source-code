Item 2: **Consider a Builder When Faced with Many Constructor Parameters**

Key Concepts:

When a class has many optional parameters, constructors can become confusing and hard to read.

Solutions:

1. Telescoping Constructor Pattern (Not Recommended)

    Hard to maintain as parameters increase.

    ```java
    public class NutritionFacts {
        private final int servingSize;
        private final int calories;
    
        public NutritionFacts(int servingSize) { this(servingSize, 0); }
        public NutritionFacts(int servingSize, int calories) { ... }
    }
    ```

1. JavaBeans Pattern (Mutable, not thread-safe)

    Allows inconsistency since the object is mutable.

    ```java
    NutritionFacts nf = new NutritionFacts();
    nf.setServingSize(240);
    nf.setCalories(100);
    ```

1. Builder Pattern (Recommended)

    ```java
    public class NutritionFacts {
        private final int calories;
        private final int fat;

        public static class Builder {
            private int calories = 0;
            private int fat = 0;

            public Builder calories(int val) { this.calories = val; return this; }
            public Builder fat(int val) { this.fat = val; return this; }
            public NutritionFacts build() { return new NutritionFacts(this); }
        }

        private NutritionFacts(Builder builder) {
            calories = builder.calories;
            fat = builder.fat;
        }
    }

    // Usage
    NutritionFacts nf = new NutritionFacts.Builder().calories(100).fat(5).build();
    ```