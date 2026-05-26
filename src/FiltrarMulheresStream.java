import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Tarefa - Streams com Lambda
 * Ler nomes e sexos, filtrar apenas mulheres usando Stream e Lambda.
 *
 * @author SeuNome
 * @version 1.0
 */
public class FiltrarMulheresStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FILTRAR MULHERES COM STREAM E LAMBDA ===\n");
        System.out.print("Digite os dados no formato nome-sexo separados por vírgula: ");
        System.out.println("\nExemplo: Ana-F,Joao-M,Maria-F,Pedro-M,Carla-F\n");

        // Ler a linha inteira
        String entrada = scanner.nextLine();

        // Separar cada pessoa por vírgula
        String[] pessoas = entrada.split(",");

        // Lista para guardar todas as pessoas
        List<String> listaCompleta = new ArrayList<>();

        // Adicionar todas à lista
        for (String pessoa : pessoas) {
            listaCompleta.add(pessoa.trim());
        }

        // USANDO STREAM + LAMBDA para filtrar apenas mulheres
        List<String> mulheres = listaCompleta.stream()
                .filter(pessoa -> {
                    String[] dados = pessoa.split("-");
                    if (dados.length == 2) {
                        String sexo = dados[1].trim();
                        return sexo.equalsIgnoreCase("F");
                    }
                    return false;
                })
                .collect(Collectors.toList());

        // Exibir resultados
        System.out.println("\n=== RESULTADO ===");
        System.out.println("\n📋 Lista completa (" + listaCompleta.size() + " pessoas):");
        for (String p : listaCompleta) {
            System.out.println("  - " + p);
        }

        System.out.println("\n👩 Lista de MULHERES (" + mulheres.size() + " pessoas):");

        if (mulheres.isEmpty()) {
            System.out.println("  Nenhuma mulher encontrada!");
        } else {
            // Usando lambda para imprimir cada mulher
            mulheres.forEach(mulher -> {
                String nome = mulher.split("-")[0].trim();
                System.out.println("  - " + nome);
            });
        }

        scanner.close();
    }
}