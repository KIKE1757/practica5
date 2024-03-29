package practica5poo;

import java.awt.Toolkit;
import static practica5poo.prisma.lectura;

public class Practica5POO {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seleccione una opcion:"
                           +"\n1)Prisma"
                           +"\n2)Circunferencia"
                           +"\n3)Cono"
                           +"\n4)Salir");
        int opc = prisma.lectura();
        switch(opc){
            case 1:
                crearPrisma();
                break;
            case 2:
                crearCirc();
                break;
            case 3: 
                crearCono();
                break;
            case 4:
                System.out.println("***  Adios  ***");
                break;
            default:
                System.out.println("Opcion no valida");
                menu();
        }
    }
    public static void crearPrisma(){
        System.out.println("Seleccione un prisma"
                          +"\n1)Prisma rectangular"
                          +"\n2)Prisma circular"
                          +"\n3)Regresar");
        int opc = lectura();
        switch(opc){
            case 1:
                System.out.println("***PRISMA RECTANGULAR***");
                System.out.println("Ingrese un la base");
                int x=lectura();
                System.out.println("Ingrese la altura");
                int y = lectura();
                System.out.println("Ingrese la progundidad");
                int z=lectura();
                prisma prismaRec = new prisma(x,y,z);
                System.out.println("La superficie es: " + prismaRec.superficiePrisma());
                System.out.println("El volumen es: " + prismaRec.volumenPrisma());
                desicion();
                break;
            case 2:
                System.out.println("***PRISMA CIRCULAR***");
                System.out.println("Ingrese el radio");
                int r=lectura();
                System.out.println("Ingrese la progundidad");
                int prof=lectura();
                prisma prismaCirc = new prisma(r,prof);
                System.out.println("La superficie es: " + prismaCirc.superficiePrisma());
                System.out.println("El volumen es: " + prismaCirc.volumenPrisma());
                desicion();
                break;
            case 3:
                Practica5POO.menu();
                break;
            default:
                Toolkit.getDefaultToolkit().beep(); 
                System.out.println("****OPCION NO VALIDA****");
                crearPrisma();
        }
    }
    public static void crearCirc(){
        System.out.println("Dame el radio de tu esfera ");
        float x = lectura();
        circunferencia circunferencia1 = new circunferencia(x);
        circunferencia1.volumen();
        circunferencia1.area();
        desicion();
    }
    public static void crearCono(){
        System.out.println("Ingrese  el valor de generatriz: ");
        int g = lectura();
        System.out.println("Ingrese el valor del radio de la base: ");
        int r = lectura();
        System.out.println("Ingrese el valor de la altura: ");
        int h = lectura();
        cono cono1= new cono(g,r,h);
        cono1.volumen();
        cono1.area();
        desicion();
    }
    static void desicion(){
        System.out.println("¿Desea regresar al menú?"
                                   + "\nSI) 1"
                                   + "\nNO) Cualquier otro numero");
                                   int des=lectura();
                                   switch(des){
                                       case 1:
                                           menu();
                                           break;
                                       default:
                                           System.out.println("***  Adios  ***");
                                   }
    }
}
