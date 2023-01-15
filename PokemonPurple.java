package pokemon;

/**
 *
 * @author nagui
 */
public class PokemonPurple {

    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Feniken",20,
                "Fire",10,150);
        Pokemon p2 = new Pokemon("Shinx", 22,
                "Electric", 8, 180);
        if(p2.equals(p1))
        p1.writeOutput();
        p2.writeOutput();
        int count = 0;
        while(p1.getHitPoints()>0 && p2.getHitPoints() >0)
            //Fight while both above 0
        {
            System.out.println("Round "+count+": Fight!");
            p1.attack(p2);
            if(p2.getHitPoints()<=0)
            {
                break;
            }
            p2.attack(p1);
            count++;
        }
        if(p1.getHitPoints()<=0)
        {
            System.out.println(p2.getName()+" won!");
            System.out.println("Must be sad!");
        }
        else {
            System.out.println(p1.getName()+ "won!");
            System.out.println( "Siiiiiiuu!");

        }
    }
}
