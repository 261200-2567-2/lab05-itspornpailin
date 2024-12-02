public class Lab05 {
    public static void main (String[] args) {
        Character knight = new Character("Sam","knight");
        Character mage = new Character("Sebastian","mage");
        Equipment none = new Equipment("none","none");

        knight.stats(knight,none);
        Character.getStats(knight);
        knight.attack();
        knight.magic();
        knight.defend();
        Character.getStats(knight);

        mage.stats(mage,none);
        Character.getStats(mage);
        mage.attack();
        mage.magic();
        mage.defend();
        Character.getStats(mage);

        hit(knight,mage);
        System.out.println("- after the fight stats -");
        Character.getStats(knight);
        Character.getStats(mage);
    }

    public static void hit (Character a, Character b) {
        if (a.charAtk > b.charDef) {
            if (a.charSpd > b.charSpd) {
                b.maxHP -= 5;
            } else {
                a.maxHP -= 7;
            }
        } else if (b.charAtk > a.charDef) {
            if (b.charSpd > a.charSpd) {
                a.maxHP -= 5;
            } else {
                b.maxHP -= 7;
            }
        }
    }
}
