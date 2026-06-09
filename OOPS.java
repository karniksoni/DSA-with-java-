

public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.SetColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void SetColor(String newcolor){
        color = newcolor;
    }

    void SetTip(int newTip){
        tip = newTip;
    }
}
