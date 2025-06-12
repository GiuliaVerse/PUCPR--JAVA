package crud;

import jakarta.persistence.EntityManager;
import java.util.List;

public class CrudGenerico<T> {
    protected EntityManager em;
    private Class<T> clazz;

    public CrudGenerico(EntityManager em, Class<T> clazz) {
        this.em = em;
        this.clazz = clazz;
    }

    public void inserir(T entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
        em.getTransaction().commit();
    }

    public T buscar(Long id) {
        return em.find(clazz, id);
    }

    public List<T> listarTodos() {
        return em.createQuery("FROM " + clazz.getSimpleName() + " t", clazz).getResultList();
    }

    public void atualizar(T entidade) {
        em.getTransaction().begin();
        em.merge(entidade);
        em.getTransaction().commit();
    }

    public void remover(T entidade) {
        em.getTransaction().begin();
        em.remove(em.contains(entidade) ? entidade : em.merge(entidade));
        em.getTransaction().commit();
    }
}