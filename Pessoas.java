import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Pessoas {

    private String Nome;
    private LocalDate DataNascimento ;
    
    public Pessoas(String nome, int dia, int mes, int ano) {
        this.Nome = nome;
        this.DataNascimento = LocalDate.of(dia, mes, ano);
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(int dia, int mes , int ano) {
        this.DataNascimento = LocalDate.of(dia, mes, ano);
    }
    
}



