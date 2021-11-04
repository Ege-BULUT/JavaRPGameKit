import java.util.Scanner;
public class Main {
    static Item armor3 = new Item("Dragon Bots", 45, 2500);
    static Item armor2 = new Item("Dragon Gloves", 45, 2000);
    static Item armor4 = new Item("Dragon Helmet", 45, 5000);
    static Item armor1 = new Item("Dragon Chestplate", 45, 8000);
    static Character player1 = new Character("LordPac","Warrior");

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }
    private static void test(){

        System.out.print("\nequipment list : [");
        for(Item item : player1.getEquipment()){
            System.out.print(item.toString()+", ");
        }
        System.out.print("]");

        System.out.println( "\n1. Equip & Unequip : Dragon Chestplate " +
                            "\n2. Equip & Unequip : Dragon Gloves " +
                            "\n3. Equip & Unequip : Dragon Bots " +
                            "\n4. Equip & Unequip : Dragon Helmet " +
                            "\n5. Show Total Armor");
        switch (scan.nextLine().charAt(0)){
            case '1':
                if(player1.getEquipment().contains(armor1)){
                    player1.unequip(armor1);
                }else{
                    player1.equip(armor1);
                }
                break;
            case '2':
                if(player1.getEquipment().contains(armor2)){
                    player1.unequip(armor2);
                }else{
                    player1.equip(armor2);
                }
                break;
            case '3':
                if(player1.getEquipment().contains(armor3)){
                    player1.unequip(armor3);
                }else{
                    player1.equip(armor3);
                }
                break;
            case '4':
                if(player1.getEquipment().contains(armor4)){
                    player1.unequip(armor4);
                }else{
                    player1.equip(armor4);
                }
                break;
            case '5':
                System.out.println(player1.NAME+"'s total Armor point(s) is : "+player1.getTotalArmor());
                break;
            default:
                test();
                break;
        }
        test();
    }
}