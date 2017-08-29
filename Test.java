
public class Test {
    public static void main(String[] args){

        Leaf hardDrive = new Leaf(4000,"harddrive");
        Leaf  mouse = new Leaf(12,"Mouse");
        Leaf  monitor = new Leaf(1000,"Monitor");
        Leaf  Ram = new Leaf(1500,"Ram");
        Leaf  cpu = new Leaf(3000,"CUP");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite  mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponemt(cpu);
        mb.addComponemt(Ram);

        ph.addComponemt(mouse);
        ph.addComponemt(monitor);
        cabinet.addComponemt(hardDrive);
        cabinet.addComponemt(mb);

        computer.addComponemt(ph);
        computer.addComponemt(cabinet);

        Ram.showPrice();
        computer.showPrice();


    }

}
