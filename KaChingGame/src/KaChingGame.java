/*
 * Project KaChing!Game
 * 
 * This a Java project about a so called game KaChing
 * In this we let 2 Player count till 31
 * For each multiple of 3 the player talking says "ka"
 * For each multiple of 5 the player talking says "ching"
 * Meaning for each multiple of 15 the talking player says
 * "ka-ching"
 * @author Nemanja Stojicevic 07/12/2022
 */
public class KaChingGame {
	
	static String player;
	
    public static void main(String[] args) {
        for (int i = 1; i <= 31;i++){
            if (i % 3 == 0 && !(i % 5 == 0)) {
               player = "ka";
               System.out.println(player);
            } else if (i % 5 == 0 && !(i % 3==1)) {
            	player = "ching";
            	System.out.println(player);
            } else if (i % 15 == 0) {
                player = "ka-ching";
                System.out.println(player);
            } else {
                System.out.println(i);
            }
        }
    }
}