import java.util.HashSet;
import java.util.Set;

public abstract class Aviary<T extends Animal>
{
    private Set<T> animalsList = new HashSet<T>();

    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }

    private int amountOfPlaces;

    public Aviary(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }

    public  int GetAmountOfOccupiedPlaces(){
        return this.animalsList.size();
    }

    public void AddAnimal(T animal) throws Noplaces {
        if(this.animalsList.size() == amountOfPlaces) throw  new Noplaces("Sorry, no places available");
        else animalsList.add(animal);
    }

    public boolean RemoveAnimalFromList(T animal) throws NotThisAnimal {
        if(!animalsList.contains(animal)) throw new NotThisAnimal("No this animal in aviary");
        else return true;
    }

}
