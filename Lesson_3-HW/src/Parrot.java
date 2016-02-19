/**
 * Created by Abilis on 19.02.2016.
 */
public class Parrot extends Animal {

    public Parrot(String specie, String name, int stamina) {

        super(specie, name, stamina);

    }

    @Override
    public void makeASound() {

        if (!staminaIs0()) {

            this.stamina = this.stamina + stamPlus;
            System.out.println(this.specie + " " + this.name + " с радостью начал щебетать, а потом еще и стал" +
                    " подражать другим участникам, в результате чего прибавил " + stamPlus + "% выносливости");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }

}
