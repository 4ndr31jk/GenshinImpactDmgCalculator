public class Calculate {
    public static int constanta = 200;

    public static float attack(float base, float percentage,float flat){
        float constanta_percentage = (1+percentage/100);
        float atk = base * constanta_percentage+ flat;
        return atk;
    }
    public static float multiplier(float charlv, float lvmonster){
        float constanta_charlv = charlv +100;
        float constanta_monsterlv = charlv + lvmonster + constanta;
        float defmul = constanta_charlv / constanta_monsterlv;
        return defmul;
    }
    public static float damage(  float atk, float ability, float bonus){
        float constanta_ability = ability/100;
        float constanta_bonus = 1 + bonus/100;
        float dmg = atk * constanta_ability * constanta_bonus;
        return dmg;
    }
    public static int result(float dmg,float multiplier, float res){
        float constanta_res = res/100;
        float damage = dmg * multiplier * constanta_res;
        return (int)damage;
    }
}
