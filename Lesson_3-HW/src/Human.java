/**
 * Created by Abilis on 19.02.2016.
 */
public class Human extends Animal {

    public Human(String specie, String name, int stamina) {

        super(specie, name, stamina);

    }

    @Override
    public void showAnimalDocs() {

        this.stamina = this.stamina - stamMinusMany;

        if (!staminaIs0()) {

            System.out.println(this.specie + " " + this.name + " не понимает, что делать." +
                    " У него нет документов животного. В результате сильных душевных страданий" +
                    " выносливость уменьшается на " +
                    stamMinusMany + "%");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }

}
