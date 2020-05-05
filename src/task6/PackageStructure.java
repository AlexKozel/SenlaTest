package task6;

import java.util.ArrayList;
import java.util.Collections;

public class PackageStructure {
    private BackPack backPack;
    private ArrayList<SomeStuff> stuffs;


    //fill backpack for singleton stuffs
    public void fillUpBackPackSingleton() {
        System.out.println("");
        System.out.println("---Start singleton pucking----");
        // sort all stuff
        this.stuffs = reverseSortStuffsByMiddleCost(stuffs, backPack);
        ArrayList<SomeStuff> packagedList = new ArrayList<SomeStuff>();
        int size = backPack.getCapacity();
        for (SomeStuff stuff : stuffs
        ) {
            if (stuff.getWeight() <= size) {
                packagedList.add(stuff);
                size -= stuff.getWeight();
            }
        }
        System.out.println("in bag - "+ packagedList.size() + " stuffs :"+  packagedList);
        System.out.println("in bag left free spacce- " + size);
        System.out.println("");
    }

    //fill up backpack multiple stuffs
    public void fillUpBackPackMultiple() {
        System.out.println("");
        System.out.println("---Start multiple pucking----");
        // sort all stuff
        this.stuffs = reverseSortStuffsByMiddleCost(stuffs, backPack);
        ArrayList<SomeStuff> packagedList = new ArrayList<SomeStuff>();
        int size = backPack.getCapacity();
        for (SomeStuff stuff : stuffs
        ) {
            while (size-stuff.getWeight() > 0) {
                if (stuff.getWeight() <= size) {
                    packagedList.add(stuff);
                    size -= stuff.getWeight();
                }
            }
        }
        System.out.println("in bag - "+ packagedList.size() + " stuffs :"+ packagedList);
        System.out.println("in bag left free spacce- " + size);
    }

    /**
     * Sorted all stuffs by middleCost
     */
    public ArrayList<SomeStuff> reverseSortStuffsByMiddleCost(ArrayList<SomeStuff> someStuffs, BackPack backPack) {
        ArrayList<SomeStuff> newList = new ArrayList<>();
        for (SomeStuff currentStuff: someStuffs
             ) {
            if (backPack.getCapacity() >= currentStuff.getWeight()) {
                double middleCost = (double) backPack.getCapacity() / currentStuff.getWeight() * currentStuff.getCost();
                currentStuff.setMiddleCost(middleCost);
                newList.add(currentStuff);
            }
        }
        newList.sort(SomeStuff::compareTo);
        Collections.reverse(newList);
        return newList;
    }

    public PackageStructure(BackPack backPack, ArrayList<SomeStuff> stuffs) {
        this.backPack = backPack;
        this.stuffs = stuffs;
    }

    public BackPack getBackPack() {
        return backPack;
    }

    public void setBackPack(BackPack backPack) {
        this.backPack = backPack;
    }

    public ArrayList<SomeStuff> getStuffs() {
        return stuffs;
    }

    public void setStuffs(ArrayList<SomeStuff> stuffs) {
        this.stuffs = stuffs;
    }
}
