package task6;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        BackPack bp = new BackPack(80);
        ArrayList<SomeStuff> stuffArrayList = new ArrayList<>();
        stuffArrayList.add(new SomeStuff(10, 12, 1));
        stuffArrayList.add(new SomeStuff(16, 7, 2));
        stuffArrayList.add(new SomeStuff(28, 56, 3));
        stuffArrayList.add(new SomeStuff(33, 12, 4));
        stuffArrayList.add(new SomeStuff(45, 12, 5));
        stuffArrayList.add(new SomeStuff(3, 12, 6));
        stuffArrayList.add(new SomeStuff(4, 12, 7));
        PackageStructure ps = new PackageStructure(bp, stuffArrayList);

        //если каждый предмет кладем только один раз
        ps.fillUpBackPackSingleton();
        // если каждый предмет кладем сколько угодно раз
        ps.fillUpBackPackMultiple();
    }
}
