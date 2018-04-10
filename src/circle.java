public class circle {
    private double pi=3.14;
    private double radius;
    private String color;

    public circle(String str,double r){
        color=str;
        radius=r;
    }
    public  void show(){
        System.out.println("radius="+radius);
        System.out.println("color="+color);
        System.out.println("area="+radius*radius*pi);
    }
}
