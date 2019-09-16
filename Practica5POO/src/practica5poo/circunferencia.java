package practica5poo;
import java.util.Scanner;
public class circunferencia {
    float pi=3.14159265f;
    private float r;
    public circunferencia(float r){
        this.r=r;
    }
    public void volumen(){
        float volu=(pi*r*r*r*4)/3;
        System.out.println("El volumen de la esfera es: "+volu);
    }
    public void area(){
        float area=(pi*4*r*r);
        System.out.println("El area del cono es:"+area);
    }
    public static void main(String[] args){
        System.out.println("Dame el radio de tu esfera ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        circunferencia circunferencia1 = new circunferencia(x);
        circunferencia1.volumen();
        circunferencia1.area();
    }
}
