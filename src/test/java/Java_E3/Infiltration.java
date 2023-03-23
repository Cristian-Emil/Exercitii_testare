package Java_E3;

public class Infiltration {

    public static void main(String[] args) {

        System.out.println(canFastAttack(true));
        System.out.println(canSpy(false,true,false));
        System.out.println(canSignalPrisoner (false,true));
        System.out.println(canFreePrisoner (false,true, false ,false));
    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        if(!knightIsAwake) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent == true && archerIsAwake == false){
            return true;
        } else if (petDogIsPresent == false && archerIsAwake == false  && knightIsAwake == false && prisonerIsAwake == true) {
            return true;
        } else {
            return false;
        }
    }
}