public class Wolf extends Animal{
    @Override
    public void play(String toy) {
        System.out.println("The wolf plays with " + toy);
    }
    public void eat(String food) {
        System.out.println("The wolf eats " + food);
    }

    @Override
    public void roar() {
        System.out.println("The wolf howls..");
    }

    @Override
    public String print() {
        return "wolf";
    }
}