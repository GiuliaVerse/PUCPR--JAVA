import modelo.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import crud.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
/* 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefasPU");
        EntityManager em = emf.createEntityManager();

        // Criando e persistindo uma nova tarefa
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar JPA");

        em.getTransaction().begin();
        em.persist(tarefa);
        em.getTransaction().commit();

        System.out.println("Tarefa salva com ID: " + tarefa.getId());
*/
 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tarefasPU");
        EntityManager em = emf.createEntityManager();



        // DAOs
        UsuarioCrud usuarioDAO = new UsuarioCrud(em);
        ListaTarefaCrud listaDAO = new ListaTarefaCrud(em);
        TarefaCrud tarefaDAO = new TarefaCrud(em);
        CategoriaCrud categoriaDAO = new CategoriaCrud(em);
        ComentarioCrud comentarioDAO = new ComentarioCrud(em);
        EtiquetaCrud etiquetaDAO = new EtiquetaCrud(em);
        NotificacaoCrud notificacaoDAO = new NotificacaoCrud(em);

     
        // USUARIO - CREATE
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setEmail("joao@email.com");
        usuario.setSenha("123456");
        usuarioDAO.inserir(usuario);

        // LISTA - CREATE
        ListaTarefa lista = new ListaTarefa();
        lista.setTitulo("Projetos");
        lista.setDescricao("Tarefas de projetos finais");
        lista.setDataCriacao(LocalDate.now());
        lista.setUsuario(usuario);
        listaDAO.inserir(lista);

        // CATEGORIA - CREATE
        Categoria categoria = new Categoria();
        categoria.setNome("Trabalho");
        categoria.setCor("#FF0000");
        categoriaDAO.inserir(categoria);

        // ETIQUETA - CREATE
        Etiqueta etiqueta = new Etiqueta();
        etiqueta.setNome("Urgente");
        etiqueta.setCor("#FFFF00");
        etiquetaDAO.inserir(etiqueta);

        // TAREFA - CREATE
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Finalizar relatório");
        tarefa.setConcluida(false);
        tarefa.setDataLimite(LocalDate.now().plusDays(2));
        tarefa.setPrioridade("Alta");
        tarefa.setListaTarefa(lista);
        tarefa.setCategoria(categoria);
        tarefa.setEtiquetas(List.of(etiqueta));
        tarefaDAO.inserir(tarefa);

        // COMENTARIO - CREATE
        Comentario comentario = new Comentario();
        comentario.setTexto("Não esquecer de revisar os dados");
        comentario.setData(LocalDateTime.now());
        comentario.setTarefa(tarefa);
        comentarioDAO.inserir(comentario);

        // NOTIFICACAO - CREATE
        Notificacao notificacao = new Notificacao();
        notificacao.setMensagem("Lembrete: relatório vence amanhã!");
        notificacao.setDataEnvio(LocalDateTime.now());
        notificacao.setFoiEnviada(false);
        notificacao.setTarefa(tarefa);
        notificacaoDAO.inserir(notificacao);

        // EXEMPLO: LISTAR TODAS AS TAREFAS
       List<Tarefa> tarefas = tarefaDAO.listarTodos();
       System.out.println("Tarefas cadastradas:");        
       for (Tarefa t : tarefas) {
           System.out.println("- " + t.getDescricao());
       }

        em.close();
        emf.close();
    }
}