import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Talbot House", "25 Prospect Street Northampton, MA 01063", 4));
        myMap.addBuilding(new House(true,false,"Lawrence House", "99 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new House(true, true, "Cutter House", "10 Prospect Street Northampton, MA 01063", 3));
        myMap.addBuilding(new House("Wilson House", "1 Paradise Road Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive Northampton, MA 01063", 3, true));
        myMap.addBuilding(new Building("Mendenhall", "122 Green Street Northampton, MA 01063", 5));
        myMap.addBuilding(new Cafe(50, 50, 50, 50,  "Compass Cafe", "7 Neilson Drive Northampton, MA 01063", 1));
        myMap.addBuilding(new Cafe(50,50,50,50,"Campus Center Cafe", "100 Elm Street Northampton, MA 01063", 1));
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Drive #1 Northampton, MA 01063", 3));
        myMap.addBuilding(new House("Northrop House", "49 Elm Street Northampton, MA 01063",4));
        myMap.addBuilding(new House("Tyler", "164 Green Street Northampton, MA 01063", 4));
        System.out.println(myMap);
    }
    
}
