package vasugiaddressbook;

import javax.persistence.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook implements PropertyChangeListener {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "addressBook")
    private List<BuddyInfo> buddies;

    public AddressBook(int id) {
        this.id = id;
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public AddressBook(){
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    /**
     * Add a buddy to the list
     * @param buddy Buddy to be added to the list of buddies
     */

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    /**
     *
     * @return buddies. List of all the buddies in the address book
     */
    public List<BuddyInfo> getBuddies(){
        return buddies;
    }

    /**
     *
     * @param buddy Name of the buddy to be removed from the list of buddies
     * @return true if the buddy is removed and flase if the buddy isn't in the list
     */

    public Boolean removeBuddy(BuddyInfo buddy) {
        return this.buddies.remove(buddy);
    }

    /**
     *
     * @param name Name of the buddy you would like to access
     * @return The buddy matching the provided name
     */

    public BuddyInfo getBuddy(String name) {
        for (BuddyInfo buddy: buddies) {
            if (buddy.getName().equals(name)) return buddy;
        }
        return null;
    }

    @Override
    public String toString() {
        String returnValue = "";
        for (BuddyInfo buddy: buddies) {
            returnValue += buddy.toString() + "\n";
        }
        return returnValue;
    }

    public int getId() {
        return id;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Variation of " + evt.getPropertyName());
        System.out.println("\t(" + evt.getOldValue() +
                " -> " + evt.getNewValue() + ")");
        System.out.println("Property in object " + evt.getSource());
    }

    public void addObserver(PropertyChangeListener l) {
        pcs.addPropertyChangeListener("theProperty", l);
    }
}