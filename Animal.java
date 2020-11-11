package D_JavaAdvancedOOP.Lecture5_Polymorphism.LabProblem3;
public abstract class Animal {

    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    protected final String explainBase() {
        return String.format("I am %s and my favourite food is %s",
                this.name,
                this.favouriteFood);
    }


    public abstract String explainSelf();



}
