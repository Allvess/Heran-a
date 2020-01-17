package SistemaFuncionario;

public class Funcionario {


   protected String nome;
   protected String cpf;
   protected double salario;
   protected int carga;


    public Funcionario(String nome, String cpf, double salario, int carga) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.carga = carga;
    }
}

