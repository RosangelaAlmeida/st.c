import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDeFun = 5;
        DecimalFormat df = new DecimalFormat("#.00");

        double totalSalariosLiquidos = 0;

        System.out.println("Remuneração e descontos dos funcionários da empresa CODE");
        System.out.println("-------------------------------------------------");


        for (int i = 0; i < totalDeFun; i++) {

            System.out.print("Por favor, entre com o sálário Bruto do colaborador " + (i + 1) + ": ");
            double salarioBruto = scanner.nextDouble();

            double descontoINSS = INSS(salarioBruto);
            double descontoIR = IR(salarioBruto);
            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

            System.out.println("\nFuncionário " + (i + 1) + ":");
            System.out.println("Salário Bruto: R$" + df.format(salarioBruto));
            System.out.println("Desconto INSS: R$" + df.format(descontoINSS));
            System.out.println("Desconto IR: R$" + df.format(descontoIR));
            System.out.println("Salário Líquido: R$" + df.format(salarioLiquido));
            System.out.println("-------------------------------------------------");

            totalSalariosLiquidos += salarioLiquido;
        }

        System.out.println("\nTotal de todos os salários líquidos: R$" + df.format(totalSalariosLiquidos));
        scanner.close();
    }

    public static double INSS(double remuneracaoBruta) {
        double desconto = 0;
        if (remuneracaoBruta <= 1212.00) {
            desconto = remuneracaoBruta * 0.075;
        } else if (remuneracaoBruta <= 2427.35) {
            desconto = remuneracaoBruta * 0.09;
        } else if (remuneracaoBruta <= 3641.03) {
            desconto = remuneracaoBruta * 0.12;
        } else if (remuneracaoBruta <= 7087.22) {
            desconto = remuneracaoBruta * 0.14;
        } else if (remuneracaoBruta > 7087.22) {
            desconto = remuneracaoBruta * 0.14;
        } else {
            desconto = 7087.22 * 0.14;
        }
        return desconto;
    }

    public static double IR(double salarioBruto) {
        double desconto = 0;
        if (salarioBruto <= 1903.98) {
            desconto = 0;
        } else if (salarioBruto <= 2826.65) {
            desconto = salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            desconto = salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            desconto = salarioBruto * 0.225;
        } else {
            desconto = salarioBruto * 0.275;
        }
        return desconto;
    }
}