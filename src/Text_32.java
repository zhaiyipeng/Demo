import java.util.ArrayList;
import java.util.List;

public class Text_32 {
    public static void main(String[] args) {

      PigManage pm = new PigManage();
      pm.add(new Pig(1,"xz",200));
      pm.add(new Pig(2,"wg",100));
      pm.add(new Pig(3,"hg",150));


//pm.remove(2);
        pm.update(new Pig(2,"wg22",1000));
        System.out.println(pm.getPig(1));
        System.out.println("=============================");
        pm.printInfo();


    }
}


class PigManage {
    List<Pig> pigs = new ArrayList<>();


    //增加方法
    public void add(Pig p) {

        pigs.add(p);

    }

    //删除方法
    public void remove(int id) {


        /*for(Pig p : pigs){

            if(id == p.getId()){
            }
        }*/


        for (int i = 0; i < pigs.size(); i++) {
            if (id == pigs.get(i).getId()) {
                pigs.remove(i);
            }
        }


    }


    //修改方法
    public void update(Pig p) {


        for (int i = 0; i < pigs.size(); i++) {
            if (p.getId() == pigs.get(i).getId()) {
                pigs.set(i, p);
            }
        }
    }

    //查询操作
    public Pig getPig(int id) {

        for (Pig p : pigs) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }

    public void printInfo() {

        for (Pig p : pigs) {
            System.out.println(p);

        }
    }
}

class Pig{

    private int id;
    private  String name;
    private  int weight;

public Pig(){}
public Pig(int id,String name,int weight){

    this.id = id;
    this.name = name;
    this.weight = weight;
}

public int getId(){
    return id;
}
public  void setId(int id){
    this.id = id;
}
public String getName(){
    return name;
}
public void getaName(String name){

    this.name = name;
}
public int getWeight(){
    return weight;
}
public  void setWeight(int weight){
    this.weight = weight;
}

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}