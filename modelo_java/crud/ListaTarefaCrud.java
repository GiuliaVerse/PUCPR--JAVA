package crud;

import jakarta.persistence.EntityManager;
import modelo.ListaTarefa;

public class ListaTarefaCrud extends CrudGenerico<ListaTarefa> {
    public ListaTarefaCrud(EntityManager em) {
        super(em, ListaTarefa.class);
    }
}