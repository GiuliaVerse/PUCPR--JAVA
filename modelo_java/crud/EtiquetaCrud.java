package crud;

import jakarta.persistence.EntityManager;
import modelo.Etiqueta;

public class EtiquetaCrud extends CrudGenerico<Etiqueta> {
    public EtiquetaCrud(EntityManager em) {
        super(em, Etiqueta.class);
    }
}