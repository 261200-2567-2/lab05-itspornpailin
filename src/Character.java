public class Character implements Job {
    public String charName, charJob;
    public double maxHP, maxMP, charAtk, charDef, charSpd, charLvl, charExp;
    
    Character(String charName, String charJob) {
        this.charName = charName;
        this.charJob = charJob;
    }

    
    public void stats(Character c, Equipment e) {
        if (c.charJob.equalsIgnoreCase("Knight")) {
            c.maxHP = 150 + (1.5 * c.charLvl);
            if (e.equipmentType.equalsIgnoreCase("Ring")) {
                c.maxMP = 50 + (0.2 * c.charLvl) + e.boostMP;
            } else {
                c.maxMP = 50 + (0.2 * c.charLvl);
            }
            c.charAtk = 100 + (3 * c.charLvl);
            c.charDef = 75 + (1.5 * c.charLvl);
            if (e.equipmentType.equalsIgnoreCase("Boots")) {
                c.charSpd = 5 + (0.08 * c.charLvl) + e.boostSpd;
            } else {
                c.charSpd = 5 + (0.08 * c.charLvl);
            }
        }
        if (c.charJob.equalsIgnoreCase("Mage")) {
            c.maxHP = 100 + (1 * c.charLvl);
            if (e.equipmentType.equalsIgnoreCase("Ring")) {
                c.maxMP = 150 + (3.5 * c.charLvl) + e.boostMP;
            } else {
                c.maxMP = 150 + (3.5 * c.charLvl);
            }
            c.charAtk = 75 + (1.5 * c.charLvl);
            c.charDef = 50 + (1 * c.charLvl);
            if (e.equipmentType.equalsIgnoreCase("Boots")) {
                c.charSpd = 3 + (0.04 * c.charLvl) + e.boostSpd;
            } else {
                c.charSpd = 3 + (0.04 * c.charLvl);
            }
        }
    }
    
    public void attack() {
        if (charJob.equalsIgnoreCase("Knight")) {
            charAtk = charAtk + (30 * (charLvl + 1));
            System.out.println("ATK UP: " + charAtk);
        } else {
            System.out.println("KNIGHT ONLY");
        }
    }

    public void magic() {
        if (charJob.equalsIgnoreCase("Mage")) {
            charAtk = charAtk + (20 * (charLvl + 1));
            charDef = charDef + (10 * (charLvl + 1));
            System.out.println("ATK UP: " + charAtk);
            System.out.println("DEF UP: " + charDef);
        } else {
            System.out.println("MAGE ONLY");
        }
    }

    public void defend() {
        if (charJob.equalsIgnoreCase("Knight")) {
            charDef = charDef + (50 * (charLvl + 1));
            System.out.println("DEF UP: " + charDef);
        }
        if (charJob.equalsIgnoreCase("Mage")) {
            charDef = charDef + (35 * (charLvl + 1));
            System.out.println("DEF UP: " + charDef);
        }
    }

    public static void getStats(Character c) {
        System.out.println("Stats: ");
        System.out.println("Name: " + c.charName);
        System.out.println("HP: " + c.maxHP);
        System.out.println("MP: " + c.maxMP);
        System.out.println("ATK: " + c.charAtk);
        System.out.println("DEF: " + c.charDef);
        System.out.println("SPD: " + c.charSpd);
        System.out.println("LVL: " + c.charLvl);
    }
}
