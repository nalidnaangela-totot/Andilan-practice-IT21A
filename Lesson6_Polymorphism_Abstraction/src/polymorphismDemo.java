// Parent class: a general food
class Food {
    protected String name;

    public Food(String name) {
        this.name = name;
    }

    // This method will be overridden by the child classes
    public void cook() {
        System.out.println(name + " is being cooked.");
    }

    public int cookingTimeMinutes() {
        return 10; // default cooking time
    }
}

// Child class 1
class Adobo extends Food {
    public Adobo() {
        super("Adobo"); // call the parent constructor
    }

    @Override
    public void cook() {
        System.out.println(name + ": Simmer the chicken in soy sauce, vinegar, and garlic.");
    }

    @Override
    public int cookingTimeMinutes() {
        return 45;
    }
}

// Child class 2
class Sinigang extends Food {
    public Sinigang() {
        super("Sinigang");
    }

    @Override
    public void cook() {
        System.out.println(name + ": Boil the pork with tomatoes and add tamarind for the sour taste.");
    }

    @Override
    public int cookingTimeMinutes() {
        return 60;
    }
}

// Child class 3
class FriedChicken extends Food {
    public FriedChicken() {
        super("Fried Chicken");
    }

    @Override
    public void cook() {
        System.out.println(name + ": Deep fry the seasoned chicken in hot oil until golden brown.");
    }

    @Override
    public int cookingTimeMinutes() {
        return 20;
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        // Parent-class references pointing to child objects
        Food food1 = new Food("Plain food");
        Food food2 = new Adobo();
        Food food3 = new Sinigang();
        Food food4 = new FriedChicken();

        System.out.println("=== Same method cook(), different behavior ===");
        food1.cook();
        food2.cook();
        food3.cook();
        food4.cook();

        System.out.println();
        System.out.println("=== Cooking time ===");
        Food[] menu = { food1, food2, food3, food4 };
        for (Food f : menu) {
            System.out.println(f.name + ": " + f.cookingTimeMinutes() + " minutes");
        }
    }
}