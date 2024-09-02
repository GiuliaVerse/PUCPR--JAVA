import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário
        CadastroAlunos cadastroAlunos = new CadastroAlunos(); // Instancia o cadastro de alunos
        Disciplina[] disciplinas = new Disciplina[5]; // Cria um array para armazenar 5 disciplinas

        // Inicializando 5 disciplinas com códigos, nomes e professores correspondentes
        disciplinas[0] = new Disciplina("MAT101", "Matemática", new Professor("Prof. A"));
        disciplinas[1] = new Disciplina("POR101", "Português", new Professor("Prof. B"));
        disciplinas[2] = new Disciplina("HIS101", "História", new Professor("Prof. C"));
        disciplinas[3] = new Disciplina("GEO101", "Geografia", new Professor("Prof. D"));
        disciplinas[4] = new Disciplina("BIO101", "Biologia", new Professor("Prof. E"));

        boolean running = true; // Variável de controle para manter o programa em execução

        // Loop principal do programa que exibe o menu e executa as operações escolhidas pelo usuário
        while (running) {
            // Exibição do menu principal
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Matricular Aluno");
            System.out.println("2. Listar Disciplinas");
            System.out.println("3. Listar Alunos por Disciplina");
            System.out.println("4. Pesquisar Disciplina");
            System.out.println("5. Pesquisar Aluno");
            System.out.println("6. Alterar Informações do Estudante");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    // Caso 1: Matricular Aluno
                    System.out.print("Nome do Aluno: ");
                    String nomeAluno = scanner.nextLine(); // Lê o nome do aluno
                    System.out.print("Número de Matrícula: ");
                    int matricula = scanner.nextInt(); // Lê o número de matrícula do aluno
                    scanner.nextLine(); // Limpa o buffer do scanner

                    // Mostrar disciplinas disponíveis antes de solicitar o código da disciplina
                    System.out.println("\n=== Disciplinas Disponíveis ===");
                    for (Disciplina disciplina : disciplinas) {
                        System.out.println("Código: " + disciplina.getCodigo() + ", Nome: " + disciplina.getNome());
                    }
                    // Cria um novo objeto Aluno com os dados fornecidos
                    Aluno aluno = new Aluno(matricula, nomeAluno);
                    cadastroAlunos.adicionarAluno(aluno); // Adiciona o aluno ao cadastro geral
                    System.out.println("Aluno matriculado com sucesso!");

                    // Matriculando o aluno em uma disciplina específica
                    System.out.print("Digite o código da disciplina para matricular o aluno: ");
                    String codigoDisciplina = scanner.nextLine(); // Lê o código da disciplina
                    boolean alunoMatriculado = false; // Flag para verificar se o aluno foi matriculado com sucesso

                    // Percorre o array de disciplinas para encontrar a correspondente ao código fornecido
                    for (Disciplina disciplina : disciplinas) {
                        if (disciplina.getCodigo().equalsIgnoreCase(codigoDisciplina)) {
                            disciplina.matricularAluno(aluno); // Matricula o aluno na disciplina encontrada
                            alunoMatriculado = true;
                            System.out.println("Aluno matriculado na disciplina " + disciplina.getNome());
                            break; // Encerra o loop após encontrar e matricular na disciplina correta
                        }
                    }

                    // Verifica se a disciplina foi encontrada e o aluno matriculado
                    if (!alunoMatriculado) {
                        System.out.println("Disciplina não encontrada.");
                    }
                    break;

                case 2:
                    // Caso 2: Listar Disciplinas
                    System.out.println("\n=== Disciplinas Disponíveis ===");
                    // Percorre e exibe as informações de todas as disciplinas disponíveis
                    for (Disciplina disciplina : disciplinas) {
                        System.out.println("Código: " + disciplina.getCodigo()
                                + ", Nome: " + disciplina.getNome()
                                + ", Professor: " + disciplina.getProfessor().getNome());
                    }
                    break;

                case 3:
                    // Caso 3: Listar Alunos por Disciplina
                    System.out.print("Digite o código da disciplina para listar os alunos: ");
                    codigoDisciplina = scanner.nextLine(); // Lê o código da disciplina

                    // Percorre o array de disciplinas para encontrar a correspondente ao código fornecido
                    for (Disciplina disciplina : disciplinas) {
                        if (disciplina.getCodigo().equalsIgnoreCase(codigoDisciplina)) {
                            System.out.println("Alunos matriculados na disciplina " + disciplina.getNome() + ":");
                            // Percorre o array de alunos da disciplina e exibe suas informações
                            for (Aluno a : disciplina.getAlunos()) {
                                if (a != null) {
                                    System.out.println("Matrícula: " + a.getMatricula() + ", Nome: " + a.getNome());
                                }
                            }
                            break; // Encerra o loop após listar os alunos da disciplina correta
                        }
                    }
                    break;

                case 4:
                    // Caso 4: Pesquisar Disciplina
                    System.out.println("Pesquisar Disciplina por:\n1. Nome\n2. Código");
                    int opcaoPesquisaDisciplina = scanner.nextInt(); // Lê a opção de pesquisa
                    scanner.nextLine(); // Limpa o buffer do scanner

                    if (opcaoPesquisaDisciplina == 1) {
                        // Pesquisa por nome da disciplina
                        System.out.print("Digite o nome da disciplina: ");
                        String nomeDisciplina = scanner.nextLine(); // Lê o nome da disciplina
                        boolean disciplinaEncontrada = false; // Flag para verificar se a disciplina foi encontrada

                        // Percorre as disciplinas para encontrar correspondência pelo nome
                        for (Disciplina disciplina : disciplinas) {
                            if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                                System.out.println("Disciplina encontrada: " + disciplina.getNome()
                                        + " - Código: " + disciplina.getCodigo());
                                disciplinaEncontrada = true;
                                break;
                            }
                        }

                        // Verifica se a disciplina foi encontrada
                        if (!disciplinaEncontrada) {
                            System.out.println("Disciplina não encontrada.");
                        }

                    } else if (opcaoPesquisaDisciplina == 2) {
                        // Pesquisa por código da disciplina
                        System.out.print("Digite o código da disciplina: ");
                        codigoDisciplina = scanner.nextLine(); // Lê o código da disciplina
                        boolean disciplinaEncontrada = false; // Flag para verificar se a disciplina foi encontrada

                        // Percorre as disciplinas para encontrar correspondência pelo código
                        for (Disciplina disciplina : disciplinas) {
                            if (disciplina.getCodigo().equalsIgnoreCase(codigoDisciplina)) {
                                System.out.println("Disciplina encontrada: " + disciplina.getNome()
                                        + " - Código: " + disciplina.getCodigo());
                                disciplinaEncontrada = true;
                                break;
                            }
                        }

                        // Verifica se a disciplina foi encontrada
                        if (!disciplinaEncontrada) {
                            System.out.println("Disciplina não encontrada.");
                        }

                    } else {
                        System.out.println("Opção de pesquisa inválida.");
                    }
                    break;

                case 5:
                    // Caso 5: Pesquisar Aluno
                    System.out.println("Pesquisar Aluno por:\n1. Nome\n2. Matrícula");
                    int opcaoPesquisaAluno = scanner.nextInt(); // Lê a opção de pesquisa
                    scanner.nextLine(); // Limpa o buffer do scanner
                    Aluno alunoEncontrado = null; // Inicializa a variável para armazenar o aluno encontrado

                    if (opcaoPesquisaAluno == 1) {
                        // Pesquisa por nome do aluno
                        System.out.print("Digite o nome do aluno: ");
                        nomeAluno = scanner.nextLine(); // Lê o nome do aluno
                        alunoEncontrado = cadastroAlunos.pesquisarNome(nomeAluno); // Busca o aluno pelo nome

                        // Verifica se o aluno foi encontrado
                        if (alunoEncontrado != null) {
                            System.out.println("Aluno encontrado: Matrícula: " + alunoEncontrado.getMatricula()
                                    + ", Nome: " + alunoEncontrado.getNome());
                        } else {
                            System.out.println("Aluno não encontrado.");
                        }

                    } else if (opcaoPesquisaAluno == 2) {
                        // Pesquisa por número de matrícula
                        System.out.print("Digite o número de matrícula do aluno: ");
                        matricula = scanner.nextInt(); // Lê o número de matrícula
                        alunoEncontrado = cadastroAlunos.pesquisarMatricula(matricula); // Busca o aluno pela matrícula

                        // Verifica se o aluno foi encontrado
                        if (alunoEncontrado != null) {
                            System.out.println("Aluno encontrado: Matrícula: " + alunoEncontrado.getMatricula()
                                    + ", Nome: " + alunoEncontrado.getNome());
                        } else {
                            System.out.println("Aluno não encontrado.");
                        }

                    } else {
                        System.out.println("Opção de pesquisa inválida.");
                    }
                    break;

                case 6:
                    // Caso 6: Alterar Informações do Estudante
                    System.out.print("Digite o número de matrícula do aluno que deseja alterar: ");
                    matricula = scanner.nextInt(); // Lê o número de matrícula do aluno
                    scanner.nextLine(); // Limpa o buffer do scanner

                    // Busca o aluno pelo número de matrícula fornecido
                    Aluno alunoParaAlterar = cadastroAlunos.pesquisarMatricula(matricula);

                    // Verifica se o aluno foi encontrado para realizar a alteração
                    if (alunoParaAlterar != null) {
                        System.out.print("Novo nome do aluno: ");
                        String novoNome = scanner.nextLine(); // Lê o novo nome para o aluno
                        alunoParaAlterar.setNome(novoNome); // Atualiza o nome do aluno
                        System.out.println("Informações do aluno alteradas com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 7:
                    // Caso 7: Sair
                    running = false; // Altera a flag para false para encerrar o loop e o programa
                    System.out.println("Saindo...");
                    break;

                default:
                    // Opções inválidas
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close(); // Fecha o objeto Scanne
    }
}