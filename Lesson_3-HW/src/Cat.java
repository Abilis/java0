/**
 * Created by Abilis on 19.02.2016.
 */
public class Cat extends Animal {

    public Cat(String specie, String name, int stamina) {

        super (specie, name, stamina);

    }

    @Override
    public void swimARiver() {

        this.stamina = this.stamina - stamMinusMany;

        if (!staminaIs0()) {

            System.out.println(this.specie + " " + this.name + " как и все коты не любит плавать." +
                    " Но задание есть задание. Поэтому, потеряв  " +
                    stamMinusMany + "% выносливости " + this.name + " все же выполнил задание!");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }

    @Override
    public void stopBeAsAParrot() {

        if (!staminaIs0()) {

            this.stamina = this.stamina + stamPlus;

            if (this.stamina > 100) {
                int overStam = this.stamina - 100;
                stamPlus = stamPlus - overStam; //чтобы не было сообщения о прибавке выносливости выше 100%
                this.stamina = 100; //и чтобы она не прибавлялась
            }

            System.out.println(this.specie + " " + this.name + " радостно мурлыча, широко улыбается своей довольной мордой" +
                    " Для него перестать попугайничать - раз плюнуть. Да еще и " + stamPlus + "% выносливости прибавилось");
        }
        else {
            this.stamina = 0;
            System.out.println(this.specie + " " + this.name + " растратил все силы и сошел с дистанции!");
        }
    }




}
