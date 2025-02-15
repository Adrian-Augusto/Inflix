import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListF {
    private List<Map<String, Object>> listaFuncionarios;

    public ListF() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(String nome, int dia, int mes, int ano, BigDecimal salario, String Funcao) {
        Map<String, Object> funcionario = new HashMap<>();
        funcionario.put("nome", nome);
        funcionario.put("dataNascimento", LocalDate.of(ano, mes, dia));
        funcionario.put("salario", salario);
        funcionario.put("Funcao", Funcao);
        listaFuncionarios.add(funcionario); 
    }

    public void exibirFuncionario() {
        for (Map<String, Object> funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.get("nome") +
                               ", Data de Nascimento: " + funcionario.get("dataNascimento") +
                               ", Salário: " + funcionario.get("salario"));
        }
    }

    public void aplicarAumentoDe10Porcento() {
        for (Map<String, Object> funcionario : listaFuncionarios) {
            BigDecimal salarioAtual = (BigDecimal) funcionario.get("salario");
            BigDecimal aumento = salarioAtual.multiply(new BigDecimal("0.10"));
            BigDecimal novoSalario = salarioAtual.add(aumento);
            funcionario.put("salario", novoSalario);
        }
    }

    public void exibirAumento() {
        for (Map<String, Object> funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.get("nome") +
                               ", Data de Nascimento: " + funcionario.get("dataNascimento") +
                               ", Salário: " + funcionario.get("salario") +
                               ", Função: " + funcionario.get("Funcao"));
        }
    }

    public void exibirAniversariantes() {
        for (Map<String, Object> funcionario : listaFuncionarios) {
            LocalDate dataNascimento = (LocalDate) funcionario.get("dataNascimento");
            int mesNascimento = dataNascimento.getMonthValue(); 

            // Verifica se o mês é Outubro (10) ou Dezembro (12)
            if (mesNascimento == 10 || mesNascimento == 12) {
                System.out.println("Nome: " + funcionario.get("nome") +
                                   ", Data de Nascimento: " + funcionario.get("dataNascimento") +
                                   ", Salário: " + funcionario.get("salario"));
            }
        }
    }

    public void exibirFuncionarioComMaiorIdade() {
        Map<String, Object> funcionarioMaiorIdade = null;
        int maiorIdade = 0;

        for (Map<String, Object> funcionario : listaFuncionarios) {
            // Obtém a data de nascimento do funcionário
            LocalDate dataNascimento = (LocalDate) funcionario.get("dataNascimento");

            // Calcula a idade com base na data de nascimento
            int idade = calcularIdade(dataNascimento);

            // Verifica se o funcionário tem a maior idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
                funcionarioMaiorIdade = funcionario;
            }
        }

        // Exibe o nome e a idade do funcionário com a maior idade
        if (funcionarioMaiorIdade != null) {
            System.out.println("Funcionário com maior idade:");
            System.out.println("Nome: " + funcionarioMaiorIdade.get("nome"));
            System.out.println("Idade: " + maiorIdade);
        }
    }

    // Método auxiliar para calcular a idade
    private int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears(); // Retorna a idade em anos
    }
    public void exibirFuncionarioOrdemAlfabetica() {
        listaFuncionarios.sort((funcionario1, funcionario2) -> {
            String nome1 = (String) funcionario1.get("nome");
            String nome2 = (String) funcionario2.get("nome");
            return nome1.compareTo(nome2); 
            
            
        });

        for (Map<String, Object> funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.get("nome") +
                               ", Data de Nascimento: " + funcionario.get("dataNascimento") +
                               ", Salário: " + funcionario.get("salario") +
                               ", Função: " + funcionario.get("Funcao"));
        }}
    
    
        public void imprimirTotalSalarios() {
            BigDecimal totalSalarios = BigDecimal.ZERO; // Inicializa o total de salários
    
            // Itera sobre a lista e soma os salários
            for (Map<String, Object> funcionario : listaFuncionarios) {
                BigDecimal salario = (BigDecimal) funcionario.get("salario");
                totalSalarios = totalSalarios.add(salario);  // Soma o salário atual ao total
            }
    
            System.out.println("Total dos salários: R$ " + totalSalarios);
        }
    
        // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário
        public void imprimirSalariosMinimos() {
            final BigDecimal salarioMinimo = new BigDecimal("1212.00");  // Definindo o valor do salário mínimo
    
            for (Map<String, Object> funcionario : listaFuncionarios) {
                BigDecimal salario = (BigDecimal) funcionario.get("salario");
                BigDecimal salariosMinimos = salario.divide(salarioMinimo, 2, BigDecimal.ROUND_HALF_UP);  // Calcula quantos salários mínimos
    
                System.out.println("Funcionário: " + funcionario.get("nome") +
                                   " ganha R$ " + salario + " que equivale a " +
                                   salariosMinimos + " salários mínimos.");
            }
        }
    
    
    
    
    }
    