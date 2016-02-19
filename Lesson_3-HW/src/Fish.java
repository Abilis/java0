/**
 * Created by Abilis on 19.02.2016.
 */
public class Fish extends Animal {

        public Fish(String specie, String name, int stamina) {

            super(specie, name, stamina);

        }

        public void run100M() {

            int stamMinus = (int)(Math.random()*5 + 20); //случайно число от 20 до 25

            this.stamina = this.stamina - stamMinus;
            System.out.println(this.specie + " " + this.name + " с трудом перебирая плавниками" +
                    " преодолела сухопутную часть, и выносливость уменьшилась на " +
                    stamMinus + "%");
        }

}
