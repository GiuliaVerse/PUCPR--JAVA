package crud;

import jakarta.persistence.EntityManager;
import modelo.Usuario;

public class UsuarioCrud extends CrudGenerico<Usuario> {
    public UsuarioCrud(EntityManager em) {
        super(em, Usuario.class);
    }
}