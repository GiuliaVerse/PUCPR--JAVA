package crud;

import jakarta.persistence.EntityManager;
import modelo.Tarefa;

public class TarefaCrud extends CrudGenerico<Tarefa> {
    public TarefaCrud(EntityManager em) {
        super(em, Tarefa.class);
    }
}