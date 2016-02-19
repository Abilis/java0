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

            if (this.stamina > 100) {
                int overStam = this.stamina - 100;
                stamPlus = stamPlus - overStam; //чтобы не было сообщения о прибавке выносливости выше 100%
                this.stamina = 100; //и чтобы она не прибавлялась
            }

            System.out.println(this.specie + " " + this.name + " с радостью начал щебетать, а потом еще и стал" +
                    " подражать другим участникам, в результате чего прибавил " + stamPlus + "% выносливости");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }

    @Override
    public void stopBeAsAParrot() {

        this.stamina = this.stamina - stamMinusMany;

        if (!staminaIs0()) {

            System.out.println(this.specie + " " + this.name + " неудомевает." +
                    " Как ему можно перестать попугайничать, если он попугай?" +
                    " Пришлось отказаться от части своей выносливости (-" +
                    stamMinusMany + "%)");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }



}
