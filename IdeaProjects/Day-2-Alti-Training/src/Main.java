
public class Main {
    float circle(float radius){
    float area = 3.14f*radius*radius;
    return  area;
    }
    void square(){
        int side = 10;
        int area = side*side;
        System.out.println(area);
    }
    int areaRect(int l, int b){ // called function
        int area = l*b;
        return area;
    }
    public static void main(String[] args) {
        float rad = 34f;
        Main obj  = new Main(); // object creation

        System.out.println(obj.circle(rad));
        obj.square(); // calling function
        System.out.println(obj.areaRect(10,20)); // area of the rectangle
    }
}