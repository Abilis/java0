/**
 * Created by Abilis on 19.02.2016.
 */
public abstract class Animal {

    protected int stamMinus = (int)(Math.random()*5 + 3); //случайное целое число от 3 до 8 для отнимания
    protected int stamMinusMany = (int)(Math.random()*5 + 20); //случайное целое число от 20 до 25 для отнимания
    protected int stamPlus = (int)(Math.random()*4 + 8); //случайное целое число от 8 до 12 для прибавления

    protected String specie;
    protected String name;
    protected int stamina;

    public Animal(String specie, String name, int stamina) {

        this.specie = specie;
        this.name = name;
        this.stamina = stamina;

    }

    public  void getInfo() {
        System.out.println("Вид: " + this.specie + ", имя: " + this.name + ", выносливость: " + this.stamina + "%");
    }

    public void run100M() {

        this.stamina = this.stamina - stamMinus;
        System.out.println(this.specie + " " + this.name + " без особого труда преодолел это препятствие, но его выносливость уменьшилась на " +
                            stamMinus + "%");
    }

    public void climbOnHill() {

        this.stamina = this.stamina - stamMinus;
        System.out.println(this.specie + " " + this.name + " без особого труда преодолел это препятствие, но его выносливость уменьшилась на " +
                            stamMinus + "%");

    }

    public void swimARiver() {
        this.stamina = this.stamina - stamMinus;
        System.out.println(this.specie + " " + this.name + " без особого труда преодолел это препятствие, но его выносливость уменьшилась на " +
                stamMinus + "%");
    }


    public boolean staminaIs0() {
        if (this.stamina <= 0) {
            return true;
        }

        else {
            return false;
        }
    }

}
