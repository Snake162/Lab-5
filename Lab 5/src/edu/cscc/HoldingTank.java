package edu.cscc;

public class HoldingTank {
    private int current, maxCapacity;

    //constructors
    public HoldingTank(int current, int maxCapacity)
    {
        this.current = current;
        this.maxCapacity = maxCapacity;
        if (current>maxCapacity){
            current = maxCapacity;
        }
        if(current<0){
            current=0;
            //added this so the user could not enter negative current value
        }
    }

    //Accessors/Mutators
    public int getCurrent() {
        return current;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

    //Other Methods
    void add(int volume){
        current=current+volume;
        if (current>maxCapacity) {
            current=maxCapacity;
        }
    }
    void drain(int volume){
        current=current-volume;
        if (current<0) {
            current=0;
        }
    }
    void print(){
        System.out.println("The tank volume is "+current+" gallons");
    }

}

