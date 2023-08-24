package application;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Forçar a usar padrão US
        Locale.setDefault(Locale.US);

        //ler a variável
        Scanner sc = new Scanner(System.in);

        //Variável
        int idadeAluno;
        double altura;
        String nome;


        idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: "));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do aluno: "));

        nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");

        System.out.println();
        JOptionPane.showMessageDialog(null, "Idade = " + idadeAluno + " Anos\n" + "Altura = " + altura + "\nNome = " + nome);

        sc.close();
    }
}