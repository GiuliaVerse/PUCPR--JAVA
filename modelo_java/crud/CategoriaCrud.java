package crud;

import jakarta.persistence.EntityManager;
import modelo.Categoria;

public class CategoriaCrud extends CrudGenerico<Categoria> {
    public CategoriaCrud(EntityManager em) {
        super(em, Categoria.class);
    }
}