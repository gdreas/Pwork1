package pr;
import java.lang.*;

public class book {
    private String name;
    private int vol_page;

    public book(String n, int v){
        name = n;
        vol_page = v;
    }
    public book(String n){
        name = n;
        vol_page = 0;
    }
    public book(int v)
    {
        vol_page = v;}
    public book(){
        name = "----";
        vol_page = 0;
    }
    public void setVol_page(int vol_page){
        this.vol_page = vol_page;
    }
    public  void setName(String name){
        this.name = name;
    }

    public int getVol_page() {
        return vol_page;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", vol_page=" + vol_page +
                '}';
    }
}