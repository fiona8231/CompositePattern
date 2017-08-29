import java.util.ArrayList;
import java.util.*;

public class Composite implements Component{

    String name;

    List<Component> components = new ArrayList<>();

    public  Composite(String n){
        this.name = n;

    }


    public void addComponemt(Component com){

        components.add(com);

    }

    @Override
    public void showPrice() {
        System.out.println(name);

        for(Component counter: components){
            counter.showPrice();
        }

    }
}
