import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int hora = 0;
        int mes = 0;
        int salario = 0;

        System.out.println("Quanto você ganha por horas: ");
        hora = sc.nextInt();

        System.out.println("Quantas horas você trabalha no mês: ");
        mes = sc.nextInt();

        salario = hora * mes;

        System.out.println("Seu salário no mês é de: " + salario + "$");

        sc.close();


    }
}
