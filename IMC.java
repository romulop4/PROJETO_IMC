package IMC;

import java.util.Scanner;

public class IMC {


    public static void main(String[] args) {

        double peso;
        double altura;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite seu peso: ");
        peso = leia.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = leia.nextDouble();


        double IMC;

        IMC = peso / (altura*altura);

        if(IMC < 17){
        System.out.println("Bem abaixo do peso.");
    } else if(IMC >= 17 && IMC <= 18.49){
        System.out.println("Abaixo do peso.");
    } else if(IMC >= 18,50 && IMC <= 24,99){
        System.out.println("Peso normal.");
    } else if(IMC >= 25 && IMC <= 29,99){
        System.out.println("Acima do peso.");
    } else if(IMC >= 30 && IMC <= 34,99){
        System.out.println("Obesidade I.");
    } else if if(IMC >= 35 && IMC <= 39,99){
        System.out.println("Obesidade II.");
    }else if{
        System.out.println("Obesidade III.");
    }

        System.out.println("Seu IMC é: "+IMC);
    }


}