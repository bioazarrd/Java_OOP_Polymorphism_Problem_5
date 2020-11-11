package D_JavaAdvancedOOP.Lecture5_Polymorphism.LabProblem3;
public class Cat extends Animal {


    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }





    @Override
    public String explainSelf() {
        return super.explainBase() + "\nMEEOW";
    }
}
