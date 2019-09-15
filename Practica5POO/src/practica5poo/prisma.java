package practica5poo;

import java.awt.Toolkit;
import java.util.Scanner;

public class prisma {
    int base;
    int altura;
    int radio;
    int profundidad;
    double areaBase;
    double perimetro;
    prisma(int radio, int profundidad){
        this.radio=radio;
        this.profundidad=profundidad;
        this.areaBase=(this.radio*this.radio)*3.14;
        this.perimetro=3.14*2*this.radio;
    }
    prisma(int base, int altura, int profundidad){
        this.base=base;
        this.altura= altura;
        this.profundidad=profundidad;
        this.areaBase = this.base * this.altura;
        this.perimetro=2*(this.base+this.altura);
    }
    
    public static int lectura(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
    protected double volumenPrisma(){
        double volumen = areaBase*profundidad;
        return volumen;
    }
    protected double superficiePrisma(){
        double superficie = (areaBase*2)+(perimetro*profundidad);
        return superficie;
    }
    
}

