public class Moeda {

    public double valorReal;
    public double cotacaoDollar;
    public double quantDollar;

    public void calcularConversao(){ // método sem retorno
         this.quantDollar = this.valorReal / this.cotacaoDollar;
         // this = operador que afirma que é um atributo da classe
    }

    public double retornarCalculoConversao(){ // método com retorno
        double dolar = this.valorReal/this.cotacaoDollar;
        return dolar;
    }
}
