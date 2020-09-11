package pr;
import java.lang.*;

public class ball {
    private String material;
    private int size;

    public ball(String m, int s){
        material = m;
        size = s;
    }
    public  ball(String m){
        material = m;

    }
    public  ball(int s){
        size = s;
    }
    public void setMaterial(String material) { this.material = material; }
    public void setSize(int size) { this.size = size; }
    public String getMaterial(String material){
        return material;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return "ball{" + "material = " + material + ", size = " + size + "}";
    }
}
