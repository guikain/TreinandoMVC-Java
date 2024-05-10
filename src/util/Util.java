package util;

public class Util {
    
    private static int idMob = 1;

    public static int gerarMobID(){
        return idMob++;
    }

    public static boolean verificaNum(int num){
        if(num >= 0){
            return true;
        }
        return false;
    }
}
