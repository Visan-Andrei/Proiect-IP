public class Panda extends Animal{
    @Override
    public void play(String toy) {
        System.out.println("The panda plays with " + toy);
    }
    public void eat(String food) {
        System.out.println("The panda eats " + food);
    }

    @Override
    public void roar() {
        System.out.println("The young baby panda is making squeaking noises..");
    }
    @Override
    public String print() {
        return "panda";
    }
}