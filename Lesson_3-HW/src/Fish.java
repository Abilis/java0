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

        if (!staminaIs0()) {

            System.out.println(this.specie + " " + this.name + " с трудом перебирая плавниками" +
                    " преодолела сухопутную часть, и выносливость уменьшилась на " +
                    stamMinusMany + "%");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратила все силы и сошла с дистанции!");
        }
    }

    @Override
    public void climbOnHill() {

        this.stamina = this.stamina - stamMinusMany;

        if (!staminaIs0()) {

            System.out.println(this.specie + " " + this.name + " с трудом перебирая плавниками" +
                    " все же взобралась на гору, но ее выносливость уменьшилась на " +
                    stamMinusMany + "%");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратила все силы и сошла с дистанции!");
        }
    }

    @Override
    public void swimARiver() {

        if (!staminaIs0()) {

            this.stamina = this.stamina + stamPlus;

            if (this.stamina > 100) {
                int overStam = this.stamina - 100;
                stamPlus = stamPlus - overStam; //чтобы не было сообщения о прибавке выносливости выше 100%
                this.stamina = 100; //и чтобы она не прибавлялась
            }

            System.out.println("Не зря говорят \"Как рыба в воде\". " + this.specie + " " + this.name +
                    " легко проплыла туда и обратно три раза, да еще и отдохнула, увеличив свою выносливость на " +
                    stamPlus);
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратила все силы и сошла с дистанции!");
        }
    }

    @Override
    public void makeASound() {

        this.stamina = this.stamina - stamMinusMany;

        if (!staminaIs0()) {

            System.out.println("К сожалению, " + this.specie + " " + this.name + " не смогла ничего издать," +
                    " поэтому из-за острой неуверенности в своих силах потеряла " +
                    stamMinusMany + "% выносливости");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратила все силы и сошла с дистанции!");
        }
    }

}