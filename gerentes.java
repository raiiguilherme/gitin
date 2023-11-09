public class gerentes extends funcionario{
    private int horas;
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }






    private  double valor_extra;
     private double salario_total;
    public double getValor_extra() {
        return valor_extra;
    }

    public void setValor_extra(double valor_extra) {
        this.valor_extra = valor_extra;
    }

       public double getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }



     
    

    public double salariott(){
       
        valor_extra = (getSalario_base()*0.01)*horas;
        salario_total = valor_extra+getSalario_base();
        return salario_total;
    }
}
