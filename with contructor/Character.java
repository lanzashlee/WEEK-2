public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
        System.out.println("MyStrength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("MyAgility is" + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("MyIntelligence " + intelligence);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
