import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal{
    public static void main(String[] args) {
        ListF lista = new ListF();  

        // Adicionando funcionários
        lista.adicionarFuncionario("Maria", 18, 10, 2000, new BigDecimal("2009.44"), "Operador");
        lista.adicionarFuncionario("João", 12, 5, 1990, new BigDecimal("2284.38"), "Operador");
        lista.adicionarFuncionario("Caio", 2, 5, 1961, new BigDecimal("9836.14"), "Coordenador");
        lista.adicionarFuncionario("Miguel", 14, 10, 1988, new BigDecimal("19119.88"), "Diretor");
        lista.adicionarFuncionario("Alice", 5, 1, 1995, new BigDecimal("2234.68"), "Recepcionista");
        lista.adicionarFuncionario("Heitor", 19, 11, 1999, new BigDecimal("1582.72"), "Operador");
        lista.adicionarFuncionario("Arthur", 31, 3, 1993, new BigDecimal("4071.84"), "Contador");
        lista.adicionarFuncionario("Laura", 8, 7, 1994, new BigDecimal("3017.45"), "Gerente");
        lista.adicionarFuncionario("Heloísa", 24, 5, 2003, new BigDecimal("1606.85"), "Eletricista");
        lista.adicionarFuncionario("Helena", 2, 9, 1996, new BigDecimal("2799.93"), "Gerente");
         
        System.out.println("----------------DEPOIS do aumento de 10%:--------------");

        lista.exibirFuncionario();
        
        
        System.out.println("----------------DEPOIS do aumento de 10%:--------------");

         lista.aplicarAumentoDe10Porcento();
         lista.exibirAumento();

         System.out.println("----------------aniversário em Outubro (10) ou Dezembro (12) 10 :--------------");
         lista.exibirAniversariantes();
      

         System.out.println("----------------MAIOR IDADE :--------------");

         lista.exibirFuncionarioComMaiorIdade();


         lista.exibirFuncionarioOrdemAlfabetica();




        // Imprime o total dos salários
        lista.imprimirTotalSalarios();

        // Imprime quantos salários mínimos cada funcionário ganha
        lista.imprimirSalariosMinimos();
  
    }
 

}