/**
 * Created by Abilis on 19.02.2016.
 */
public abstract class Animal {

    protected String name;
    protected String specie;
    protected int stamina;

    public Animal(String specie, String name, int stamina) {

        this.name = name;
        this.specie = specie;
        this.stamina = stamina;

    }

    public void getInfo() {
        System.out.println("Вид: " + this.specie + ", имя: " + this.name + ", выносливость: " + this.stamina + "%");
    }

}
