
import java.util.Scanner;

/*
Formulas para calcular la distancia
 */

/**
 *
 * @author equipo Lollipop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double Vo;
         double Vf;
         double A;
         double T;
        Scanner leer = new Scanner(System.in);
         Formula1 ob = new Formula1();
         System.out.println("Para obtener la distancia de la formula 1");
         System.out.println("Ingrese la velocidad inicial: "); 
         Vo = leer.nextDouble();
         ob.setVo(Vo);
         System.out.println("Ingrese la  velocidad final: ");
         Vf = leer.nextDouble();
         ob.setVf(Vf);
         System.out.println("Ingrese la aceleracion: ");
         A = leer.nextDouble();
         ob.setA(A);
         System.out.println("Ingrese el tiempo");
         T = leer.nextDouble();
         ob.setT(T);
         System.out.println("El resultado es: " + ob.CalcularDistancia());
         Formula2 ob1 = new Formula2(); 
         System.out.println("Para obtener la distancia de la formula 2");
         System.out.println("Ingrese la velocidad inicial: "); 
         Vo = leer.nextDouble();
         ob1.setVo(Vo);
         System.out.println("Ingrese la  velocidad final: ");
         Vf = leer.nextDouble();
         ob1.setVf(Vf);
         System.out.println("Ingrese la aceleracion: ");
         A = leer.nextDouble();
         ob1.setA(A);
         System.out.println("Ingrese el tiempo");
         T = leer.nextDouble();
         ob1.setT(T);
         System.out.println("El resultado es: " + ob1.CalcularDistancia());
         Formula3 ob2 = new Formula3();
         System.out.println("Para obtener la distancia de la formula 3");
         System.out.println("Ingrese la velocidad inicial: "); 
         Vo = leer.nextDouble();
         ob2.setVo(Vo);
         System.out.println("Ingrese la  velocidad final: ");
         Vf = leer.nextDouble();
         ob2.setVf(Vf);
         System.out.println("Ingrese la aceleracion: ");
         A = leer.nextDouble();
         ob2.setA(A);
         System.out.println("Ingrese el tiempo");
         T = leer.nextDouble();
         ob2.setT(T);
         System.out.println("El resultado es: " + ob2.CalcularDistancia());
         
         
    }
    
}
class Formula3 extends Movimiento{
     double res3;
    public double CalcularDistancia() {
      return  res3 = (Vf - Vo)/(2*A);
    }

    @Override
    public double getVo() {
         return Vo;
    }

    @Override
    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    @Override
    public double getVf() {
        return Vf;
    }

    @Override
    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public double getT() {
        return T;
    }

    @Override
    public void setT(double T) {
        this.T = T;
    }

}
class Formula2 extends Movimiento{
     double res2;
    @Override
    public double CalcularDistancia() {
      return  res2 = (((Vo + Vf)/2)*T);
    }

    @Override
    public double getVo() {
         return Vo;
    }

    @Override
    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    @Override
    public double getVf() {
        return Vf;
    }

    @Override
    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public double getT() {
        return T;
    }

    @Override
    public void setT(double T) {
        this.T = T;
    }

}
class Formula1 extends Movimiento{
    double res1;
    @Override
    public double CalcularDistancia() {
      return  res1 = Vo * T +((A * (T*T))/2);
    }

    @Override
    public double getVo() {
         return Vo;
    }

    @Override
    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    @Override
    public double getVf() {
        return Vf;
    }

    @Override
    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public void setA(double A) {
        this.A = A;
    }

    @Override
    public double getT() {
        return T;
    }

    @Override
    public void setT(double T) {
        this.T = T;
    }

    
    
}
abstract class Movimiento implements Captura{
    protected double Vo, Vf, A, T;

    public Movimiento() {
        Vo = 15;
        Vf = 30;
        A = 10;
        T = 3;
    }

    public Movimiento(double Vo, double Vf, double A, double T) {
        Vo =Vo;
        Vf = Vf;
        A = A;
        T = T;
    }

}

interface Captura{
    public double getVo();
    public void setVo(double Vo);
    public double getVf();
    public void setVf(double Vf);
    public double getA();
    public void setA(double A);
    public double getT();
    public void setT(double T);
   abstract public double CalcularDistancia();
}