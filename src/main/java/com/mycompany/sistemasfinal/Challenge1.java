package com.mycompany.sistemasfinal;

public class Challenge1 {
    //metodo triangulo
    public int Atriangulo(int B, int H){
        return (B*H)/2;
    }
    public int Prectangulo(int A, int B){
        return (A*2)+(B*2);
    }
    public int Poder(int A, int B){
        return (A*B);
    }
    public static void main(String[]args){
       //objeto de clase challenge
        Challenge1 X= new Challenge1();
        System.out.println("el area del triangulo es de "+ X.Atriangulo(10, 5));
        System.out.println("el perimetro del rectangulo es de "+X.Prectangulo(5, 10));
        System.out.println("el poder es de "+ X.Poder(10, 30));
}  
    
}
