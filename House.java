import java.util.ArrayList;
public class House extends Building {

  private ArrayList < String > residents;
  private boolean hasDiningRoom;
  private boolean hasElevator; 

  /**
   * Creates instance of House class
   * @param diningRoom
   * @param name
   * @param address
   * @param nFloors
   */
  public House(boolean diningRoom, boolean hasElevator, String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    residents = new ArrayList < String > ();
    this.hasDiningRoom = diningRoom;
    this.hasElevator = hasElevator; 

  }
  
  public House(String name, String address, int nFloors) {
    super(name, address, nFloors);
    System.out.println("You have built a house: 🏠");
    residents = new ArrayList < String > ();
  }

  /**
   * Checks if the house has a dining room 
   * @return boolean
   */
  public boolean hasDiningRoom() {
    if (hasDiningRoom) {
      return true;
    } else
      return false;
  }

  /**
   * 
   * @return number of residents that live in the home
   */
  public int nResidents() {
    return residents.size();
  }

  /**
   * Adds a person to the list of residents for the house
   * @param name
   */
  public void moveIn(String name) {
    if (!residents.contains(name)) {
      residents.add(name);
      System.out.println(name + " is now a resident.");
    } else {
      System.out.println("Already a resident");
    }
  }

  public void moveIn(String name, String name2) {
    if (!residents.contains(name)) {
      residents.add(name);
      System.out.println(name + " is now a resident.");
    } else {
      System.out.println("Already a resident");
    }
    if (!residents.contains(name2)) {
      residents.add(name2);
      System.out.println(name2 + " is now a resident.");
    } else {
      System.out.println("Already a resident");
    }
  }
  /**
   * Removes a person from the list of resident 
   * @param name
   */
  public void moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(name);
      System.out.println(name + " has moved out.");
    } else {
      System.out.println("No such resident lives here");
    }
  }

  /**
   * Checks if a person lives in the house
   * @param person
   * @return boolean
   */
  public boolean isResident(String person) {
    if (residents.contains(person)) {
      return true;
    } else
      return false;
  }

  public void showOptions(){
    System.out.println("Available options at " + this.name + ":\nhasDiningRoom()\nnResidents()\nmoveIn()\nmoveOut()\nisResident()");
  }

  public void goToFloor(int n){
    if (this.hasElevator){
      if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (n < 1 || n > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    System.out.println("You are now on floor #" + n+ " of " + this.name);
    this.activeFloor = n; 
    } 
    else{
      System.out.println("There is no elevator, please use the stairs.");
    }
  }
  public static void main(String[] args) {
    House myHouse = new House(true, true, "Leah's house", "1234", 2);
    myHouse.moveIn("Leah");
    myHouse.moveIn("Mom");
    myHouse.moveIn("Leah");
    myHouse.moveOut("Leah");
    myHouse.showOptions();
  }

}