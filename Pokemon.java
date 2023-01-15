package pokemon;

/**
 *
 * @author nagui
 */
public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int hitPoints;
    private int attack;
    //1 Constructor with no parameters -> set stuff to some default values of your choice
    //2 constructor with 5 parameters -> set the values of the vars to the parameters
    public Pokemon()
    {
       setPokemon("No Name",1,"normal",
               10,10);
    }
    public Pokemon(String newName)
    {
        setPokemon(newName,1, "normal",
                10,10 );
    }
    public Pokemon(String newName,
                   int newLevel,
                   String newType,
                   int newAttack, int newHP)
    {
       setPokemon(newName, newLevel, newType, newAttack, newHP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttack() {
        return attack;
    }
//Mutator Method / Setter Method
    //should be public
    //Should be void
    //should have a parameter that matches the type of the variable

    /**
     * This will set the attack for a pokemon as long as it is
     * a positive value. Negative values will end the program.
     * @param attack - Attack value as an Int
     */
    public void setAttack(int attack)
    {
        if(attack <= 0)
        {
            System.out.println("Can't have a negative attack idiot...");
            System.exit(0);
        }
        else
            this.attack = attack;
    }
    public void setLevel(int newLevel){
        if(newLevel <= 0)
        {
            System.out.println("Can't have a negative level idiot...");
            System.exit(0);
        }
        else
            level = newLevel;
    }
    //Accessor Methods - Get Things
    //public
    //method will have a type that matches the variable
    //return the variable
    public int getLevel()
    {
        return level;
    }


    public void setPokemon(String newName,
                           int newLevel,
                           String newType,
                           int newAttack, int newHP)
    {
        setName(newName);
        setLevel(newLevel);
        setType(newType);
        setAttack(newAttack);
        setHitPoints(newHP);
    }

    /**
     * Prints all details for a pokemon
     */
    public void writeOutput()
    {
        System.out.println("Name: "+name);
        System.out.println("Level: "+level);
        System.out.println("Type: "+type);
        System.out.println("Attack: "+attack);
        System.out.println("Hit Points: "+hitPoints);
    }

    /**
     * Compares 2 pokemon objects to see if they are equal
     * @param otherPokemon Pokemon we are comparing calling object to
     * @return truth value of the equality
     */
    public boolean equals (Pokemon otherPokemon){
        return this.name.equals(otherPokemon.name)&&
                this.type.equals(otherPokemon.type) &&
                this.level== otherPokemon.level &&
                this.attack == otherPokemon.attack &&
                this.hitPoints==otherPokemon.hitPoints;
    }
    public void attack(Pokemon otherPokemon)
    //Attacker is calling, the defender is the parameter
    {
        int damage = 0;
        //Calculate the damage
        damage = ((int)(Math.random()*6)+1)+attack;
        //Subtract damage from otherPokemon HP
        otherPokemon.setHitPoints(otherPokemon.hitPoints-damage);
        //Print out what happens
//        System.out.println(this.name+" attacks "+otherPokemon.name
//            +" for "+damage+" "+this.type+" damage");
        System.out.printf("%s attacks %s for %d %s damage\n",
                this.name, otherPokemon.name, damage, this.type );
        //Print out remaining hp
        System.out.println(otherPokemon.name+" now has "
                +otherPokemon.getHitPoints()+" HP");
    }
}

  
