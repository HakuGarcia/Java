package models;

public class Funcionario{
    private String name;
    private double salario;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonificacao(){
        return this.salario * 0.30;
    }
}
