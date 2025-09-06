class Pen{
    String color;
    int tip;
    void getcolor(){
        return this.color;
    }
    void gettip(){
        return this.tip;
    }
    void setcolor(String color){
        this.color=color;
    }
    void settip(int tip){
        this.tip=tip;
    }
}
public class getter_setter{
    public static void main(String[] args) {
      Pen p1 = new Pen();
      p1.setcolor("Blue");
      p1.settip(5);
      p1.getcolor();
      p1.gettip();
    }
}