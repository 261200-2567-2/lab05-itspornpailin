public class Equipment implements Accessory {
    public String equipmentName, equipmentType;
    public double equipmentLvl, equipmentEXP, boostMP, boostSpd;

    public Equipment(String equipmentName, String equipmentType) {
        this.equipmentName = equipmentName;
        this.equipmentType = equipmentType;
    }

    public void boostMP(Equipment e) {
        if (e.equipmentName.equalsIgnoreCase("Ring")) {
            e.boostMP = 50 + (1 * e.equipmentLvl);
        }
    }

    public void boostSpd(Equipment e) {
        if (e.equipmentName.equalsIgnoreCase("Boots")) {
            e.boostSpd = 50 * (0.02 * e.equipmentLvl);
        }
    }
}
