package crud;

import jakarta.persistence.EntityManager;
import modelo.Notificacao;

public class NotificacaoCrud extends CrudGenerico<Notificacao> {
    public NotificacaoCrud(EntityManager em) {
        super(em, Notificacao.class);
    }
}