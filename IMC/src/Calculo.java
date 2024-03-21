import org.w3c.dom.ls.LSOutput;

public class Calculo {

    // Atributos
    public double peso;
    public double altura;

    // Métodos
    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    public double calcularIMC(){
        return this.peso / Math.pow(altura,2);
    }

    public String exibirMensagem(){
        String mensagem = "Seu IMC é de " + calcularIMC();

        if (calcularIMC() <= 18.5)
            mensagem += "você está abaixo do peso";
        else if (calcularIMC() > 18.5 && calcularIMC() < 25)
            mensagem += "você está no peso ideal";
        else if (calcularIMC() > 25 && calcularIMC() < 30)
            mensagem += "você está levemente acima do peso";
        else if (calcularIMC() > 30 && calcularIMC() < 35)
            mensagem += "você está com obesidade grau 1";
        else if (calcularIMC() > 35 && calcularIMC() < 40)
            mensagem += "você está com obesidade severa";
        else
            mensagem += "você está com obesidade mórbida";

        return mensagem;
    }

    public double pesoIdeal(String sexo){
        /*
        Masculino: PesoIdeal = 52 + (0.75 × (altura - 152.4) ;
        Feminino: PesoIdeal = 52 + (0.67 × (altura - 152.4)
        */
        if (sexo.equalsIgnoreCase("M"))
            return  52 + (0.75 * (altura - 152.4));
        else if (sexo.equalsIgnoreCase("F"))
            return 52 + (0.67 * (altura - 152.4));
        else
            return 0000;
    }


}
