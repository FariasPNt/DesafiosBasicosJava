package Desafios.desafio12;
// 12 - Faça um algoritmo que leia o valor de um produto
// e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
public class Domain12 {
    public static final double AVISTA_PIX = 0.15;
    public static final double CARTAO = 0.1;
    protected double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    FormaPagamento formaPagamento;

    public double valorFinal(){
        if(formaPagamento == FormaPagamento.avistaPix){
            return valor - (valor * AVISTA_PIX);
        } if(formaPagamento == FormaPagamento.avistaCredito){
            return valor - (valor * CARTAO);
        } if(formaPagamento == FormaPagamento.parceladoDuas){
            return valor;
        } else {
            return valor + (valor * CARTAO);
        }
    }
}
