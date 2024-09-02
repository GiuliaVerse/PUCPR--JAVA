public class Disciplina {
    private String codigo;
    private String nome;
    private Professor professor;
    private int qtdAluno = 0;
    private Aluno[] alunos = new Aluno[10   ];

    public Disciplina(String codigo, String nome, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void matricularAluno(Aluno aluno) {
        if (qtdAluno == 10) {
            System.out.println("Turma cheia! Não é possível matricular!");
        } else {
            alunos[qtdAluno] = aluno;
            qtdAluno++;
        }
    }

    public void listarAlunos() {
        System.out.println("Listagem de alunos da disciplina " + nome);
        System.out.println("--------------------------------------------");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno.getMatricula() + " - " + aluno.getNome());
            }
        }
        System.out.println("--------------------------------------------");
    }
}
