/**
 * Created by Abilis on 19.02.2016.
 */
public class Fish extends Animal {

    public Fish(String specie, String name, int stamina) {
        super(specie, name, stamina);

    }

    @Override
    public void run100M() {

        this.stamina = this.stamina - stamMinusMany;
        System.out.println(this.specie + " " + this.name + " с трудом перебирая плавниками" +
                " преодолела сухопутную часть, и выносливость уменьшилась на " +
                stamMinusMany + "%");
    }

    @Override
    public void climbOnHill() {

        this.stamina = this.stamina - stamMinusMany;
        System.out.println(this.specie + " " + this.name + " с трудом перебирая плавниками" +
                " все же взобралась на гору, но ее выносливость уменьшилась на " +
                stamMinusMany + "%");
    }

    @Override
    public void swimARiver() {

        this.stamina = this.stamina + stamPlus;
        System.out.println("Не зря говорят \"Как рыба в воде\". " + this.specie + " " + this.name +
                " легко проплыла туда и обратно три раза, да еще и отдохнула, увеличив свою выносливость на " +
                stamPlus);

    }

}