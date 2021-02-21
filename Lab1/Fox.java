public class Fox extends Animal{
    @Override
    public void play(String toy) {
        System.out.println("The fox plays with " + toy);
    }
    public void eat(String food) {
        System.out.println("The fox eats " + food);
    }

    @Override
    public void roar() {
        System.out.println("What sound does the fox say? https://youtu.be/jofNR_WkoCE?t=40");
    }

    @Override
    public String print() {
        return "fox";
    }
}