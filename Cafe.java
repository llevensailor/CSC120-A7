public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
  /**
   * Creates an instance of the Cafe Class
   * @param coffee
   * @param sugar
   * @param cream
   * @param cups
   * @param name
   * @param address
   * @param nFloors
   */
    public Cafe(int coffee, int sugar, int cream, int cups, String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.nCoffeeOunces = coffee;
      this.nSugarPackets = sugar;
      this.nCreams = cream;
      this.nCups = cups;
      System.out.println("You have built a cafe: ☕");
    }
  
   /**
   * Sells coffee which decreases the inventory of each item
   * @param size
   * @param nSugarPackets
   * @param nCreams
   */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
      if (this.nCoffeeOunces - size >= 0) {
        this.nCoffeeOunces -= size;
      } else if (this.nCoffeeOunces - size <= 0) {
        System.out.println("We do not have enough coffee, I'm sorry!");
        this.restock(50, 50, 50, 50);
      }
      if (this.nSugarPackets - nSugarPackets >= 0) {
        this.nSugarPackets -= nSugarPackets;
      } else if (this.nSugarPackets - nSugarPackets <= 0) {
        System.out.println("We do not have enough sugar, I'm sorry!");
        this.restock(50);
        this.restock(50, 50, 50, 50);
      }
      if (this.nCreams - nCreams >= 0) {
        this.nCreams -= nCreams;
      } else if (this.nCreams - nCreams <= 0) {
        System.out.println("We do not have enough cream, I'm sorry!");
        this.restock(50, 50, 50, 50);
      }
      if (this.nCups - 1 >= 0) {
        this.nCups = nCups - 1;
      } else if (this.nCups - 1 <= 0) {
        System.out.println("We do not have enough cups, I'm sorry!");
        this.restock(50,50);
        this.restock(50, 50, 50, 50);
      }
    }
    
    /**
     * Restocks each item when one runs out from selling coffee
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
      this.nCoffeeOunces += nCoffeeOunces;
      this.nSugarPackets += nSugarPackets;
      this.nCreams += nCreams;
      this.nCups += nCups;
      System.out.println("The new inventory is cups: " + this.nCups + " coffee: " + this.nCoffeeOunces + " sugar: " + this.nSugarPackets + " cream: " + this.nCreams);
    }

    private void restock(int nSugarPackets){
      this.nSugarPackets += nSugarPackets; 
      System.out.println("The new inventory is now sugar: " + this.nSugarPackets);
    }
    
    private void restock(int nCoffeeOunces, int nCups){
      this.nCoffeeOunces += nCoffeeOunces;
      this.nCups += nCups;
      System.out.println("The inventory is now cups: " + this.nCups + " coffee : "+ this.nCoffeeOunces);
    }

    public void showOptions(){
      System.out.println("Available options at " + this.name + ":\nrestock()\nsellCoffee(a,b,c)\n ");
    }
  
    public static void main(String[] args) {
      Cafe myCafe = new Cafe(50, 50, 50, 50, "Cafe", "1234", 2);
      myCafe.sellCoffee(12, 2, 15);
      myCafe.sellCoffee(12, 2, 15);
      myCafe.sellCoffee(12, 2, 15);
      myCafe.sellCoffee(12, 2, 15);
      myCafe.sellCoffee(12, 2, 15);
      myCafe.showOptions();
    }
  
  }