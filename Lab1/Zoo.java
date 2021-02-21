import java.util.ArrayList;
public class Zoo {
    public ArrayList<Animal> zoo= new ArrayList<Animal>();
    public void adauga (Animal a)
    {
        zoo.add(a);
    }
    public static void main(String[] args) {
        Fox f= new Fox();
        Wolf w= new Wolf();
        Panda p= new Panda();
        Zoo z= new Zoo();
        z.adauga(f);
        z.adauga(w);
        z.adauga(p);
        System.out.println("The animals inside the zoo are: ");
        for(int i=0; i<z.zoo.size(); i++)
        {
            System.out.println(z.zoo.get(i).print());
        }
        System.out.println("They seem rather active today..");
        f.eat("chicken");
        w.play("his tail");
        f.roar();
        p.play("other pandas");
        p.roar();


    }

}