public class vendedor extends funcionario{
    private double salario_total;

    private float valor_venda;
     

    public float getValor_venda() {
        return valor_venda;
    }
    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    } 
    public double getSalario_total() {
        return salario_total;
    }
    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }



    

    public double salariot(double vendas){
        double comissao =  valor_venda*0.05;
        salario_total = getSalario_base()+comissao;
        return salario_total;
    }
}
