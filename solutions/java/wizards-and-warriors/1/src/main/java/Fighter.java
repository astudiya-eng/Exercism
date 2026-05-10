class Fighter {

   boolean isVulnerable() {
        return true;
    }

   int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    private final int damageToVulnerable = 10;
    private final int damageToInvulnerable = 6;
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? damageToVulnerable : damageToInvulnerable;
    }
}

class Wizard extends Fighter{
    private boolean spell = false;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        spell = true;
    }
    @Override
    public boolean isVulnerable(){
        return !spell;
    }
    @Override
    public int getDamagePoints(Fighter fighter){
        return spell ? 12 : 3;
    }
}
