public class Main {
    public static void main(String[] args) {
        //Character and target values
        float base = 670L;
        float percentage = 57;
        float flat = 296;
        float ability = 58;
        float bonus = 100;
        float charlv = 80;
        float lvmonster = 87;
        float res = 80;

        float attack = Calculate.attack(base,percentage,flat);
        float damage = Calculate.damage(attack,ability,bonus);
        float multiplier = Calculate.multiplier(charlv,lvmonster);

        System.out.println(Calculate.result(damage,multiplier,res));
    }
}
