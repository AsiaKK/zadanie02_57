public class Main {

    public static void main(String[] args) {

        Ingredient limon = new Ingredient();
        limon.name = "Green Limon";
        limon.count = 2;

        Ingredient vodka = new Ingredient();
        vodka.name = "Bachewski";
        vodka.count = 4;

        Ingredient juice = new Ingredient();
        juice.name = "Apple";
        juice.count = 6;

        Ingredient whiskey = new Ingredient();
        whiskey.name = "Jack";
        whiskey.count = 3;

        Ingredient cola = new Ingredient();
        cola.name = "Coca Cola";
        cola.count = 1;

        Drink vodkaDrink = new Drink();
        vodkaDrink.name = "First";
        vodkaDrink.price = 10.50;
        vodkaDrink.isAlcoholic = true;
        vodkaDrink.ingredient1 = vodka;
        vodkaDrink.ingredient2 = juice;
        vodkaDrink.ingredient3 = limon;

        Drink whiskeyDrink = new Drink();
        whiskeyDrink.name = "Second";
        whiskeyDrink.price = 11.50;
        whiskeyDrink.isAlcoholic = true;
        whiskeyDrink.ingredient1 = whiskey;
        whiskeyDrink.ingredient2 = cola;
        whiskeyDrink.ingredient3 = limon;

        System.out.println("Drink 1:");
        System.out.println("Name: " + vodkaDrink.name);
        System.out.println("Price: " + vodkaDrink.price);
        System.out.println("Is alcoholic: " + vodkaDrink.isAlcoholic);
        System.out.println("Ingredient 1: " + vodkaDrink.ingredient1.name);
        System.out.println("Ingredient 2: " + vodkaDrink.ingredient2.name);
        System.out.println("Ingredient 3: " + vodkaDrink.ingredient3.name);
        System.out.println("Drink size: " + (vodkaDrink.ingredient1.count + vodkaDrink.ingredient2.count + vodkaDrink.ingredient3.count));

        System.out.println();
        System.out.println("Drink 2:");
        System.out.println("Name: " + whiskeyDrink.name);
        System.out.println("Price: " + whiskeyDrink.price);
        System.out.println("Is alcoholic: " + whiskeyDrink.isAlcoholic);
        System.out.println("Ingredient 1: " + whiskeyDrink.ingredient1.name);
        System.out.println("Ingredient 2: " + whiskeyDrink.ingredient2.name);
        System.out.println("Ingredient 3: " + whiskeyDrink.ingredient3.name);
        System.out.println("Drink size: " + (whiskeyDrink.ingredient1.count + whiskeyDrink.ingredient2.count + whiskeyDrink.ingredient3.count));

    }
}
