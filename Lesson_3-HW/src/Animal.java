/**
 * Created by Abilis on 19.02.2016.
 */
public abstract class Animal {

    protected String specie;
    protected String name;
    protected int stamina;

    public Animal(String specie, String name, int stamina) {

        this.specie = specie;
        this.name = name;
        this.stamina = stamina;

    }

    public void getInfo() {
        System.out.println("Вид: " + this.specie + ", имя: " + this.name + ", выносливость: " + this.stamina + "%");
    }

    public void run100M() {
        int stamMinus = (int)(Math.random()*5 + 3); //случайно число от 3 до 8

        this.stamina = this.stamina - stamMinus;
        System.out.println(this.specie + " " + this.name + " без труда преодолел это препятствие, но его выносливость уменьшилась на " +
        stamMinus + "%");
    }

}
