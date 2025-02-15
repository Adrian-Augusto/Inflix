import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionarios extends Pessoas {

        private BigDecimal Salario;
        private String Funcao;

    public Funcionarios(String Nome,int dia, int mes, int ano, BigDecimal Salario ){
        super(Nome, dia, mes, ano);
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        this.Salario=Salario;
        this.Funcao=Funcao;

    }

    public BigDecimal getSalario() {
        return Salario;
    }

    public void setSalario(BigDecimal salario) {
        Salario = salario;
    }







    



}

















    