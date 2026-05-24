import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {
    private int strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;
    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> copy = new ArrayList<>(scores); 
        Collections.sort(copy);
        return copy.get(1) + copy.get(2) + copy.get(3);
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            int roll = random.nextInt(6) + 1;
            scores.add(roll);
        }
        return scores;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() { return this.strength;}
    int getDexterity() { return this.dexterity;}
    int getConstitution() {return this.constitution;}
    int getIntelligence() {return this.intelligence;}
    int getWisdom() {return this.wisdom;}
    int getCharisma() {return this.charisma;}
    int getHitpoints() {return this.hitpoints;}
}
