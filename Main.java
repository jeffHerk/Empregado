
import Main.Empregado;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Empregado> empregados = new ArrayList<>();
    private static final Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Cadastrar Empregado");
            System.out.println("2 - Promover Empregado");
            System.out.println("3 - Aumentar salário do Empregado");
            System.out.println("4 - Demitir Empregado");
            System.out.println("5 - Fazer aniversário do Empregado");
            System.out.println("6 - Detalhes dos Empregados");
            System.out.println("7 - Sair");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    criarEmpregado();
                    break;
                case 2:
                    promoverEmpregado();
                    break;
                case 3:
                    aumentarSalarioEmpregado();
                    break;
                case 4:
                    demitirEmpregado();
                    break;
                case 5:
                    fazerAniversarioEmpregado();
                    break;
                case 6:
                    mostrarDetalhesEmpregados();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);
    }

    private static void criarEmpregado() {
        leitor.nextLine(); // Consumir a nova linha pendente
        System.out.println("Digite o nome do empregado");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do empregado");
        int idade = leitor.nextInt();

        System.out.println("Digite o salário do empregado");
        double salario = leitor.nextDouble();

        Empregado empregado = new Empregado(nome, idade, salario);
        empregados.add(empregado);
        System.out.println("Empregado cadastrado com sucesso");
    }

    private static void promoverEmpregado() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
            return;
        }
        System.out.println("Digite o número do empregado para promover: ");
        listarEmpregados();
        int indice = leitor.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            Empregado empregado = empregados.get(indice);
            empregado.promover();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void aumentarSalarioEmpregado() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
            return;
        }
        System.out.println("Digite o número do empregado para aumentar o salário: ");
        listarEmpregados();
        int indice = leitor.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            Empregado empregado = empregados.get(indice);
            System.out.println("Digite o percentual de aumento: ");
            double percentual = leitor.nextDouble();
            empregado.aumentarSalario(percentual);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void demitirEmpregado() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
            return;
        }
        System.out.println("Digite o número do empregado para demitir: ");
        listarEmpregados();
        int indice = leitor.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            Empregado empregado = empregados.get(indice);
            System.out.println("Digite o motivo da demissão (1: Justa causa, 2: Decisão do empregador, 3: Aposentadoria): ");
            int motivo = leitor.nextInt();
            empregado.demitir(motivo);
            empregados.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void fazerAniversarioEmpregado() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
            return;
        }
        System.out.println("Digite o número do empregado que fez aniversário: ");
        listarEmpregados();
        int indice = leitor.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            Empregado empregado = empregados.get(indice);
            empregado.fazerAniversario();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void mostrarDetalhesEmpregados() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
            return;
        }
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println("Empregado " + (i + 1));
            System.out.println(empregados.get(i).toString());
        }
    }

    private static void listarEmpregados() {
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(i + " - " + empregados.get(i).getNome());
        }
    }
}
