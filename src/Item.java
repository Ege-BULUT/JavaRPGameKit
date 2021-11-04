public class Item {

    private String name = "null";
    private int reqLvl = -1;
    private int armorPoint = 0;

    public Item(String name, int lvl, int ap){
        this.name       = name;
        this.reqLvl     = lvl;
        this.armorPoint = ap;
    }

    public int getArmorPoint(){
        return armorPoint;
    }

    @Override
    public String toString() {
        return reqLvl +"lvl "+name +" (" + armorPoint +')';
    }
}
