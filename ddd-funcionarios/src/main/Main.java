package main;

import models.Funcionario;
import models.Gerente;
import models.Vendendor;

public class Main {
    public static void main(String[] args) {
        double bonificacao;

        Funcionario func = new Funcionario();
        func.setName("Agatha");
        func.setSalario(1000);
        bonificacao = func.calcularBonificacao();
        System.out.println("Funcionário: " + func.getName() +
                "\nSalário bruto: " + func.getSalario() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (func.getSalario() + bonificacao));

        Gerente gerente = new Gerente();
        gerente.setName("Paola");
        gerente.setSalario(1000);
        gerente.setGratificacao(1000);
        bonificacao = gerente.calcularBonificacao();
        System.out.println("\n\nmodels.enums.Gerente: " + gerente.getName() +
                "\nSalário bruto: " + gerente.getSalario() +
                "\nGratificação do cargo: " + gerente.getGratificacao() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (gerente.getSalario() + gerente.getGratificacao() + bonificacao));

        Vendendor vendedor = new Vendendor();
        vendedor.setName("Ana");
        vendedor.setSalario(1000);
        double salarioComissao = vendedor.calculoComissao(20000);
        bonificacao = vendedor.calcularBonificacao();
        System.out.println("\n\nVendedor: " + vendedor.getName() +
                "\nSalário bruto: " + vendedor.getSalario() +
                "\nGratificação do cargo: " + vendedor.getComissao() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (vendedor.getSalario() + vendedor.getComissao() + bonificacao));

    }
}
