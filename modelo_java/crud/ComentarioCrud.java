package crud;

import jakarta.persistence.EntityManager;
import modelo.Comentario;

public class ComentarioCrud extends CrudGenerico<Comentario> {
    public ComentarioCrud(EntityManager em) {
        super(em, Comentario.class);
    }
}