import java.util.Hashtable;
public class Library extends Building {

  private Hashtable < String, Boolean > collection;
  private boolean hasElevator; 
  /**
   * Creates instance of Library class
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasElevator = hasElevator;
    System.out.println("You have built a library: 📖");
    collection = new Hashtable < String, Boolean > ();
  }

  /**
 * Adds a book to the Library
 * @param title
 */
  public void addTitle(String title) {
    if (!collection.containsKey(title)) {
      collection.put(title, true);
      System.out.println(title + " has been added.");
    } else
      System.out.println(title + " is already in collection");
  }

  public void addTitle(String title, String title2, String title3) {
    if (!collection.containsKey(title)) {
      collection.put(title, true);
      System.out.println(title + " has been added.");
    } else
       System.out.println(title + " is already in collection");
  
    if (!collection.containsKey(title2)) {
      collection.put(title2, true);
      System.out.println(title2 + " has been added.");
    } else
       System.out.println(title2 + " is already in collection");
    
   if (!collection.containsKey(title3)) {
      collection.put(title3, true);
      System.out.println(title3 + " has been added.");
    } else
        System.out.println(title3 + " is already in collection");
    
  }


  /**
   * Removes a book from the Library
   * @param title
   * @return String stating if the book was removed or not 
   */
  public String removeTitle(String title) {
    if (collection.containsKey(title)) {
      collection.remove(title);
      return title + " has been removed.";
    } else
      return title + " is not found in collection";

  }

  /**
   * Checks out book from library database
   * @param title
   */
  public void checkOut(String title) {
    if (collection.containsKey(title) && collection.get(title)) {
      collection.replace(title, false);
      System.out.println(title + " successfully checked out.");
    } else
      System.out.println(title + " has already been check out.");
  }

  public void checkOut(String title, String title2) {
    if (collection.containsKey(title) && collection.get(title)) {
      collection.replace(title, false);
      System.out.println(title + " successfully checked out.");
    } else
      System.out.println(title + " has already been check out.");

    if (collection.containsKey(title2) && collection.get(title2)) {
      collection.replace(title2, false);
      System.out.println(title2 + " successfully checked out.");
    } else
        System.out.println(title2 + " has already been check out.");
  }
  /**
   *  Returns book back into database 
   * @param title
   */
  public void returnBook(String title) {
    if (collection.containsKey(title) && collection.containsValue(false)) {
      collection.replace(title, true);
      System.out.println(title + " successfully returned.");
    } else
      System.out.println(title + " has already been returned.");

  }

  /**
   * Checks if a book is in the Library
   * @param title
   * @return boolean 
   */
  public boolean containsTitle(String title) {
    if (collection.containsKey(title)) {
      return true;
    } else
      return false;
  }

  /**
   * Checks if book is availble to check out 
   * @param title
   * @return boolean
   */
  public boolean isAvailable(String title) {
    if (collection.containsValue(true)) {
      return true;
    } else
      return false;
  }

  /**
   * Prints out each book and if it is checked out or not 
   */
  public void printCollection() {
    for (String key: collection.keySet()) {
      System.out.println(key + " : " + collection.get(key));
    }
  }

  public void showOptions(){
    System.out.println("Available options at " + this.name + ":\naddTitle(t)\nremoveTitle(t)\ncheckOut(t)\nreturnBook(t)\ncontainsTitle(t)\nisAvalible(t)\nprintCollection()");
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
    Library neilson = new Library("Neilson", "1234", 5, true);
    neilson.addTitle("test");
    neilson.addTitle("testOne");
    neilson.addTitle("testTwo");
    neilson.checkOut("test");
    neilson.checkOut("test");
    neilson.printCollection();
    neilson.showOptions();
    

  }

}