package task6;

public class SomeStuff implements Comparable<SomeStuff> {
    private int weight;
    private int cost;
    private double middleCost;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getMiddleCost() {
        return middleCost;
    }

    public void setMiddleCost(double middleCost) {
        this.middleCost = middleCost;
    }


    public SomeStuff(int weight, int cost, int id) {
        this.weight = weight;
        this.cost = cost;
        this.id = id;
    }

    @Override
    public int compareTo(SomeStuff someStuff) {
        if (middleCost < someStuff.middleCost) {
            return -1;
        } else {
            if (middleCost > someStuff.middleCost) {
                return 1;
            } else return 0;
        }
    }

    @Override
    public String toString() {
        return "SomeStuff{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", middleCost=" + middleCost +
                ", id=" + id +
                '}';
    }
}