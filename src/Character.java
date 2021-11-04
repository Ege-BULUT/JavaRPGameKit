import java.util.ArrayList;

public class Character {

    public String NAME, CLASS;

    private ArrayList<Item> items = new ArrayList<>();

    // str - hp - mp - cha
    private int[] stats = new int[] {1,1,1,1};

    private int total_defence = 0;

    // dmg - health - mana - charisma bonus - total defence
    private float[] c_stats = new float[] { stats[0]*10,stats[1]*100,stats[2]*100,stats[3]*2, total_defence };

    public Character(String NAME, String CLASS){
        this.NAME = NAME;
        this.CLASS = CLASS;
    }

    public void equip(Item item){
        this.items.add(item);
        updateArmor();
    }

    public void unequip(Item item){
        this.items.remove(item);
        updateArmor();
    }

    private void updateArmor(){
        int armor = 0;
        for (Item item : items){
            armor += item.getArmorPoint();
        }
        total_defence = armor;
        updateC_Stats();
    }

    private void updateC_Stats(){
        c_stats = new float[]{stats[0]*10,stats[1]*100,stats[2]*100,stats[3]*2, total_defence};
    }

    public int getTotalArmor(){
        return total_defence;
    }

    public ArrayList<Item> getEquipment(){
        return items;
    }

}
