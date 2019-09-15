package cono;
import java.util.Scanner;
public class Cono {
    float pi=3.14159265f;
    private float g;
    private float r;
    private float h;
    public Cono(float g,float r,float h){
        this.g=g;
        this.r=r;
        this.h=h;
}
    public void volumen(){
        float vol=(pi*r*r*h)/3;
        System.out.println("El volumen del cono es: "+vol);
    }
    public void area(){
        float area=pi*r*(r+g);
        System.out.println("El volumen del cono es: "+area);
    }
    public void print(){
        
    }
    public static void main(String[] args) {
        Cono cono1= new Cono(45,12,40);
        cono1.volumen();
        cono1.area();
    }
}
