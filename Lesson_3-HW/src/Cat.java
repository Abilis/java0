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
        System.out.println(this.specie + " " + this.name + " как и все коты не любит плавать." +
                " Но задание есть задание. Поэтому, потеряв  " +
                stamMinusMany + "% выносливости " + this.name + " все же выполнил задание!");

    }




}
