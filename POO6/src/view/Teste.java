package view;

import model.Motor;
import model.Passeio;
import model.Carga;

class Teste {
    public static void main(String[] args) {
       
        Motor motorPasseio1 = new Motor(4, 100);
        Passeio passeio1 = new Passeio("ABC1234", "Toyota", "Corolla", "Branco", 221, motorPasseio1, 5);
        Motor motorPasseio2 = new Motor(6, 150);
        Passeio passeio2 = new Passeio("DEF5678", "Honda", "Civic", "Preto", 180, motorPasseio2, 4);

    
        Motor motorCarga1 = new Motor(8, 250);
        Carga carga1 = new Carga("GHI9012", "Volvo", "FH", "Azul", 18, motorCarga1, 10000, 8000);
        Motor motorCarga2 = new Motor(6, 200);
        Carga carga2 = new Carga("JKL3456", "Scania", "R440", "Vermelho", 10, motorCarga2, 8000, 7000);


        System.out.println(" Passeio 1: Velocidade máxima = " + passeio1.calcularVelocidade(passeio1.getVelocMax()) + " m/h");
        System.out.println("Passeio 2: Velocidade máxima = " + passeio2.calcularVelocidade(passeio2.getVelocMax()) + " m/h");

        System.out.println("Carga 1: Velocidade máxima = " + carga1.calcularVelocidade(carga1.getVelocMax()) + " cm/h");
        System.out.println("Carga 2: Velocidade máxima = " + carga2.calcularVelocidade(carga2.getVelocMax()) + " cm/h");
    }
}